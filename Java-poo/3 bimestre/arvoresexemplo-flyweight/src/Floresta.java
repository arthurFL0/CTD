import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private List<ArvoreDTO> floresta = new ArrayList<ArvoreDTO>();

    public List<ArvoreDTO> getFloresta() {
        return floresta;
    }

    public void adicionarArvore(ArvoreDTO arvore){
        floresta.add(arvore);
    }

}
