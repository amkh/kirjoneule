package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Malli;

/*
 Tämä kuuntelija avaa valitun mallin tarkasteltavaksi tai muokattavaksi.
 */
public class HakemistoPaneeliKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;
    public Malli malli;

    public HakemistoPaneeliKuuntelija(Kayttoliittyma kayttis, JFrame frame) {
        this.kayttis = kayttis;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        malli=kayttis.hakemistopaneeli.valittuMalli();
        kayttis.luoKomponentitMallinTeko(frame.getContentPane(), malli);
        frame.pack();
        frame.setVisible(true);

    }
}
