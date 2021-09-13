const { generateText } = require('../util.js');

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