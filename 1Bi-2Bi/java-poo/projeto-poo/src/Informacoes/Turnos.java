package Informacoes;

public enum Turnos {
    M("Manhã"), T("Tarde"), N("Noite");

    private final String valor1;

     Turnos(String i) {
       valor1 = i;
    }

    public String getValor1() {
        return valor1;
    }
}
