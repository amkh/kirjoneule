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

    Malli malli1;
    Malli malli2;
    Set<Color> varit1;
    Set<Color> varit2;

    public HakemistoPaneeli() {
        //TESTI!!!!
        varit1 = new HashSet<Color>();
        varit1.add(Color.BLACK);
        varit1.add(Color.GRAY);
        varit2 = new HashSet<Color>();
        varit2.add(Color.GREEN);
        varit2.add(Color.RED);
        varit2.add(Color.YELLOW);
        malli1 = new Malli(2, 5, varit1);
        malli1.vaihdaNimi("Malli1");
        malli2 = new Malli(3, 10, varit2);
        malli2.vaihdaNimi("Malli2");
        hakemisto.lisaaMalli(malli1);
        hakemisto.lisaaMalli(malli2);
        ////

        setLayout(new GridLayout(0, 1));

        JLabel pyynto = new JLabel("Valitse haluamasi malli");

        add(pyynto);

        for (int i = 0; i < hakemisto.koko(); i++) {
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
