package fabrica;

import veiculo.Carro;
import veiculo.luxo.CambioAutomatico;
import veiculo.luxo.MP3;

public class MontadoraCarroLuxo implements Montadora{
    @Override
    public Carro montar() {
        Carro carro = new Carro();
        carro.setSom(new MP3());
        carro.setCambio(new CambioAutomatico());
        return carro;
    }
}
