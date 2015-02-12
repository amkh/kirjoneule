package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JTextField;
import kirjoneulegeneraattori.Malli;

public class OkNappiKuuntelija implements ActionListener {

  private Malli malli;
    private JTextField korkeus;
    private JTextField leveys;
    private Set<Color> varit;

    private void OkNappiKuuntelija(Malli malli, Set<Color> varit, JTextField korkeus, JTextField leveys) {
        this.malli = malli;
        this.korkeus = korkeus;
        this.leveys = leveys;
        this.varit = varit;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Integer korkeus1=Integer.parseInt(korkeus.getText());
        Integer leveys1=Integer.parseInt(leveys.getText());
        
        Malli malli = new Malli(korkeus1, leveys1,varit );
        
    }

}
