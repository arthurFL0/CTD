public class IP {
    private int[] nro = new int[4];

    public IP(int n0, int n1, int n2, int n3) {
        this.nro[0] = n0;
        this.nro[1] = n1;
        this.nro[2] = n2;
        this.nro[3] = n3;
    }

    @Override
    public String toString() {
        return "IP{" + this.nro[0] + "." + this.nro[1] + "." + this.nro[2] + "." + this.nro[3] + "}";
    }

    String getPais() {
        int ip = nro[0];
        String pais = "";
        if (ip <= 49) {
            pais = "argentina";
        }if ((ip) <= 99 && (ip >= 50)) {
            pais = "brasil";
        }else {
            pais = "colombia";
        }
        return pais;
    }
}


