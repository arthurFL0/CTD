// 1) Crie uma variável produtos, que contenha um array de objetos, com no
// mínimo 3 itens. Dentro da variável, liste produtos disponíveis, informando os
// seguintes detalhes: Nome do Produto, Valor do Produto, Qualidade do
// Produto e Status.
// A informação Qualidade do Produto deve ser um número que irá de 0 a 10.
// A informação Status deve ser um Booleano, indicando se o produto está
// disponível em estoque.


var produtos = [

{ nome_do_Produto: "Playstation 5", valor_do_produto: 6000, qualidade_do_produto: 10, status: false },
{ nome_do_Produto: "Air Fryer", valor_do_produto: 600, qualidade_do_produto: 10, status: true },
{ nome_do_Produto: "Bicicleta", valor_do_produto: 700, qualidade_do_produto: 10, status: true },
{ nome_do_Produto: "Saxophone", valor_do_produto: 3000, qualidade_do_produto: 10, status: true },
{ nome_do_Produto: "Berimbau", valor_do_produto: 500, qualidade_do_produto: 10, status: true },


]


// 2) Em seguida, um usuário deseja filtrar os produtos, com base em alguns
// critérios. Selecione todos os produtos que tenham:
// Valor entre 482 e 1600;
// Qualidade superior a 60(ou 6 ne);
// Status como disponível.
// O resultado do filtro deve ser armazenado na variável carrinho.

let carrinho = produtos.filter(function(produtos){  
       return (produtos.valor_do_produto >=482  && produtos.valor_do_produto <= 1600) && (produtos.qualidade_do_produto >= 6)
       && (produtos.status = true)
})

// 3) Por fim, é necessário exibir todos os itens presentes no carrinho, com seus
// nomes e preços correspondentes, e no final um valor total, resultante da
// somatória de todos os produtos.



carrinho.forEach(function(carrinho){
        console.log("Nome: "+carrinho.nome_do_Produto)
        console.log("Preço: "+carrinho.valor_do_produto)
        console.log("-------------------")
})

const total = carrinho.reduce(function(acumulador,produto){
      return acumulador + produto.valor_do_produto
    
},0)


console.log("Total da compra: ",total);