package com.dataimage.m3_lab3.controllers.programa;

import com.dataimage.m3_lab3.model.Programa;
import java.util.List;

public interface ProgramaService {

    List<Programa> listPrograma();

    Programa get(Long id);

    void save(Programa programa);

    void delete(Programa programa);
}
