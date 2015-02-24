package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;
import javax.swing.JFrame;
import kirjoneulegeneraattori.Malli;

/*
 Tämä hiirenkuuntelija värittää valitun mallitaulukon solun halutulla värillä.
 */
public class Taulukkokuuntelija implements MouseListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;

    private Malli malli;

    public Color valittuvari;

    public Taulukkokuuntelija(Kayttoliittyma kayttis, JFrame frame, Malli malli) {
        this.kayttis = kayttis;
        this.frame = frame;
        this.malli = malli;
      
        

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("a");
        this.valittuvari=kayttis.haeValittuvari();
        for (int i = 0; i < malli.Korkeus(); i++) {
            for (int j = 0; j < malli.Leveys(); j++) {
                if (20 * (j + 1) < x && x < 20 * (j + 2) && 20 * (i + 1) < y && y < 20 * (i + 2)) {
                    malli.varitaRuutu(i, j, valittuvari);
                }
            }
        }
        kayttis.paivita();
        // throw new UnsupportedOperationException("Virhe taulukkokuuntelijan luupissa");
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Virhe mouse pressed.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("virhe mouse released.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        int x = e.getX();
        //throw new UnsupportedOperationException("Virhe mouse enter.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Virhe mouse exited.");
    }
}
