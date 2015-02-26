

package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class SuljeNappiKuuntelija implements ActionListener{
    private Kayttoliittyma kayttis;
    private JFrame frame;
    public SuljeNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame){
        this.kayttis=kayttis;
        this.frame=frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        frame.dispose();
    }
}
