// crie um script que permita adicionar uma sequência de números (um array de números) 
// consecutivamente para receber as notas dos 4 bimestres. Após isso, crie uma estrutura na qual todos os números do array sejam somados sequencialmente: 
// o primeiro número seja somado ao segundo e o resultado seja impresso no console.
// Então, temos que pegar esse resultado e adicionar o terceiro número a ele, e assim por diante, até terminarmos de percorrer o array. 
// Seguindo a lógica do exemplo a seguir:

// Método for

let notas = [2,4,5,6]
let soma = 0

for(let i=0; i < notas.length;i++)
{
    soma += notas[i];
    console.log(soma);
}

let media = soma/notas.length
console.log("A sua média foi:"+" "+media)

// -----------------------
// Método forEach

// function somarNotas(array_notas){
//     let soma = 0
//     array_notas.forEach(element => {
//         soma += element
//         console.log(soma)
//     });
// }

// somarNotas(notas)
// --------------------

// Mostrando as notas de cada bimestre
// O "indice" é um dos tres argumentos "nativos" da callback que o método forEach recebe, assim como o argumento "nota".
// Como o indice do array começa do 0, é preciso somar +1.

notas.forEach((nota,indice)=> {console.log("A sua nota do bimestre"+" "+(indice+ 1)+" "+"foi"+" "+nota)})

// Aprovação
if(media>7){
    console.log("Parabéns! Voçê foi aprovado!")
}
else{
    console.log("A sua nota não foi suficiente para a aprovação.")
}
// Mesmo resultado, só que com if ternário:
// (media < 7) ? console.log("Parabéns! Voçê foi aprovado!") : console.log("A sua nota não foi suficiente para a aprovação.")