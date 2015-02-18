

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import kirjoneulegeneraattori.Malli;


public class NimiOkNappiKuuntelija implements ActionListener{
    private Kayttoliittyma kayttis;
    private JFrame frame;
    private Malli malli;
    
    public NimiOkNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame,Malli malli){
        this.kayttis=kayttis;
        this.frame=frame;
        this.malli=malli;
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        this.malli.vaihdaNimi(kayttis.nimi.getText());
        
      
        
        
    }
}
