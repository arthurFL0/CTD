// Crie uma função construtora chamada Restaurante, que receba como parâmetros o nome do restaurante e o cardápio (que será um array de strings). 
// Após isso chame a função entrada() dentro do objeto, que irá trazer uma mensagem de boas-vindas, informando o nome do restaurante, e o cardápio.

function Restaurante(nome,cardapio){
    this.nome = nome;
    this.cardapio = [cardapio];
    this.entrada =  function () { return 'Seja bem vindo ao restaurante '+this.nome+'.'+' O cardápio de hoje é '+this.cardapio+'.'}
}


let callRestaurante = new Restaurante("California","Pizza","Massas variadas","Lasanha")

let restaurante2 = new Restaurante("Fausto's Kitchen",["Ovo","Ovo cozido","Ovo frito","Ovo e ovo"])

console.log(callRestaurante.entrada())
console.log(restaurante2.entrada())