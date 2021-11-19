import Elementos.ListaMusica;

public class Sistema {
    public static void main(String[] args) {
        ListaMusica lista1 = new ListaMusica("Lista1");
        ListaMusica lista2 = new ListaMusica("Lista2");
        MusicaFabrica musicfactory = new MusicaFabrica();

        lista1.addMusicaLista(musicfactory.getMusica("Solitude is Bliss","Tame Impala","Rock"));
        lista2.addMusicaLista(musicfactory.getMusica("Solitude is Bliss","Tame Impala","Rock"));
    }
}
