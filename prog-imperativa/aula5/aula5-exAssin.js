let produtos=["café","feijão","arroz","macarrão"]

console.log("A array original é a", produtos);

produtos.pop();
console.log("O último elemento foi removido da array", produtos);

produtos.push("macarrão");
console.log("O elemento macarrão foi adicionado no último índice da array",produtos);

produtos.shift()
console.log("O elemento no índice 0 foi removido", produtos);

produtos.unshift("café")
console.log("Foi colocado no índice 0 o elemento café", produtos);

