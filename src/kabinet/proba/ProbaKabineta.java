package kabinet.proba;

import kabinet.InformatickiKabinet;
import kabinet.oprema.SkolskiRacunar;
import kabinet.oprema.StanjeOpreme;

public class ProbaKabineta {
    public static void main(String[] args) {
        SkolskiRacunar sr1 = new SkolskiRacunar();
        SkolskiRacunar sr2 = new SkolskiRacunar();
        SkolskiRacunar sr3 = new SkolskiRacunar();
        SkolskiRacunar sr4 = new SkolskiRacunar();

        sr1.setInventarskiBroj("R-101");
        sr1.setMemorijaGB(16);
        sr1.setStanjeOpreme(StanjeOpreme.SLOBODAN);

        sr2.setInventarskiBroj("R-102");
        sr2.setMemorijaGB(32);
        sr2.setStanjeOpreme(StanjeOpreme.ZAUZET);

        sr3.setInventarskiBroj("R-103");
        sr3.setMemorijaGB(8);
        sr3.setStanjeOpreme(StanjeOpreme.SLOBODAN);

        sr4.setInventarskiBroj("R-104");
        sr4.setMemorijaGB(32);
        sr4.setStanjeOpreme(StanjeOpreme.SLOBODAN);

        SkolskiRacunar[] niz = new SkolskiRacunar[5];
        niz[0] = sr1;
        niz[1] = sr2;
        niz[2] = null;
        niz[3] = sr3;
        niz[4] = sr4;

        InformatickiKabinet ik = new InformatickiKabinet(niz);
        SkolskiRacunar[] noviNiz;
        noviNiz=ik.izdvojiZaVezbu(16);
        for (int i = 0; i < noviNiz.length; i++) {
            System.out.println(noviNiz[i]);
        }
    }


}
