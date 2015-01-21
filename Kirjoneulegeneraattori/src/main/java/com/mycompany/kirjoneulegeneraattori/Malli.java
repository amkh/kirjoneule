

package com.mycompany.kirjoneulegeneraattori;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;


public class Malli {
    //Malli koostuu ruudukosta ja nimestä
    
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
    public void vaihdaNimi(){
     //   System.out.println("Anna uusi nimi: ");
    //    this.nimi=lukija.nextLine();
    //    System.out.println("Uusi nimi on:" + nimi);
   }
    public void vaihdaVari(){
        ???
    }
    
//    public void valitseKoko(){
//        System.out.println("Valitse mallin koko.");
//        System.out.println("Leveys: ");
//        System.out.println("Korkeus: ");
//        
//    }
    
}
