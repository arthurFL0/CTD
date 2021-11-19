package com.company;

public class Main {
    //Exercicio sincrono aula 01 / Padrao de design facade
    //Eu entendi que era para fingir que existe um mecanismo de busca


    public static void main(String[] args) {
    FacadeBuscador facadeBuscador = new FacadeBuscador();
    facadeBuscador.buscaGeral("Nova Friburgo", "29-01-2022");
    }
}
