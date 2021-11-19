let frutas=['banana','maçã','mamão','morango','uva','melão','melancia','caqui','tomate']

// -1 é para começar do "10" e não do length real que é 11, assim o índice estaria de acordo com o indíce que vai começar a contagem, no caso 10="tomate"
for(let i=frutas.length-1; i>=0; i--){
    console.log(frutas[i]);
}