package com.springSprint.spring_mvc_application_sprint.Controllers;

import com.springSprint.spring_mvc_application_sprint.Model.Profissional;
import com.springSprint.spring_mvc_application_sprint.Service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroProfissionalController {


    @Autowired
    private ProfissionalService profissionalService;


    @GetMapping("/IndexProfissional") // Rota inicial do Profissional
    public String indexEnergia(Model model) {
        model.addAttribute("listProfissional", profissionalService.getallProfissional());
        return "cadastrarProfissional";
    }

    @GetMapping("/showProfissionalForm")
    public String showProfissionalForm(Model model) {
        Profissional profissional = new Profissional();
        model.addAttribute("profissional", profissional);
        return "novo_profissional";
    }

    @PostMapping("/saveProfissional")
    public String saveProfissional(@ModelAttribute("profissional") Profissional profissional) {
        profissionalService.saveProfissional(profissional);
        return "redirect:/IndexProfissional";
    }

    @GetMapping("/UpdateFuncionario/{id}")
    public String MostrarFormUpdate(@PathVariable(value = "id") Long id, Model model){
        Profissional profissional = profissionalService.getProfissionalById(id);
        model.addAttribute("profissional", profissional);
        return "update_profissional";
    }

    @GetMapping("/DeletarProfissional/{id}")
    public String DeletarProfissional(@PathVariable(value = "id") Long id){
        this.profissionalService.DeletarProfissionalporId(id);
        return "redirect:/IndexProfissional";
    }
}