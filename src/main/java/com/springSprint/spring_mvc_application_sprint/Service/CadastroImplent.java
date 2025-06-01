package com.springSprint.spring_mvc_application_sprint.Service;

import com.springSprint.spring_mvc_application_sprint.Model.Cadastro;
import com.springSprint.spring_mvc_application_sprint.Repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroImplent implements CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public List<Cadastro> getallCadastro() {
        return cadastroRepository.findAll();
    }

    @Override
    public void saveCadastro(Cadastro cadastro) {
        this.cadastroRepository.save(cadastro);
    }

    @Override
    public Cadastro getCadastroById(Long id) {
        Optional<Cadastro> optional = cadastroRepository.findById(id);
        Cadastro cadastro = null;
        if(optional.isPresent()){
            cadastro = optional.get();
        }else{
            throw new RuntimeException("cadastro não foi encontrado ::" + id);
        }
        return cadastro;
    }

    @Override
    public void DeletarCadastroporId(Long id) {
        this.cadastroRepository.deleteById(id);
    }

}
