package com.dataimage.m3_lab3.controllers.programa;

import com.dataimage.m3_lab3.dao.ProgramaDAO;
import com.dataimage.m3_lab3.model.Programa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //spring lo convierte en bean
@Transactional
public class ProgramaServiceImp implements ProgramaService {

    @Autowired
    ProgramaDAO programaDAO;
    //se pueden implementar otros DAOs

    @Override
    public List<Programa> listPrograma() {
        return programaDAO.list();
    }

    @Override
    public Programa get(Long id) {
        return programaDAO.get(new Programa(id));
    }

    @Override
    public void save(Programa programa) {
        if (programa.getId() == null) {
            programaDAO.save(programa);
        } else {
            programaDAO.update(programa);
        }
    }

    @Override
    public void delete(Programa programa) {
        programaDAO.delete(programa);
    }
}
