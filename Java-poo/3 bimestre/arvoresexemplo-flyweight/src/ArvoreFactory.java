import java.util.HashMap;

public class ArvoreFactory {
    private HashMap<String, ArvoreDTO> cachearvore = new HashMap<>();

    public ArvoreDTO verificador(String tipo){
        ArvoreDTO arvores;

        if(!cachearvore.containsKey(tipo)){
            arvores = new ArvoreDTO(tipo);
            cachearvore.put(tipo,arvores);
        }
        else{
            arvores = cachearvore.get(tipo);
        }

        return arvores;
    }
}
