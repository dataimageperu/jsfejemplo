package com.dataimage.m3_lab3.dao;

import com.dataimage.m3_lab3.model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {

    @Override
    public Usuario findByLogin(String usuario) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("username", usuario));
        criteria.add(Restrictions.eq("estado", "ACT"));
        return (Usuario) criteria.uniqueResult();
    }
}
