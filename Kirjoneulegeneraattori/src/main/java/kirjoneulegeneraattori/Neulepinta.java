package kirjoneulegeneraattori;
/*
 Neulepinnan avulla mallia voi testata suuremmassa koossa.
 */

public class Neulepinta {

    private Malli malli;
    private int korkeus;
    private int leveys;
    private Pohja pohja;

    /**
     * Konstruktori kopioi mallia halutun kokoiseksi pinnaksi.
     *
     * @param malli Testattava malli
     * @param korkeus Haluttu pinnan korkeus
     * @param leveys Haluttu pinnan leveys
     * @throws Exception Pohjan koko on rajoitettu; max 100x100
     */
    public Neulepinta(Malli malli, int korkeus, int leveys) {

        //if (korkeus > 10 || korkeus < 1 || leveys > 10 || leveys < 1) {
        //throw new Exception("Valitse korkeus väliltä 1-10.");
        this.korkeus = korkeus;
        this.leveys = leveys;
        this.malli = malli;
        int malliKorkeus = this.malli.Korkeus();
        int malliLeveys = this.malli.Leveys();

        int k = malliKorkeus * korkeus;
        int l = malliLeveys * leveys;

        try {
            this.pohja = new Pohja(k, l);

            for (int mm = 0; mm <= (k - malliKorkeus); mm = mm + malliKorkeus) {
                for (int nn = 0; nn <= (l - malliLeveys); nn = nn + malliLeveys) {
                    for (int m = 0; m < malliKorkeus; m++) {
                        for (int n = 0; n < malliLeveys; n++) {
                            this.pohja.hae(mm + m, nn + n).vaihdaVari(this.malli.hae(m, n).vari());

                        }
                    }
                }
            }

        } catch (Exception ex) {

        }

    }

    /**
     * Metodi hakee halutun ruudun tiedot
     *
     * @param korkeus Ruudun korkeuskoordinaatti
     * @param leveys Ruudun leveyskoordinaatti
     * @return Haluttu ruutu
     */
    public Ruutu hae(int korkeus, int leveys) {
        return this.pohja.hae(korkeus, leveys);
    }

    /**
     * metodi palauttaa pinnan korkeuden
     *
     * @return Pinnan korkeus
     */
    public int korkeus() {
        return this.pohja.Korkeus();

    }

    /**
     * Metodi palauttaa pinnan leveyden
     *
     * @return Pinnan leveys
     */
    public int leveys() {
        return this.pohja.Leveys();
    }
}
