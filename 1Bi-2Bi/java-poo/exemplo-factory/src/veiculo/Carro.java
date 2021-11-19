package veiculo;

public class Carro {
    private SistemaSom som;
    private SistemaCambio cambio;

    public SistemaSom getSom() {
        return som;
    }

    public void setSom(SistemaSom som) {
        this.som = som;
    }

    public SistemaCambio getCambio() {
        return cambio;
    }

    public void setCambio(SistemaCambio cambio) {
        this.cambio = cambio;
    }
}
