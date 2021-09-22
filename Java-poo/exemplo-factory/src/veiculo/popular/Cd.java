package veiculo.popular;

import veiculo.SistemaSom;

public class Cd implements SistemaSom {

    @Override
    public void tocar() {
        System.out.println("TOCANDO O CD");
    }
}
