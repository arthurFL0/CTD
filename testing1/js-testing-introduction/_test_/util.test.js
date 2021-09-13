const { validateInput, createElement, generateText } = require('../util.js');

describe('Validate functions',() =>{
    test('Validate Input function text', () =>{
        const ret = validateInput('texto');
        expect(ret).toBeTruthy();
    });
    test('Validate Input function empty', () =>{
        const ret = validateInput();
        expect(ret).toBeFalsy();
    });
    test('Validate Input function number', () =>{
        const ret = validateInput(null,true,false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text empty', () =>{
        const ret = validateInput(" ",true,false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text NaN', () =>{
        const ret = validateInput(NaN,false,true);
        expect(ret).toBeFalsy();
    });
})

describe('Validate Create element',() => {
    test('Create new element with data', () => {
        const element = createElement('li', "exampleElement", 'user-item');
        expect(element.textContent).toMatch(/exampleElement/);
    });
    test('Create new element without data', () => {
        const element = createElement(null);
        expect(element.textContent).toBe("");
    });
})



/* Com o describe é criado uma suite de testes
com o nome de "teste de saida de dados" */

describe('Teste de saída de dados', () => {

        /* Teste e it são dois termos marcados e funções aonde
         os testes são definidos */

        test('Saida de nome e idade', () => {
            const text = generateText('Houser' , 30);
            expect(text).toBe('Houser (30 years old)');
        });

        it('Saída com dados vazios', () =>{
            const text = generateText('', null);
            expect(test).toBe(' (null years old)');
        });

        test('Saída sem dados', () => {
            const text =generateText();
            expect(text).toBe('undefined (undefined years old)')
        })
})


// const { generateText, validateInput, createElement } = require('../util.js');

// describe('Testes de saída de dados', () => {
//     test('Saída com dados', () =>{
//         const text = generateText('Houser',30);
//         expect(text).toBe('Houser (30 years old)');
//     });
      
//     test('Saída com dados vazios', () =>{
//         const text = generateText('',null);
//         expect(text).toBe(' (null years old)');    
//     });
    
//     test('Saída sem dados', () =>{
//         const text = generateText();
//         expect(text).toBe('undefined (undefined years old)');    
//     });
// })