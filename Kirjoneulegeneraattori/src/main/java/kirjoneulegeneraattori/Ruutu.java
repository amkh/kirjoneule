

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.Scanner;


public class Ruutu {
    
    //Ruutu vastaa yhtä silmukkaa neulemallissa: siihen liittyy väri, joka 
    //näkyy väritettynä neliönä valmiissa mallissa.
    
    private Color vari; 
   // private final int koko = 1;
    Scanner lukija = new Scanner(System.in);
    
    public Ruutu(){
        this.vari=Color.WHITE;
    }
    public Color vari(){
        return vari;
    }
    public void vaihdaVari(Color vari){
        this.vari=vari;
        
      
    }
}
