
package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Hakemisto;
import kirjoneulegeneraattori.Malli;


/*
Tämä nappikuuntelija vastaa tallennuksen suorittamisesta ja valmiin mallin 
siirtämisestä hakemistoon muistiin. 
*/
public class TallennaNappiKuuntelija implements ActionListener{
    
    private Kayttoliittyma kayttis;
    public Malli malli;
    private JFrame frame;
    
    
    public TallennaNappiKuuntelija(Kayttoliittyma kayttis,  JFrame frame, Malli malli){
        this.kayttis = kayttis;
        this.frame = frame;
        this.malli=malli;
       
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        malli.vaihdaNimi(kayttis.nimi.getText());
        kayttis.hakemisto.lisaaMalli(malli);
        
        

        
    }
}
