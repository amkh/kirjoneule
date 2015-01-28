

package kirjoneulegeneraattori;


public class Hakemisto {
    //Hakemistossa tulisi olla valmiit mallit 
  
    
    private Malli[][] hakemisto;
    private int maara;
 
    
    public Hakemisto(int maara){
        if(maara>-1){
            this.maara=maara;
           
            hakemisto=new Malli[maara-1][1];
        }
       
    }
   
    public void lisaaMalli(Malli malli){
        this.maara=maara+1;
        hakemisto[maara][1]=malli;
    }
    public void haeMalli(String nimi){
        for(int n=0;maara-1;n++){
            if(hakemisto[n][1].nimi().equals(nimi)){
                return malli;
            }
        }
        
    }
    
    
}
