package com.company;

public class Pagando implements Estado{
    private Carrinho carrinho;

    public Pagando(Carrinho c) {
        this.carrinho = c;

    }

    @Override
    public void adicionarProduto(Produto p) {
            System.out.println("Retorne uma etapa para adicionar produtos");
    }

    @Override
    public void cancelarCarrinho() {
            carrinho.getLista_de_produtos().clear();
            carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retorneEstado() {
            carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
    }
}
