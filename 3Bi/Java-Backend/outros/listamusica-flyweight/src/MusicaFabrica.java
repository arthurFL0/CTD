
import Elementos.Musica;

import java.util.HashMap;

public class MusicaFabrica {
    private HashMap<String, Musica> musicaCache = new HashMap<>();

    public Musica getMusica(String valor1, String valor2, String valor3){
        Musica musicaGuardada;
        if(musicaCache != null && musicaCache.containsKey(valor1)){
            musicaGuardada = musicaCache.get(valor1);
            System.out.println("Foi retirada do cache a musica"+" "+valor1);
        }
        else{
            musicaGuardada = new Musica(valor1,valor2,valor3);
            musicaCache.put(valor1,musicaGuardada);
            System.out.println("Foi criado a musica"+" "+valor1);
        }
        return musicaGuardada;
    }
}
