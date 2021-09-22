package fabrica;

import veiculo.Carro;
import veiculo.luxo.CambioAutomatico;
import veiculo.luxo.MP3;
import veiculo.popular.CambioManual;
import veiculo.popular.Cd;

public class MontadoraCarroPopular implements Montadora{
    @Override
    public Carro montar() {
        Carro carro = new Carro();
        carro.setSom(new Cd());
        carro.setCambio(new CambioManual());
        return carro;
    }
}
