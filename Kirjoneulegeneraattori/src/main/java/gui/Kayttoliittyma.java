package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Malli;

public class Kayttoliittyma {

    private JFrame frame;
    private Set<Color> varit;
    private int korkeus;
    private int leveys;

    public Kayttoliittyma(Set<Color> varit) {
        this.varit=varit;
        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1500, 1000));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentitAlku(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
        
    }
    private void luoKomponentitAlku(Container c){
        
        JLabel tervehdys=new JLabel("Tervetuloa käyttämään kirjoneulegeneraattoria!");
        c.add(tervehdys);
        
        
        
    }
      public void LuoKomponentitKyselyt(Container c) {
        kokoPyynto();
        variPyynto();
        JButton okNappi = new JButton("Ok");
        OkNappiKuuntelija k=new OkNappiKuuntelija();
        okNappi.addActionListener(k);
        c.add(okNappi);
    
      
    }


    private void luoKomponentitMallinTeko(Container container) {
        GridLayout layout = new GridLayout(1, 2);
        container.setLayout(layout);
        
        container.add(new JPanel(),new GridLayout(1,1));
        container.add(new JPanel(),new GridLayout(1,2));
        
       container.add(luoVariTaulukko(varit));
       container.add(luoPohja(korkeus,leveys));

    }

  
    public void kokoPyynto() {
        JLabel kokoPyynto = new JLabel("Valitse mallin koko:");
        frame.add(kokoPyynto);
        JTextField korkeus = new JTextField();
        frame.add(korkeus);
        JTextField leveys = new JTextField();
        frame.add(leveys);

    }
    
    private JPanel luoVariTaulukko(Set<Color> varit){
      
        int koko=varit.size();
        Color[] varit2 = varit.toArray(new Color[koko]);
        JPanel taulukko=new JPanel(new GridLayout(koko,1));
    for (int i=0;i<koko;i++){
        JButton nappi=new JButton();
         nappi.setBackground(varit2[i]);
        taulukko.add(nappi);
    }
       
        
        return taulukko;
        
    }
    
    private JPanel luoPohja(int korkeus, int leveys){
        
        
        
        JPanel pohja = new JPanel(new GridLayout(korkeus,leveys));
       return pohja;
    }

    public void variPyynto() {
        JLabel variPyynto = new JLabel("Valitse haluamasi värit:");
        frame.add(variPyynto);
    }

    public JFrame haeFrame() {
        return frame;
    }
    public void paivita(){
        
    }

}
