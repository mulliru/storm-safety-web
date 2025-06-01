package com.springSprint.spring_mvc_application_sprint.Service;


import com.springSprint.spring_mvc_application_sprint.Model.Profissional;

import java.util.List;

public interface ProfissionalService {
    List<Profissional> getallProfissional();
    void saveProfissional(Profissional profissional);
    Profissional getProfissionalById(Long id);
    void DeletarProfissionalporId(Long id);
}
