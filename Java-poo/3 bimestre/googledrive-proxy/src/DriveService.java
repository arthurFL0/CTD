import java.util.ArrayList;
import java.util.List;

public class DriveService {
    private List documentos;

    public DriveService() {
        this.documentos = new ArrayList<Documento>();
    }

    public void adicionarDoc(Documento doc) {
        this.documentos.add(doc);
    }
}
