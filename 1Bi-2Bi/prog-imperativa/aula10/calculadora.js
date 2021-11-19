const tabuada = require('../aula10/tabuada');

const operacoes = require('../aula10/operacoes')


function calcula(a,b,acao)
{
    switch (acao)
    {
        case '+': console.log(operacoes.soma(a,b));
        break;
        case '-': console.log(operacoes.subtracao(a,b));
        break;
        case '/': console.log(operacoes.divisao(a,b));
        break;
        case '*': console.log(operacoes.multiplicacao(a,b));
        break;
        case 't': tabuada(a);
        break;
    }
}

calcula(2,4,'+');