package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import kirjoneulegeneraattori.Hakemisto;
import kirjoneulegeneraattori.Malli;
import kirjoneulegeneraattori.Neulepinta;

public class Kayttoliittyma {

    private JFrame frame;
    private Set<Color> varit;

    public JTextField korkeus;
    public JTextField leveys;
    public JTextField nimi;
    public VariLuokka variluokka;
    public Pohjanpiirto piirto;

    public Hakemisto hakemisto;
    public HakemistoPaneeli hakemistopaneeli;
    public Neulepohjanpiirto pinta;

    public int korkeusInt;
    public int leveysInt;
    public Color valittuvari;

    public Kayttoliittyma() {

    }

    public void run() {
        hakemisto = new Hakemisto();
        ///TESTI
        Set<Color> varit1 = new HashSet<Color>();
        varit1.add(Color.BLACK);
        varit1.add(Color.GRAY);
        Set<Color> varit2 = new HashSet<Color>();
        varit2.add(Color.GREEN);
        varit2.add(Color.RED);
        varit2.add(Color.YELLOW);
        Malli malli1 = new Malli(2, 5, varit1);
        malli1.vaihdaNimi("Malli1");
        Malli malli2 = new Malli(3, 10, varit2);
        malli2.vaihdaNimi("Malli2");
        hakemisto.lisaaMalli(malli2);
        hakemisto.lisaaMalli(malli1);
        ////
        frame = new JFrame("Kirjoneulegeneraattori");
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentitAlku(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }
    /*
     Metodi luo ohjelman aloitussivun.
     */

    private void luoKomponentitAlku(Container c) {
        c.setLayout(new BorderLayout());

        JLabel tervehdys = new JLabel("Tervetuloa käyttämään kirjoneulegeneraattoria!");
        tervehdys.setFont(new Font("Serif", Font.PLAIN, 30));
        tervehdys.setHorizontalAlignment(SwingConstants.CENTER);

        JButton uusimalli = new JButton("Uusi malli");
        uusimalli.addActionListener(new AlkuNappiKuuntelija(this, frame));
        uusimalli.setBackground(Color.white);

        JButton hakemisto = new JButton("Hakemisto");
        hakemisto.addActionListener(new HakemistoNappiKuuntelija(this, frame));
        hakemisto.setBackground(Color.white);

        c.add(tervehdys);
        c.add(uusimalli, BorderLayout.WEST);
        c.add(hakemisto, BorderLayout.EAST);
        c.setBackground(Color.PINK);

    }
    /*
     Metodi luo hakemistosivun.
     */

    public void LuoKomponentitHakemisto(Container c) {
        c.setLayout(new BorderLayout());

        hakemistopaneeli = new HakemistoPaneeli(this);
        JButton okNappi = new JButton("Ok");
        JButton suljeNappi = new JButton("Sulje");
        HakemistoPaneeliKuuntelija h = new HakemistoPaneeliKuuntelija(this, frame);
        SuljeNappiKuuntelija s = new SuljeNappiKuuntelija(this);
        okNappi.addActionListener(h);
        suljeNappi.addActionListener(s);
        c.add(okNappi, BorderLayout.SOUTH);
        //c.add(suljeNappi, BorderLayout.SOUTH);
        c.add(hakemistopaneeli, BorderLayout.CENTER);
        c.setBackground(Color.PINK);
    }
    /*
     Metodi luo mallin luomiseen vaadittavien tietojen syöttösivun. Mallin luomiseen vaaditaan korkeus, leveys ja värit.
     */

    public void LuoKomponentitKyselyt(Container c) {
        c.setLayout(new BorderLayout());

        variluokka = new VariLuokka();

        JButton okNappi = new JButton("Ok");
        JButton suljeNappi = new JButton("Sulje");
        SuljeNappiKuuntelija s = new SuljeNappiKuuntelija(this);
        OkNappiKuuntelija k = new OkNappiKuuntelija(this, frame);
        okNappi.addActionListener(k);
        suljeNappi.addActionListener(s);
        c.add(kokoPyynto(), BorderLayout.WEST);
        c.add(variluokka, BorderLayout.EAST);
        c.add(okNappi, BorderLayout.SOUTH);
        // c.add(suljeNappi, BorderLayout.SOUTH);
        c.setBackground(Color.PINK);

    }
    /*
     Metodi luo varsinaisen mallinmuokkaamissivun.
     */

    public void luoKomponentitMallinTeko(Container c, Malli malli) {

        c.setLayout(new BorderLayout());

        JPanel j = new JPanel();
        j.setLayout(new GridLayout(0, 1));

        JLabel nimipyynto = new JLabel("Mallin nimi:");
        j.add(nimipyynto);
        nimi = new JTextField();
        j.add(nimi);

        JButton tallennaNappi = new JButton("Tallenna");
        TallennaNappiKuuntelija t = new TallennaNappiKuuntelija(this, frame, malli);
        tallennaNappi.addActionListener(t);
        j.add(tallennaNappi);

        JButton kokeile = new JButton("Kokeile");
        KokeileNappiKuuntelija k = new KokeileNappiKuuntelija(this, frame, malli);
        kokeile.addActionListener(k);

        JButton suljeNappi = new JButton("Sulje");
        SuljeNappiKuuntelija s = new SuljeNappiKuuntelija(this);
        suljeNappi.addActionListener(s);

        piirto = new Pohjanpiirto(malli);
        piirto.addMouseListener(new Taulukkokuuntelija(this, frame, malli));
        c.add(luoVariTaulukko(malli.varit), BorderLayout.EAST);
        c.add(piirto, BorderLayout.CENTER);
        c.add(j, BorderLayout.SOUTH);
        // c.add(suljeNappi, BorderLayout.SOUTH);
        c.add(kokeile, BorderLayout.NORTH);
        c.setBackground(Color.PINK);

    }
    /*
     Metodi luo sivun, jolla kysytään halutun neulepinnan kokoa.
     */

    public void luoKomponentitPinnanKysely(Container c, Malli malli) {
        c.setLayout(new BorderLayout());

        JButton okNappi = new JButton("Ok");
        PinnanKyselyNappiKuuntelija p = new PinnanKyselyNappiKuuntelija(this, frame, malli);
        okNappi.addActionListener(p);
        c.add(kokoPyynto(), BorderLayout.CENTER);
        c.add(okNappi, BorderLayout.SOUTH);

    }
    /*
     Metodi luo ikkunan, jossa neulepinta on näkyvissä ruudukkona.
     */

    public void luoKomponentitNeulepinta(Container c, Neulepinta neulepinta) {
        c.setLayout(new BorderLayout());

        pinta = new Neulepohjanpiirto(neulepinta);
        c.add(pinta, BorderLayout.CENTER);
        c.setBackground(Color.PINK);
    }

    /*
     Paneelissa on tekstikentät, joihin mallin korkeus ja leveys pitäisi syöttää.
     */
    private JPanel kokoPyynto() {
        JPanel vasen = new JPanel();
        vasen.setLayout(new GridLayout(0, 1));

        JLabel pyynto = new JLabel("Valitse koko:");
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
    /*
     Paneelissa on nappeina mallin värit.
     */

    private JPanel luoVariTaulukko(Set<Color> varit) {

        int koko = varit.size();
        Color[] varit2 = varit.toArray(new Color[koko]);
        JPanel taulukko = new JPanel(new GridLayout(0, 1));
        for (int i = 0; i < koko; i++) {
            JButton nappi = new JButton();
            nappi.setText(varit2[i].toString());

            nappi.setForeground(varit2[i]);
            nappi.setBackground(varit2[i]);
            nappi.addActionListener(new VariNappiKuuntelija(this, frame));
            taulukko.add(nappi);
        }

        return taulukko;

    }

    public JFrame haeFrame() {
        return frame;
    }

    public void variKlikkaus(Color vari) {
        valittuvari = vari;

    }

    public Color haeValittuvari() {
        return valittuvari;
    }

    public void paivita() {

        piirto.repaint();

    }

    public Container haeContainer(JFrame frame) {
        return frame.getContentPane();
    }

}
