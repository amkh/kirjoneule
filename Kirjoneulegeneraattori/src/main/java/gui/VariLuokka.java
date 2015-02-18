package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VariLuokka extends JPanel {

    JCheckBox punainen;
    JCheckBox sininen;
    JCheckBox vihrea;
    JCheckBox valkoinen;
    JCheckBox musta;
    JCheckBox pinkki;
    JCheckBox keltainen;
    JCheckBox harmaa;

    Set<Color> varit;

    public VariLuokka() {

        setLayout(new GridLayout(0, 1));

        JLabel pyynto = new JLabel("Valitse haluamasi värit:");

        add(pyynto);

        punainen = new JCheckBox("Punainen");
        punainen.setBackground(Color.PINK);
        sininen = new JCheckBox("Sininen");
        sininen.setBackground(Color.PINK);
        vihrea = new JCheckBox("Vihreä");
        vihrea.setBackground(Color.PINK);
        valkoinen = new JCheckBox("Valkoinen");
        valkoinen.setBackground(Color.PINK);
        musta = new JCheckBox("Musta");
        musta.setBackground(Color.PINK);
        pinkki = new JCheckBox("Pinkki");
        pinkki.setBackground(Color.PINK);
        keltainen = new JCheckBox("Keltainen");
        keltainen.setBackground(Color.PINK);
        harmaa = new JCheckBox("Harmaa");
        harmaa.setBackground(Color.PINK);
        add(punainen);
        add(sininen);
        add(vihrea);
        add(keltainen);
        add(pinkki);
        add(valkoinen);
        add(musta);
        add(harmaa);
        setBackground(Color.PINK);

    }

    public Set<Color> varit() {
        varit = new HashSet<Color>();

        if (punainen.isSelected()) {
            varit.add(Color.RED);
        } else if (sininen.isSelected()) {
            varit.add(Color.BLUE);
        } else if (vihrea.isSelected()) {
            varit.add(Color.GREEN);
        } else if (keltainen.isSelected()) {
            varit.add(Color.YELLOW);
        } else if (harmaa.isSelected()) {
            varit.add(Color.GRAY);
        } else if (musta.isSelected()) {
            varit.add(Color.BLACK);
        } else if (valkoinen.isSelected()) {
            varit.add(Color.WHITE);
        } else if (pinkki.isSelected()) {
            varit.add(Color.PINK);
        }

        return varit;
    }
}
