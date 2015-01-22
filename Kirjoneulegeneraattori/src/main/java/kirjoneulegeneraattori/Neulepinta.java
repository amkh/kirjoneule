package kirjoneulegeneraattori;

public class Neulepinta {

    private Malli malli;
    private int korkeus;
    private int leveys;
    private Pohja pohja;

    public Neulepinta(Malli malli, int korkeus, int leveys) {
        
        if (korkeus > 10) {

            System.out.println("Valitse korkeus väliltä 1-10.");
             return;
        } else if (korkeus < 1) {
            System.out.println("Valitse korkeus väliltä 1-10.");
            return;
        } else if (leveys > 10) {

            System.out.println("Valitse leveys väliltä 1-10.");
            return;

        } else if (leveys < 1) {
            System.out.println("Valitse leveys väliltä 1-10.");
            return;
        } else {
            int malliKorkeus = malli.Korkeus();
            int malliLeveys = malli.Leveys();
            int k = malliKorkeus * korkeus;
            int l = malliLeveys * leveys;

            this.pohja = new Pohja(k, l);

            for (int mm = 0; mm <  (k - malliKorkeus); mm = mm + malliKorkeus) {
                for (int nn = 0; nn < (l - malliLeveys); nn = nn + malliLeveys) {
                    for (int m = 0; m < (malliKorkeus - 1); m++) {
                        for (int n = 0; n < (malliLeveys - 1); n++) {
                              this.pohja.hae(mm,nn).vaihdaVari(this.malli.hae(m,n).vari());
                              
                        }
                    }
                }
            }
        }


    }

    public void tulostaPinta() {

    }

}