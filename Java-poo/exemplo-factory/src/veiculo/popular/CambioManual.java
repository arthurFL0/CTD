package veiculo.popular;

import veiculo.SistemaCambio;

public class CambioManual implements SistemaCambio {
    @Override
    public void trocarMarcha() {
        System.out.println("TROCANDO A MARCHA DE FORMA MANUAL");
    }
}
