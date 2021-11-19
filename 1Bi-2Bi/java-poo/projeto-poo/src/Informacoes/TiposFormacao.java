package Informacoes;

public enum TiposFormacao {
    S("Superior"), PS("Pos-Graduação" ), E("Especialização"), M("Mestrado"), D("Doutorado");

    private final String valor1;

    TiposFormacao(String i) {
         valor1 = i;

    }

    public String getValor1() {

        return valor1;
    }


}
