

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;


public class Malli {
    //Malli koostuu ruudukosta ja nimestä
    //Scanner-jutut voi ohittaa; siirretään käyttikseen
    
    private String nimi;
    private Pohja pohja;
    private ArrayList<Color> varit;
    Scanner lukija = new Scanner(System.in);
    
    public Malli( int korkeus, int leveys, ArrayList varit){
        this.nimi="malli";
        this.pohja=new Pohja(korkeus,leveys);
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
        else return;
    }
    
    public int Korkeus(){
        return pohja.Korkeus();
    }
    public int Leveys(){
        return pohja.Leveys();
    }
    public Ruutu hae(int n, int m){
        return pohja.hae(n,m);
    }
    
//    public void valitseKoko(){
//        System.out.println("Valitse mallin koko.");
//        System.out.println("Leveys: ");
//        System.out.println("Korkeus: ");
//        
//    }
    
}
