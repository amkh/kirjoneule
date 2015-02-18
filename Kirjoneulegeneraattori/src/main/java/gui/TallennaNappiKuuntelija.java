
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class TallennaNappiKuuntelija implements ActionListener{
    
    private Kayttoliittyma kayttis;
     
    private JFrame frame;
    
    public TallennaNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame){
        this.kayttis = kayttis;
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kayttis.luoKomponentitTallennus(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

        
    }
}
