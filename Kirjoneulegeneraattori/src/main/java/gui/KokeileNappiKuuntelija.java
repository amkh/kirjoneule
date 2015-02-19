package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Malli;

/*
 Tämä kuuntelija avaa sivun, jolla kysytään neulepinnan kokoa.
 */
public class KokeileNappiKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;
    public Malli malli;

    public KokeileNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame, Malli malli) {

        this.kayttis = kayttis;
        this.frame = frame;
        this.malli = malli;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.luoKomponentitPinnanKysely(frame.getContentPane(), malli);
        frame.pack();
        frame.setVisible(true);

    }
}
