package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import kirjoneulegeneraattori.Malli;

public class Taulukkokuuntelija implements ActionListener {

    private Component mallipohja;
    private Malli malli;
    private Set<Color> varit;
    private Color valittuVari;

    public Taulukkokuuntelija(Malli malli, Set<Color> varit, Component mallipohja){
        this.malli = malli;
        this.varit = varit;
        this.mallipohja = mallipohja;

    }

    public void variKlikkaus(Color valittuVari) {
        this.valittuVari = valittuVari;
    }

    public void malliKlikkaus(int korkeus, int leveys) {
        malli.hae(korkeus, leveys).vaihdaVari(valittuVari);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(varinappi)) {
            Color vari = varinappi.getColor();
            variKlikkaus(vari);
        } else if (e.getSource().equals(mallinappi)) {
            int korkeus = mallinappi.korkeus();
            int leveys = mallinappi.leveys();
            malliKlikkaus(korkeus, leveys);
        }

    }

}
