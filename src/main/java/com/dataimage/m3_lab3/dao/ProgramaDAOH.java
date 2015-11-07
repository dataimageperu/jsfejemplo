package com.dataimage.m3_lab3.dao;

import com.dataimage.m3_lab3.model.Programa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository("programaDAO")
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO {

    @Override
    public List<Programa> list() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    @Override
    public Programa get(Programa t) {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", t.getId()));
        return (Programa) criteria.uniqueResult();
    }

    @Override
    public void save(Programa t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Programa t) {
        this.getSession().update(t);
    }

    @Override
    public void delete(Programa t) {
        this.getSession().delete(t);
    }

}
