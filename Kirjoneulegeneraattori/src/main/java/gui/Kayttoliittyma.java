package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.Set;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Kayttoliittyma {

    private JFrame frame;
    private Set<Color> varit;

    public JTextField korkeus;
    public JTextField leveys;
    public JTextField nimi;
    public VariLuokka variluokka;
    public Pohjanpiirto piirto;

    public int korkeusInt;
    public int leveysInt;

    public Kayttoliittyma() {
    }

    public void run() {
        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentitAlku(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentitAlku(Container c) {
        c.setLayout(new BorderLayout());

        JLabel tervehdys = new JLabel("Tervetuloa käyttämään kirjoneulegeneraattoria!");
        tervehdys.setFont(new Font("Serif", Font.PLAIN, 30));
        JButton uusimalli = new JButton("Uusi malli");
        //JButton hakemisto=new JButton("Hakemisto");
        uusimalli.addActionListener(new AlkuNappiKuuntelija(this, frame));
        uusimalli.setBackground(Color.white);
        //hakemisto.addActionListener(new alkuNappiKuuntelija());
        tervehdys.setHorizontalAlignment(SwingConstants.CENTER);
        c.add(tervehdys);
        c.add(uusimalli, BorderLayout.WEST);
        c.setBackground(Color.PINK);
        //c.add(hakemisto, BorderLayout.EAST);

    }

    public void LuoKomponentitKyselyt(Container c) {
        c.setLayout(new BorderLayout());
        c.add(kokoPyynto(), BorderLayout.WEST);
        variluokka = new VariLuokka();

        c.add(variluokka, BorderLayout.EAST);
        JButton okNappi = new JButton("Ok");
        OkNappiKuuntelija k = new OkNappiKuuntelija();
        okNappi.addActionListener(k);

        c.add(okNappi, BorderLayout.SOUTH);
        c.setBackground(Color.PINK);

    }

    public void luoKomponentitMallinTeko(Container c) {

        c.setLayout(new BorderLayout());

        JButton tallenna = new JButton("Tallenna");
        TallennaNappiKuuntelija l = new TallennaNappiKuuntelija(this, frame);
        tallenna.addActionListener(l);

        c.add(luoVariTaulukko(varit), BorderLayout.EAST);
        c.add(luoPohja(korkeusInt, leveysInt), BorderLayout.WEST);
        c.add(tallenna, BorderLayout.SOUTH);
        c.setBackground(Color.PINK);
    }

    public void luoKomponentitTallennus(Container c) {
        c.setLayout(new BorderLayout());

        JLabel nimipyynto = new JLabel("Mallin nimi:");
        c.add(nimipyynto);
        nimi = new JTextField();
        c.add(nimi);

        JButton okNappi = new JButton("Ok");
        NimiOkNappiKuuntelija m = new NimiOkNappiKuuntelija(this, frame, malli);
        okNappi.addActionListener(m);
        c.setBackground(Color.PINK);

    }

    private JPanel kokoPyynto() {
        JPanel vasen = new JPanel();
        vasen.setLayout(new GridLayout(0, 1));

        JLabel pyynto = new JLabel("Valitse mallin koko:");
        vasen.add(pyynto);
        JLabel kpyynto = new JLabel("Korkeus:");
        vasen.add(kpyynto);
        korkeus = new JTextField();
        vasen.add(korkeus);
        JLabel lpyynto = new JLabel("Leveys:");
        vasen.add(lpyynto);
        leveys = new JTextField();
        vasen.add(leveys);
        vasen.setBackground(Color.PINK);

        return vasen;

    }

    private JPanel luoVariTaulukko(Set<Color> varit) {

        int koko = varit.size();
        Color[] varit2 = varit.toArray(new Color[koko]);
        JPanel taulukko = new JPanel(new GridLayout(koko, 1));
        for (int i = 0; i < koko; i++) {
            JButton nappi = new JButton();
            nappi.setBackground(varit2[i]);
            taulukko.add(nappi);
        }

        return taulukko;

    }

    private JPanel luoPohja(int korkeus, int leveys) {

        JPanel pohja = new JPanel(new GridLayout(korkeus, leveys));
        return pohja;
    }

    public JFrame haeFrame() {
        return frame;
    }

    public void paivita() {
        piirto.repaint();

    }

}
