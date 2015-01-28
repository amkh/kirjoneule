

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Malli {
    //Malli koostuu ruudukosta ja nimestä
    //Scanner-jutut voi ohittaa; siirretään käyttikseen
    
    private String nimi;
    private Pohja pohja;
    private Set<Color> varit;
    Scanner lukija = new Scanner(System.in);
    
    public Malli( int korkeus, int leveys, Set<Color> varit){
        this.nimi="malli";
        try {
            this.pohja=new Pohja(korkeus,leveys);
        } catch (Exception ex) {
            Logger.getLogger(Malli.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.varit=varit;
        
        
    }
    public String nimi(){
        return nimi;
    }
    public void vaihdaNimi(String nimi){
     //   System.out.println("Anna uusi nimi: ");
    //    this.nimi=lukija.nextLine();
    //    System.out.println("Uusi nimi on:" + nimi);
        
        this.nimi=nimi;
   }
    public void lisaaVari(Color vari){
        this.varit.add(vari);
       
    }
    public void poistaVari(Color vari){
        if(this.varit.contains(vari)){
        this.varit.remove(vari);
         }
        }
    public boolean haeVari(Color vari){
        if(this.varit.contains(vari)){
            return true;
        }else{
            return false;
        }
    }
    public int Korkeus(){
        return pohja.Korkeus();
    }
    public int Leveys(){
        return pohja.Leveys();
    }
    public Ruutu hae(int n, int m) {
        return pohja.hae(n,m);
    }
    public void varitaRuutu(int n, int m, Color vari){
        if(this.varit.contains(vari)){
        pohja.hae(n,m).vaihdaVari(vari);
        }
    }
    
//    public void valitseKoko(){
//        System.out.println("Valitse mallin koko.");
//        System.out.println("Leveys: ");
//        System.out.println("Korkeus: ");
//        
//    }
    
}
