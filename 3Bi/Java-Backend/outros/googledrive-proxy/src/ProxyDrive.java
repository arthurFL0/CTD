import java.util.ArrayList;

public class ProxyDrive {
    private DriveService driveservice;
    private ArrayList<String> acessos;

    public ProxyDrive(DriveService driveservice) {
        this.driveservice = driveservice;
    }

    public void puxarDoc(String url, String email){

    }
}
