package gui.Luokat;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import kirjoneulegeneraattori.Neulepinta;

/*
 Luokka piirtää neulepinnan ruudukkona.
 */
public class Neulepohjanpiirto extends JPanel {

    public Neulepinta pinta;

    public Neulepohjanpiirto(Neulepinta pinta) {
        this.pinta = pinta;

    }

    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < pinta.korkeus(); i++) {
            for (int j = 0; j < pinta.leveys(); j++) {
                g.setColor(pinta.hae(i, j).vari());

                g.fillRect(20 * (j + 1), 20 * (i + 1), 20, 20);
                g.setColor(Color.BLACK);
                g.drawRect(20 * (j + 1), 20 * (i + 1), 20, 20);

            }

        }

    }
}
