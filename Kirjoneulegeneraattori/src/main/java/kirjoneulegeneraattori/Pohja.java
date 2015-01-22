
package com.mycompany.kirjoneulegeneraattori;

import java.util.Scanner;

public class Pohja {
    //Pohja koostuu ruuduista
    
    private int korkeus;
    private int leveys;
    private Ruutu[][] pohja;
    Scanner lukija=new Scanner(System.in);
    
    public Pohja(int korkeus,int leveys){
        this.korkeus=korkeus;
        this.leveys=leveys;
        pohja = new Ruutu[korkeus][leveys];
        
    }
    public void uusiLeveys(int leveys){
        //System.out.println("Leveys: ");
       // this.leveys=lukija.nextInt();
    }
    
      public void uusiKorkeus(int korkeus){
       // System.out.println("Korkeus: ");
       // this.korkeus=lukija.nextInt();
    }
      public void uusiKoko(int korkeus, int leveys){
          this.uusiKorkeus(korkeus);
          this.uusiLeveys(leveys);
      }
       
}
