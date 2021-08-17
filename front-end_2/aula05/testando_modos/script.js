let nome = prompt('Insira seu nome');

// No modo 1 eu não uso o +=, pois dentro da tag <a> vai ser inserido a String armazenada na let nome
// já nos outros modos o resultado das document.query são praticamente juntadas ao conteúdo

// A maneiro não simplificada seria:
// document.querySelector('h1.bvindo2').innerText = document.querySelector('h1.bvindo2').innerText+" "+nome;


// Modo 1
document.querySelector('a.name').innerText = nome;

// Modo 2
document.querySelector('h1.bvindo2').innerText += " "+nome;

// Modo 3
document.querySelector('h1.bvindo3').innerHTML += " "+"<a>"+nome+"</a>";

// Nesse terceiro modo somente o innerHTML irá funcionar pois ele tratára o conteúdo como HTML
// se fosse o innerText, o conteúdo todo seria somente tratado como uma string, sem criar uma tag "<a>"