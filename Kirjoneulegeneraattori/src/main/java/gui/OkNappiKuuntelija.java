package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import kirjoneulegeneraattori.Malli;

public class OkNappiKuuntelija implements ActionListener {

    private Malli malli;
    private JTextField korkeus;
    private JTextField leveys;

    private public OkNappiKuuntelija(Malli malli, JTextField korkeus, JTextField leveys) {
        this.malli = malli;
        this.korkeus = korkeus;
        this.leveys = leveys;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Malli malli = new Malli(korkeus.getText(), leveys.getText(), varit.get);
    }

}
