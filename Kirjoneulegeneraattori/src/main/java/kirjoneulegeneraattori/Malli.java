package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 Malli vastaa kirjoneulekaaviota, jolle on annettu nimi.
 */
public class Malli {

    private String nimi;
    private Pohja pohja;
    public Set<Color> varit;
    Scanner lukija = new Scanner(System.in);

    /**
     * Konstruktori luo malli-olion, joka on nimettyruudukko, jossa jokaisessa
     * solussa on muistissa solun väri. Värit ovat myös omassa listassaan.
     *
     * @param korkeus Mallin korkeus
     * @param leveys Mallin leveys
     * @param varit Mallin sisältämät värit
     */
    public Malli(int korkeus, int leveys, Set<Color> varit) {
        this.nimi = "malli";
        try {
            this.pohja = new Pohja(korkeus, leveys);
        } catch (Exception ex) {
            Logger.getLogger(Malli.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.varit = varit;

    }

    /**
     * Metodi palauttaa mallin nimen.
     *
     * @return Mallin nimi
     */
    public String nimi() {
        return nimi;
    }

    /**
     * Metodi vaihtaa mallin nimen.
     *
     * @param nimi Uusi nimi
     */
    public void vaihdaNimi(String nimi) {
     //   System.out.println("Anna uusi nimi: ");
        //    this.nimi=lukija.nextLine();
        //    System.out.println("Uusi nimi on:" + nimi);

        this.nimi = nimi;
    }

    /**
     * Metodi lisää värin listaan.
     *
     * @param vari Lisättävä väri
     */
    public void lisaaVari(Color vari) {
        this.varit.add(vari);

    }

    /**
     * Metodi poistaa värin listalta.
     *
     * @param vari Poistettava väri
     */
    public void poistaVari(Color vari) {
        if (this.varit.contains(vari)) {
            this.varit.remove(vari);
        }
    }

    /**
     * Metodi tarkistaa, onko väri listalla.
     *
     * @param vari Kysytty väri
     * @return true=väri listalla, false=ei ole
     */
    public boolean haeVari(Color vari) {
        if (this.varit.contains(vari)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * metodi palauttaa mallin korkeuden.
     *
     * @return Mallin korkeus
     */
    public int Korkeus() {
        return pohja.Korkeus();
    }

    /**
     * Metodi palauttaa mallin leveyden.
     *
     * @return Mallin leveys
     */
    public int Leveys() {
        return pohja.Leveys();
    }

    /**
     * Metodi etsii halutun ruudun tiedot
     *
     * @param n Ruudun korkeuskoordinaatti
     * @param m Ruudun leveyskoordinaatti
     * @return Haluttu ruutu
     */
    public Ruutu hae(int n, int m) {
        return pohja.hae(n, m);
    }

    /**
     * Metodi antaa ruudulle uuden värin, jos väri on listalla.
     *
     * @param n Ruudun korkeuskoordinaatti
     * @param m Ruudun leveyskoordinaatti
     * @param vari Haluttu väri
     */
    public void varitaRuutu(int n, int m, Color vari) {
        if (this.varit.contains(vari)) {
            pohja.hae(n, m).vaihdaVari(vari);
        }
    }


}
