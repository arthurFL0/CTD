package com.example.ClinicaIntegradora.controller;

import com.example.ClinicaIntegradora.domain.Paciente;
import com.example.ClinicaIntegradora.services.PacienteService;
import com.example.ClinicaIntegradora.services.impl.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PacienteController {

  PacienteService pacienteService = new PacienteServiceImpl();

  @GetMapping("/index")
    public String ola(Model model){
    List<Paciente> lista = pacienteService.pacientes();
    for (int i = 0; i < lista.size(); i++){
      model.addAttribute("nome"+(i),lista.get(i).getNome()+" "+lista.get(i).getSobrenome());
    }
    return "index";
  }

  @PostMapping("/cadastrar")
  public String cadastrar(Paciente paciente) {
    pacienteService.salvar(paciente);
    return "redirect:index";

  }
}
