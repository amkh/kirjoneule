package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import kirjoneulegeneraattori.Hakemisto;
import kirjoneulegeneraattori.Malli;

/*
 Paneelissa on lueteltu muistissa olevat mallit. Valittu malli laitetaan muistiin.
 */
public class HakemistoPaneeli extends JPanel {

    Hakemisto hakemisto;
    JRadioButton malli;
    String valittumalli;
    Kayttoliittyma kayttis;

    

    public HakemistoPaneeli(Kayttoliittyma kayttis) {
        this.kayttis=kayttis;
        this.hakemisto=kayttis.hakemisto;

        setLayout(new GridLayout(0, 1));

        JLabel pyynto = new JLabel("Valitse haluamasi malli");

        add(pyynto);

        for (int i = 0; i < hakemisto.koko()+1; i++) {
            malli = new JRadioButton(hakemisto.haeIndeksilla(i).nimi());
            malli.setBackground(Color.PINK);
            add(malli);
        }

    }

    public Malli valittuMalli() {

        if (malli.isSelected()) {
            this.valittumalli = malli.getName();
        }
        return hakemisto.haeMalli(valittumalli);
    }

}
