package com.springSprint.spring_mvc_application_sprint.Service;

import com.springSprint.spring_mvc_application_sprint.Model.Profissional;
import com.springSprint.spring_mvc_application_sprint.Repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfissionalImplent implements ProfissionalService {
    @Autowired
    private ProfissionalRepository profissionalRepository;

    @Override
    public List<Profissional> getallProfissional() {
        return profissionalRepository.findAll();
    }

    @Override
    public void saveProfissional(Profissional profissional) {
        this.profissionalRepository.save(profissional);
    }

    @Override
    public Profissional getProfissionalById(Long id) {
        Optional<Profissional> optional = profissionalRepository.findById(id);
        Profissional profissional = null;
        if(optional.isPresent()){
            profissional = optional.get();
        }else{
            throw new RuntimeException("Profissional não foi encontrado ::" + id);
        }
        return profissional;
    }

    @Override
    public void DeletarProfissionalporId(Long id) {
        this.profissionalRepository.deleteById(id);
    }

}
