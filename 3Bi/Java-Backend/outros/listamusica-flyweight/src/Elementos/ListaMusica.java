package Elementos;

import java.util.ArrayList;

public class ListaMusica {
    private String nome;
    private ArrayList<Musica> musicas = new ArrayList<>();

    public ListaMusica(String nome) {
        this.nome = nome;
    }

    public void addMusicaLista(Musica m){
        musicas.add(m);
    }

}
