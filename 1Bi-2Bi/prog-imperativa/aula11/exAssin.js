


// 1) Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.

let pares = [2,4,6,8]

 let impar = pares.map(function(numb) {
    return numb + 1;
});

console.log(impar)

// 2) Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria

let nomes = ["Julia","Maria","Maria","Pedro"]

let marias =  nomes.filter(function(nome) {
    return nome === "Maria"
}); 

console.log(marias)

// 3) Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.

let numeros = [32,4,766,1,10]

console.log(numeros.reduce((acummulador,atual)=>acummulador+'-'+atual))

// 4) Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.

let animais = ["coelho","cavalo","gato","cachorro"]

let frase = animais.forEach(function(animal) {
    console.log("O animal é o "+animal+" .")
});