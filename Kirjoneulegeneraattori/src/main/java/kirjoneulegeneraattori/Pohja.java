package kirjoneulegeneraattori;

import java.util.Scanner;
/*
 Pohja on ruuduista koostuva taulukko.
 */

public class Pohja {

    private int korkeus;
    private int leveys;
    private Ruutu[][] pohja;

    /**
     * Konstruktori luo valkoisista ruuduista taulukon.
     *
     * @param korkeus Pohjan korkeus
     * @param leveys Pohjan leveys
     * @throws Exception Rajoitetaan pohjan koko; max 100x100
     */
    public Pohja(int korkeus, int leveys) throws Exception {
        if (korkeus > 100 || korkeus < 1 || leveys > 100 || leveys < 1) {

            throw new Exception("Valitse korkeus väliltä 1-100.");
        } else {
            this.korkeus = korkeus;
            this.leveys = leveys;
            pohja = new Ruutu[korkeus][leveys];

            for (int nn = 0; nn < korkeus; nn++) {
                for (int mm = 0; mm < leveys; mm++) {
                    pohja[nn][mm] = new Ruutu();

                }
            }
        }
    }

    /**
     * Metodi hakee pohjan korkeuden.
     *
     * @return Pohjan korkeus
     */
    public int Korkeus() {
        return korkeus;
    }

    /**
     * Metodi hakee pohjan leveyden.
     *
     * @return Pohjan leveys
     */
    public int Leveys() {
        return leveys;
    }

    /**
     * Metodi etsii pohjasta halutun ruudun tiedot.
     *
     * @param m Halutun ruudun korkeuskoordinaatti
     * @param n Halutun ruudun leveyskoordinaatti
     * @return Halutun pohjan ruudun tiedot
     */
    public Ruutu hae(int m, int n) {
        if (m > this.korkeus - 1 || n > this.leveys - 1 || m < 0 || n < 0) {
            return null;
        } else {
            return pohja[m][n];
        }
    }

    /**
     * Metodi muuttaa pohjan leveyttä.
     *
     * @param leveys LKäyttäjän antama leveys
     */
    public void uusiLeveys(int leveys) {
        if (leveys < 100 && leveys > 0) {

            this.leveys = leveys;
        }
    }

    /**
     * Metodi muuttaa pohjan korkeutta.
     *
     * @param korkeus Käyttäjän antama korkeus
     */
    public void uusiKorkeus(int korkeus) {
        if (korkeus < 100 && korkeus > 0) {

            this.korkeus = korkeus;
        }
    }

    /**
     * Metodi muuttaa pohjaruudukon kokoa.
     *
     * @param korkeus Käyttäjän antama korkeus
     * @param leveys Käyttäjän antama leveys
     */
    public void uusiKoko(int korkeus, int leveys) {
        if (korkeus < 100 && korkeus > 0 && leveys < 100 && leveys > 0) {
            this.uusiKorkeus(korkeus);
            this.uusiLeveys(leveys);
        }
    }

}
