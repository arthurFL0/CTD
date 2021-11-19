package com.example.ClinicaIntegradora.services.impl;

import com.example.ClinicaIntegradora.domain.Paciente;
import com.example.ClinicaIntegradora.services.PacienteService;

import java.util.ArrayList;
import java.util.List;

public class PacienteServiceImpl implements PacienteService {
    List<Paciente> pacientes = new ArrayList<>();
    @Override
    public List<Paciente> pacientes() {
        Paciente paciente = new Paciente("Arthur", "Ferreira");
        Paciente paciente1= new Paciente("Rafael", "Rodrigues");
        Paciente paciente2 = new Paciente("Matheus", "Augusto");
        Paciente paciente3= new Paciente("Matheus", "Silva");
        Paciente paciente4= new Paciente("Patricia", "Ruffino");


        pacientes.add(paciente);
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);

        return pacientes;

    }

    public void salvar(Paciente p){
        pacientes.add(p);
    }

}
