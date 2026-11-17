package kabinet;

import kabinet.oprema.SkolskiRacunar;
import kabinet.oprema.StanjeOpreme;

public class InformatickiKabinet {
    private SkolskiRacunar[] oprema;
    public InformatickiKabinet(SkolskiRacunar[] niz){
        if(niz!=null){
            this.oprema = niz;
        }
        else{
            this.oprema = new SkolskiRacunar[20];
        }
    }


    public SkolskiRacunar[] izdvojiZaVezbu(int najmanjeGB){

        int brojac=0;

        for (int i = 0; i < oprema.length; i++) {
            if(oprema[i]!=null && oprema[i].getMemorijaGB()>=najmanjeGB && oprema[i].getStanjeOpreme() == StanjeOpreme.SLOBODAN){
                brojac++;
            }
        }
        if(brojac==0){
            SkolskiRacunar[] sr = new SkolskiRacunar[0];
            return sr;
        }
        int n=0;
        SkolskiRacunar[] niz = new SkolskiRacunar[brojac];
        for (int i = 0; i < oprema.length; i++) {
            if(oprema[i]!=null && oprema[i].getMemorijaGB()>=najmanjeGB && oprema[i].getStanjeOpreme() == StanjeOpreme.SLOBODAN){
                niz[n] = oprema[i];
                n++;
            }
        }
        return niz;
    }
    public int najveciInventarskiBroj(){
        int max = -999999999;

        for (int i = 0; i < oprema.length; i++) {
            if(oprema[i]!=null && oprema[i].getInventarskiBroj()!=null && oprema[i].getInventarskiBroj().length()>=3){
                String[] niz = new String[2];
                niz=oprema[i].getInventarskiBroj().split("-");
                int tmax = Integer.parseInt(niz[1]);
                if(tmax>max){
                    max = tmax;
                }
            }
        }

        return max;
    }
}
