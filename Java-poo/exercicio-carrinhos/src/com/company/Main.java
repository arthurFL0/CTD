package com.company;

public class Main {

    public static void main(String[] args) {
        Carrinho carrito = new Carrinho();
        Produto betoneira = new Produto();
        betoneira.setNome("betao a betoneira");

        carrito.retorneEstado();
        carrito.proximoEstado();
        carrito.adicionarProdutos(betoneira);
        System.out.println(carrito.getLista_de_produtos().get(0));
        carrito.cancelarCarrinho();
        System.out.println(carrito.getLista_de_produtos());

   }
}
