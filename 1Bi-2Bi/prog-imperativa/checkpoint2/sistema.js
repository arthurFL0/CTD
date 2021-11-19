
// "O objeto do arquivo padrao é importado para esse arquivo como um módulo "modo". No objeto está contido métodos(pipoca,carne..etc) que verificarão o tempo selecionado e retornarão
// mensages específicas dependendo da quantidade de tempo."

const modo = require('./padrao')


// "A função "ondas" contém um switch que irá distinguir qual caso/modo deverá ser acionado. P,M,C,F e B correspondem aos modos de Pipoca, Macarrão ...etc
// que são chamados no parâmetro da função. ex: ondas(10,'P'), o parâmetro "P" indicará que o case 'P' deve ser acionado.

function ondas(tempo,padrao) {

    switch (padrao) 
    {
        case 'P' : console.log(modo.pipoca(tempo));
        break;
        case 'M' : console.log(modo.macarrao(tempo));
        break;
        case 'C' : console.log(modo.carne(tempo));
        break;
        case 'F' : console.log(modo.feijao(tempo));
        break;
        case 'B' : console.log(modo.brigadeiro(tempo));
        break;
        default : console.log('Prato inexistente.')

    }

} 




ondas(32,'F')
