package kabinet.oprema;

public class SkolskiRacunar {
    private String inventarskiBroj;
    private int memorijaGB;
    private StanjeOpreme stanjeOpreme;

    public String getInventarskiBroj() {
        return inventarskiBroj;
    }

    public void setInventarskiBroj(String inventarskiBroj) {
        if(inventarskiBroj!=null && inventarskiBroj.startsWith("R-") && inventarskiBroj.length()>=3){
            this.inventarskiBroj = inventarskiBroj;
        }
        else{
            System.out.println("greska");
        }

    }

    public int getMemorijaGB() {
        return memorijaGB;
    }

    public void setMemorijaGB(int memorijaGB) {
        if(memorijaGB>0){
            this.memorijaGB = memorijaGB;
        }
        else{
            System.out.println("greska");
        }

    }

    public StanjeOpreme getStanjeOpreme() {
        return stanjeOpreme;
    }

    public void setStanjeOpreme(StanjeOpreme stanjeOpreme) {
        if(stanjeOpreme!=null){
            this.stanjeOpreme = stanjeOpreme;
        }
        else{
            System.out.println("greska");
        }

    }

    @Override
    public String toString() {
        return "SkolskiRacunar{" +
                "inventarskiBroj='" + inventarskiBroj + '\'' +
                ", memorijaGB=" + memorijaGB +
                ", stanjeOpreme=" + stanjeOpreme +
                '}';
    }
}
