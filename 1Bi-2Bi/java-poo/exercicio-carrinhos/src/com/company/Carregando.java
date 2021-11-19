package com.company;

public class Carregando implements Estado{
    private Carrinho carrinho;

    public Carregando(Carrinho c){
        this.carrinho = c;

    }

    @Override
    public void adicionarProduto(Produto p) {
                carrinho.getLista_de_produtos().add(p);
    }

    @Override
    public void cancelarCarrinho() {
                carrinho.getLista_de_produtos().clear();
                carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retorneEstado() {
            carrinho.setEstado(new Vazio(carrinho));
            carrinho.getLista_de_produtos().clear();
    }

    @Override
    public void proximoEstado() {

    }
}
