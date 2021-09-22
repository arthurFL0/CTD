package com.company;

public class Vazio implements Estado {

    private Carrinho carrinho;

    public Vazio(Carrinho c){
        this.carrinho = c;

    }


    @Override
    public void adicionarProduto(Produto p) {
            System.out.println("Vai para o proximo estado para adicionar Produtos");
    }

    @Override
    public void cancelarCarrinho() {
            carrinho.getLista_de_produtos().clear();
            carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retorneEstado() {
            System.out.println("Impossível retornar a um estado, Estado atual: Vazio");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
    }
}
