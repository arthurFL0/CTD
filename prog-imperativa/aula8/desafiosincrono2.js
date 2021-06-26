// Crie o objeto de aluno, que consistirá nas seguintes propriedades básicas:

// Nome
// Número do arquivo
// Lista de notas
// Gostaríamos de calcular a média do aluno e se o aluno foi aprovado com base na nota de aprovação que será dada. Para este exercício, vamos deixar você pensar sobre todos os métodos e propriedades que podem ser necessários para que nosso programa funcione corretamente da maneira solicitada.

// A média será 7


var total= 0
// função para calcular a média
function media (lista_notas) {
    for (var i = 0; i < lista_notas.lenght; i++){
        total += lista_notas[i]
  }
}

// O método desse objeto deveria retornar a função media e  dividir pelo tamanho da array assim conseguido a média das notas.
let aluno = {
    nome: 'Arthur',
    numero_arquivo: 22,
    lista_notas: [5,7,6,9],
    media_aluno: function() {return media(...lista_notas)/lista_notas.lenght}
   
}

console.log(aluno.media_aluno())
