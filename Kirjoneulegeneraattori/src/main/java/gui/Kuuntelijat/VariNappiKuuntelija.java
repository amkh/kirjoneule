package gui.Kuuntelijat;

import gui.Kayttoliittyma;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 Tämä kuuntelija ottaa talteen valitun värin mallin ruutujen väritystä varten.
 */
public class VariNappiKuuntelija implements ActionListener {

    public Color valittuvari;
    public Kayttoliittyma kayttis;
    public JFrame frame;

    public VariNappiKuuntelija(Kayttoliittyma kayttis, JFrame frame) {
        this.kayttis = kayttis;
        this.frame = frame;
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        String apu = e.getActionCommand();
       
        if(apu.equals(Color.BLACK.toString())){
        valittuvari = Color.BLACK;
        }
         if(apu.equals(Color.WHITE.toString())){
        valittuvari = Color.WHITE;
        }
          if(apu.equals(Color.GREEN.toString())){
        valittuvari = Color.GREEN;
        }
           if(apu.equals(Color.BLUE.toString())){
        valittuvari = Color.BLUE;
        }
            if(apu.equals(Color.PINK.toString())){
        valittuvari = Color.PINK;
        }
             if(apu.equals(Color.RED.toString())){
        valittuvari = Color.RED;
        }
              if(apu.equals(Color.YELLOW.toString())){
        valittuvari = Color.YELLOW;
        }
               if(apu.equals(Color.GRAY.toString())){
        valittuvari = Color.GRAY;
        }
        //System.out.println(valittuvari);
        kayttis.variKlikkaus(valittuvari);

    }

}
