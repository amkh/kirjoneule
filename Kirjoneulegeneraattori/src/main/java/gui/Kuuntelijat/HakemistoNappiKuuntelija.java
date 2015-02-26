package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 Tämä nappikuuntelija luo hakemistosivun.
 */
public class HakemistoNappiKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;

    public HakemistoNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame) {
        this.kayttis = kayttis;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        kayttis.LuoKomponentitHakemisto(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
}
