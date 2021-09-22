package com.company;

public interface Estado {
    void adicionarProduto(Produto p);
    void cancelarCarrinho();
    void retorneEstado();
    void proximoEstado();

}
