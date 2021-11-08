package com.company;

public class FacadeBuscador implements IBuscador {
    private BuscaVoos buscaVoo;
    private BuscaHotel buscaHotel;

    public FacadeBuscador(){
        buscaVoo = new BuscaVoos();
        buscaHotel= new BuscaHotel();
    }

    public void buscaGeral(String cidade, String data) {
        buscaVoo.busca(cidade, data);
        buscaHotel.busca(cidade, data);
    }
}
