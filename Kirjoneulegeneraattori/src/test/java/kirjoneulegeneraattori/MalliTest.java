

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.ArrayList;
import kirjoneulegeneraattori.Malli;
import kirjoneulegeneraattori.Ruutu;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MalliTest {
    Malli malli;
    
    public MalliTest() {
    }
    
 
    
    @Before
    public void setUp() {
        ArrayList<Color> varit=ArrayList<Color>();
        varit.add(Color.WHITE);
        varit.add(Color.BLUE);
        varit.add(Color.BLACK);
        malli=new Malli(7,9,varit);
    }


    
    @Test
    public void testDefaultNimi() {
        assertEquals(malli.nimi(),"malli");
    
    }

 
    @Test
    public void testVaihdaNimi() {
        malli.vaihdaNimi("aaa");
        assertEquals(malli.nimi(),"aaa");
       
    }

    
    @Test
    public void testVaihdaVari() {
        
   
    }

    
    @Test
    public void testKorkeus() {
       assertEquals(malli.Korkeus(),7);
    }

  
    @Test
    public void testLeveys() {
        assertEquals(malli.Leveys(),9);
    }

    @Test
    public void testHae() {
   
    }
    
    @Test 
    public void testLisaaVari(){
        varit.add(Color.RED);
       
    }
    @Test 
    public void testPoistaVari(){
        varit.remove(Color.WHITE);
        
    }
    
}
