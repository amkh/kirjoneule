package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Malli;
/*
 Tämä nappikuuntelija vastaa mallin koon ja värien kyselyikkunan toiminnasta. Ok-
 napin painalluksen jälkeen ohjelma ottaa mallin korkeuden, leveyden ja värit
 talteen uuden mallin luomista varten.
 */

public class OkNappiKuuntelija implements ActionListener {

    private Kayttoliittyma kayttis;
    private JFrame frame;

    public OkNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame) {

        this.kayttis = kayttis;
        this.frame = frame;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        try{
        Integer korkeus1 = Integer.parseInt(kayttis.korkeus.getText());
        Integer leveys1 = Integer.parseInt(kayttis.leveys.getText());
        
    if (korkeus1==(int)korkeus1 && leveys1==(int)leveys1){
        //frame.setVisible(false);
        Malli malli = new Malli(korkeus1, leveys1, kayttis.variluokka.varit());

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.luoKomponentitMallinTeko(frame.getContentPane(), malli);
        frame.pack();
        frame.setVisible(true);
    }
     }catch(Exception e){
         
      JLabel virhe=new JLabel("Anna kokonaisluku 1-100:");
      Container c=kayttis.haeContainer(frame);
      c.setLayout(new BorderLayout());
      c.add(virhe, BorderLayout.CENTER);
      
      System.out.println("Anna kokonaisluku 1-100:");
}

       
        
    }

}
