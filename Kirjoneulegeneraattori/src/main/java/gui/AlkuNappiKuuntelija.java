package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/*
 Tämä nappikuuntelija vastaa ohjelman etusivun toiminnasta.
 "Uusi malli" -nappia painettaessa aukeaa seuraavaksi mallin koon ja värien kyselyikkuna.
 "Hakemisto"-napista aukeaa hakemistosivu.
 */

public class AlkuNappiKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;

    public AlkuNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame) {

        this.kayttis = kayttis;
        this.frame = frame;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getActionCommand().equals("Uusi malli")){
        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.LuoKomponentitKyselyt(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
     if(ae.getActionCommand().equals("Hakemisto")){
          frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.LuoKomponentitHakemisto(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
     }
    }

}
