package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

    private void luoKomponentit(Container container) {
       // GridLayout layout = new GridLayout(1, 3);
        //container.setLayout(layout);
        //container.add(luoMalli(), GridLayout(1,1));
        //container.add(luoVariTaulukko(), GridLayout(1,3));

    }
/*
    public void aloita() {
        kokoPyynto();
        variPyynto();
        JButton okNappi = new JButton("Ok");
        frame.add(okNappi);
    }

    public void kokoPyynto() {
        JLabel kokoPyynto = new JLabel("Valitse mallin koko:");
        frame.add(kokoPyynto);
        JTextField korkeus = new JTextField();
        frame.add(korkeus);
        JTextField leveys = new JTextField();
        frame.add(leveys);

    }
    private JPanel luoVariTaulukko(){
        JPanel taulukko=new JPanel(new GridLayout(3,1));
        //taulukko.add(new JButton variN);
        Vaihda 3 värien lukumääräksi!!
        
        
        return taulukko;
    }
    private JPanel luoMalli(){
        JPanel mallipohja = new JPanel(new GridLayout(2,3));
        
        Vaihda 2,3 mallin kooksi!!
        
        return mallipohja;
    }

    public void variPyynto() {
        JLabel variPyynto = new JLabel("Valitse haluamasi värit:");
        frame.add(variPyynto);
    }

    public JFrame haeFrame() {
        return frame;
    }
*/
}
