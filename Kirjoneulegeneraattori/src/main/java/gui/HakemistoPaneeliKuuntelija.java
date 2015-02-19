package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 Tämä kuuntelija avaa valitun mallin tarkasteltavaksi tai muokattavaksi.
 */
public class HakemistoPaneeliKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;

    public HakemistoPaneeliKuuntelija(Kayttoliittyma kayttis, JFrame frame) {
        this.kayttis = kayttis;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.luoKomponentitMallinTeko(frame.getContentPane(), kayttis.hakemistopaneeli.valittuMalli());
        frame.pack();
        frame.setVisible(true);

    }
}
