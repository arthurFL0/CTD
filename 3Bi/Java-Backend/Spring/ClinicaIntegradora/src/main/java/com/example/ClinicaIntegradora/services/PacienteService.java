package com.example.ClinicaIntegradora.services;

import com.example.ClinicaIntegradora.domain.Paciente;

import java.util.List;

public interface PacienteService {
    List<Paciente> pacientes();


    void salvar(Paciente paciente);
    }
