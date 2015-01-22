
package kirjoneulegeneraattori;

import java.util.Scanner;

public class Pohja {
    //Pohja koostuu ruuduista
    //Scanner-tekstit voi ohittaa
    
    private int korkeus;
    private int leveys;
    private Ruutu[][] pohja;
   // Scanner lukija=new Scanner(System.in);
    
    public Pohja(int korkeus,int leveys){
            if(korkeus>100){
        
         System.out.println("Valitse korkeus väliltä 1-100.");
       
     } 
      else if(korkeus<1){
          System.out.println("Valitse korkeus väliltä 1-100.");
      }
           else if(leveys>100){
        
         System.out.println("Valitse leveys väliltä 1-100.");
       
     } 
      else if(leveys<1){
          System.out.println("Valitse leveys väliltä 1-100.");
      }
      else{
        this.korkeus=korkeus;
        this.leveys=leveys;
        pohja = new Ruutu[korkeus][leveys];
      }
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
      
      public int Korkeus(){
          return korkeus;
      }
      public int Leveys(){
          return leveys;
      }
       
      public Ruutu hae(int m, int n){
          return pohja[m][n];
      }
}
