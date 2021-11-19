
// "Os métodos desse objeto (pipoca,macarrao,feijao..etc) verificam o tempo recebido comparando-os com as diferentes condições que entragarão
// diferentes mensagens"



module.exports = {

    pipoca: function (tempo)
{
    if (tempo>=10 && tempo <=20){
        return "Prato pronto, bom apetite!"

    } else if (tempo<10){
        return " Faltam "+(10-tempo)+" segundo(s) para aquecer o prato."
        
    } else if(tempo>20 && tempo<=30){
        return "A comida queimou!"
        
    } else if (tempo>30) {
        return "Kabuum!"
    }
       

},

    macarrao: function (tempo)
{ 

    if (tempo>=8 && tempo <=16){
        return "Prato pronto, bom apetite!"

    } else if (tempo<8){
        return " Faltam "+(8-tempo)+" segundo(s) para aquecer o prato."

    } else if (tempo>16 && tempo<=24 ){
        return "A comida queimou!"

    } else if (tempo>24) {
        return "Kabuum!"
    }

},

    carne: function (tempo)
{ 

    if (tempo>=15 && tempo <=30){
        return "Prato pronto, bom apetite!"

    } else if (tempo<15){
        return " Faltam "+(15-tempo)+" segundo(s) para aquecer o prato."

    } else if (tempo>30 && tempo<=45 ){
        return "A comida queimou!"

    } else if (tempo>45) {
        return "Kabuum!"
    }

},

    feijao: function (tempo)
{ 

    if (tempo>=12 && tempo <=24){
        return "Prato pronto, bom apetite!"

    } else if (tempo<12){
        return " Faltam "+(12-tempo)+" segundo(s) para aquecer o prato."

    } else if (tempo>24 && tempo<=36 ){
        return "A comida queimou!"

    } else if (tempo>36) {
        return "Kabuum!"
    }

},

    brigadeiro: function (tempo)
{ 

        if (tempo>=8 && tempo <=16){
            return "Prato pronto, bom apetite!"
    
        } else if (tempo<8){
            return " Faltam "+(8-tempo)+" segundo(s) para aquecer o prato."
    
        } else if (tempo>16 && tempo<=24 ){
            return "A comida queimou!"
    
        } else if (tempo>24) {
            return "Kabuum!"
        }
    
},

}
