package com.company;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> lista_de_produtos = new ArrayList<>();
    private Estado estado;

    public Carrinho(){
        this.setEstado(new Vazio(this));
    }


    public ArrayList<Produto> getLista_de_produtos() {
        return lista_de_produtos;
    }

    public void setLista_de_produtos(ArrayList<Produto> lista_de_produtos) {
        this.lista_de_produtos = lista_de_produtos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void adicionarProdutos(Produto p){
        getEstado().adicionarProduto(p);
    }

    public void proximoEstado(){
        getEstado().proximoEstado();
    }

    public void retorneEstado(){
        getEstado().retorneEstado();
    }

    public void cancelarCarrinho(){
        getEstado().cancelarCarrinho();
    }
}
