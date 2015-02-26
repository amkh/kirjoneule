package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Malli;
import kirjoneulegeneraattori.Neulepinta;

/*
 Tämä kuuntelija avaa sivun, jolla neulepinta näkyy ruudukkona.
 */
public class PinnanKyselyNappiKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;
    public Malli malli;

    public PinnanKyselyNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame, Malli malli) {

        this.kayttis = kayttis;
        this.frame = frame;
        this.malli = malli;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int mk = malli.Korkeus();
        int ml = malli.Leveys();
        try {
            Integer korkeus1 = Integer.parseInt(kayttis.korkeus.getText());
            Integer leveys1 = Integer.parseInt(kayttis.leveys.getText());
            if (korkeus1 == (int) korkeus1 && leveys1 == (int) leveys1 && korkeus1 > 0 && leveys1 > 0
                    && korkeus1 < 6 && leveys1 < 6) {
                Neulepinta pinta = new Neulepinta(malli, korkeus1, leveys1);

                frame = new JFrame("Kirjoneulegeneraattori");
                frame.setPreferredSize(new Dimension(20 * (mk * korkeus1), 20 * (ml * leveys1)));
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

                kayttis.luoKomponentitNeulepinta(frame.getContentPane(), pinta);
                frame.pack();
                frame.setBackground(Color.PINK);
                frame.setVisible(true);
            } else {
                kayttis.viestiMuutos("Anna kokonaisluku 1-5:");
            }
        } catch (Exception e) {
            kayttis.viestiMuutos("Anna kokonaisluku 1-5:");
        }
    }
}
