package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 Tämä kuuntelija ottaa talteen valitun värin mallin ruutujen väritystä varten.
 */
public class VariNappiKuuntelija implements ActionListener {

    public Color valittuvari;
    public Kayttoliittyma kayttis;
    public JFrame frame;

    public VariNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame) {
        this.kayttis = kayttis;
        this.frame = frame;
    }

    public Color variKlikkaus(Color vari) {
        return vari;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String apu = e.getActionCommand();
        System.out.println(apu);
        valittuvari = Color.decode(apu);
        variKlikkaus(valittuvari);

    }

}
