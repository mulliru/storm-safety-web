package com.springSprint.spring_mvc_application_sprint.Service;

import com.springSprint.spring_mvc_application_sprint.Model.Cadastro;

import java.util.List;

public interface CadastroService {
    List<Cadastro> getallCadastro();
    void saveCadastro(Cadastro cadastro);
    Cadastro getCadastroById(Long id);
    void DeletarCadastroporId(Long id);
}
