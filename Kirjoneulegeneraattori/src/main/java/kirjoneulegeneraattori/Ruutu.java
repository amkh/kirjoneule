package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.Scanner;

/*
 *Ruutu vastaa yhtä silmukkaa neulemallissa: siihen liittyy väri, joka 
 *näkyy väritettynä neliönä valmiissa mallissa.
 */
public class Ruutu {

    private Color vari;
    Scanner lukija = new Scanner(System.in);

    /**
     * Luokka luo yhden ruutuolion, jonka oletusväri on valkoinen.
     */
    public Ruutu() {
        this.vari = Color.WHITE;
    }

    /**
     * Metodi kertoo ruudun värin.
     *
     * @return ruudun väri
     */
    public Color vari() {
        return vari;
    }

    /**
     * Metodi vaihtaa ruudun värin.
     *
     * @param vari Käyttäjän antama uusi väri
     */
    public void vaihdaVari(Color vari) {
        this.vari = vari;

    }
}
