package veiculo.luxo;

import veiculo.SistemaCambio;

public class CambioAutomatico implements SistemaCambio {
    @Override
    public void trocarMarcha() {
        System.out.println("CAMBIO AUTOMATICO");
    }
}
