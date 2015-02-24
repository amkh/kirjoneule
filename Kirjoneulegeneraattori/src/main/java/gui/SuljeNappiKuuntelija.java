

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class SuljeNappiKuuntelija implements ActionListener{
    private Kayttoliittyma kayttis;
    private JFrame frame;
    public SuljeNappiKuuntelija(Kayttoliittyma kayttis){
        this.kayttis=kayttis;
        this.frame=kayttis.haeFrame();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       frame.setVisible(false);
    }
}
