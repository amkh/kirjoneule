package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
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
        Set<Color> varit=kayttis.variluokka.varit();
        
    if (korkeus1==(int)korkeus1 && leveys1==(int)leveys1 && korkeus1>0 && leveys1>0
            && korkeus1<21 && leveys1<21 && varit.size()>0){
        //frame.setVisible(false);
        Malli malli = new Malli(korkeus1, leveys1, kayttis.variluokka.varit());

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1000, 800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.luoKomponentitMallinTeko(frame.getContentPane(), malli);
        frame.pack();
        frame.setVisible(true);
    }
    else{
         ///???? kaksi riviä
      kayttis.viestiMuutos("Anna kokonaisluku väliltä 1-20 \n"
             // + "ja valitse ainakin yksi väri"
      );
     
      
      
      
    }
      System.out.println("Anna kokonaisluku 1-20:");
      }catch(Exception e){
          kayttis.viestiMuutos("Anna kokonaisluku 1-20:");
          //System.out.println("Virhe mallinluonnissa");
}

       
        
    }

}
