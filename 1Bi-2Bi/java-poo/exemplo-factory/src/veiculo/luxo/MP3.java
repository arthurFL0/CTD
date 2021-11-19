package veiculo.luxo;

import veiculo.SistemaSom;

public class MP3 implements SistemaSom {
    @Override
    public void tocar() {
        System.out.println("TOCANDO MP3");
    }
}
