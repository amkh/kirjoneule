
package kirjoneulegeneraattori;

import java.util.Scanner;

public class Pohja {
    //Pohja koostuu ruuduista
    //Scanner-tekstit voi ohittaa
    
    private int korkeus;
    private int leveys;
    private Ruutu[][] pohja;

   // Scanner lukija=new Scanner(System.in);
    
    public Pohja(int korkeus,int leveys) throws Exception{
            if(korkeus>100 || korkeus<1 || leveys>100 || leveys<1 ){
        
         throw new Exception("Valitse korkeus väliltä 1-100.");
     }
      else{
        this.korkeus=korkeus;
        this.leveys=leveys;
        pohja = new Ruutu[korkeus][leveys];
       

        
        for(int nn=0; nn<korkeus; nn++){
            for(int mm=0;mm<leveys;mm++){
                pohja[nn][mm]=new Ruutu();
                
            }
        }
      }
    }
    
      public int Korkeus(){
          return korkeus;
      }
      public int Leveys(){
          return leveys;
      }
      
       
      public Ruutu hae(int m, int n) {
          if(m>this.korkeus-1 || n>this.leveys-1 || m<0 || n<0){
              return null;
          }
          else{
          return pohja[m][n];
      }
      }
      public void uusiLeveys(int leveys){
          if(leveys<100 && leveys>0){
         
              this.leveys=leveys;
          }
    }
    
      public void uusiKorkeus(int korkeus){
          if(korkeus<100 && korkeus>0){
   
          
              this.korkeus=korkeus;
          }
    }
      public void uusiKoko(int korkeus, int leveys){
          if(korkeus<100 && korkeus>0 &&leveys<100 && leveys>0){
          this.uusiKorkeus(korkeus);
          this.uusiLeveys(leveys);
          }
      }
      
}
