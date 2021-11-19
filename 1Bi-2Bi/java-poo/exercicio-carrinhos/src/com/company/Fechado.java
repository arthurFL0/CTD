package com.company;

public class Fechado implements Estado{
    private Carrinho carrinho;

    public Fechado(Carrinho c) {
        this.carrinho = c;

    }



    @Override
    public void adicionarProduto(Produto p) {
                System.out.println("O carrinho está fechado");
    }

    @Override
    public void cancelarCarrinho() {
                carrinho.getLista_de_produtos().clear();
                carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retorneEstado() {
                System.out.println("O carrinho está fechado, não e possivel retornar.");
    }

    @Override
    public void proximoEstado() {
            carrinho.getLista_de_produtos().clear();
            carrinho.setEstado(new Vazio(carrinho));
    }
}
