package gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Kayttoliittyma {

    private JFrame frame;

    public Kayttoliittyma() {

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1500, 1000));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void aloita() {

    }

    public void kokoPyynto() {
        JLabel kokoPyynto = new JLabel("Valitse mallin koko:");
        frame.add(kokoPyynto);
        JTextField korkeus = new JTextField();
        frame.add(korkeus);
        JTextField leveys = new JTextField();
        frame.add(leveys);
        JButton okNappi = new JButton("Ok");
        frame.add(okNappi);

    }

    public void variPyynto() {
        JLabel variPyynto = new JLabel("Valitse haluamasi värit:");
        frame.add(variPyynto);
    }

    private void luoKomponentit(Container container) {

    }

    public JFrame haeFrame() {
        return frame;
    }
}
