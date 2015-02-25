package gui.Kuuntelijat;

import gui.Kayttoliittyma;
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
        //frame.setVisible(false);
        int mk=malli.Korkeus();
        int ml=malli.Leveys();
          try{
        Integer korkeus1 = Integer.parseInt(kayttis.korkeus.getText());
        Integer leveys1 = Integer.parseInt(kayttis.leveys.getText());
if (korkeus1==(int)korkeus1 && leveys1==(int)leveys1 && korkeus1>0 && leveys1>0
            && korkeus1<11 && leveys1<11){
        Neulepinta pinta = new Neulepinta(malli, korkeus1, leveys1);

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1000, 1000));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.luoKomponentitNeulepinta(frame.getContentPane(), pinta);
        frame.pack();
        frame.setVisible(true);
}else{
    kayttis.viestiMuutos("Anna kokonaisluku 1-10:");
}
    }catch(Exception e){
        kayttis.viestiMuutos("Anna kokonaisluku 1-10:");
    }
    }
}
