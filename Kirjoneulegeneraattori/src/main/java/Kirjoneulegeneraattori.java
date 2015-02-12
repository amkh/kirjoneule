

import gui.Kayttoliittyma;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import kirjoneulegeneraattori.Malli;


public class Kirjoneulegeneraattori {


    public static void main(String[] args) {
      
        Set<Color> varit= new HashSet<Color>();
        varit.add(Color.WHITE);
        varit.add(Color.BLUE);
        varit.add(Color.BLACK);
        Kayttoliittyma k = new Kayttoliittyma(varit); 
     
   
    }
    
}
