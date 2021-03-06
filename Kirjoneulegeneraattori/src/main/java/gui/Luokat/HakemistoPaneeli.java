package gui.Luokat;

import gui.Kayttoliittyma;
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
        this.kayttis = kayttis;
        this.hakemisto = kayttis.hakemisto;

        setLayout(new GridLayout(0, 1));

        JLabel pyynto = new JLabel("Valitse haluamasi malli");

        add(pyynto);
        setBackground(Color.PINK);

        for (int i = 0; i < hakemisto.koko(); i++) {
            malli = new JRadioButton(hakemisto.haeIndeksilla(i).nimi());
            malli.setBackground(Color.PINK);
            add(malli);
        }

    }

    public Malli valittuMalli() {
        System.out.println("testi");
        if (malli.isSelected()) {
            System.out.println(malli.getActionCommand());
            this.valittumalli = malli.getActionCommand();
        }
        return hakemisto.haeMalli(valittumalli);
    }

}
