package gui.Luokat;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import kirjoneulegeneraattori.Malli;

/*
 Luokka piirtää mallipohjan väreineen ikkunaan.
 */
public class Pohjanpiirto extends JPanel {

    public Malli malli;

    public Pohjanpiirto(Malli malli) {
        this.malli = malli;

    }

    @Override
    public void paintComponent(Graphics g) {

        for (int i = 0; i < malli.Korkeus(); i++) {
            for (int j = 0; j < malli.Leveys(); j++) {
                g.setColor(malli.hae(i, j).vari());
                g.fillRect(20 * (j + 1), 20 * (i + 1), 20, 20);
                g.setColor(Color.BLACK);
                g.drawRect(20 * (j + 1), 20 * (i + 1), 20, 20);

            }
        }

    }

}
