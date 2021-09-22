package com.company;

public class TesteFabrica {

    public static void main(String[] args) {
         FabricaDeCarro fabrica = FabricaDeCarro.getINSTANCE();
         fabrica.criarCarroFord();
         fabrica.criarCarroFord();
         fabrica.criarCarroFord();
         fabrica.criarCarroFiat();

         System.out.println(fabrica.gerarRelatorio());
    }
}
