
package kirjoneulegeneraattori;

import kirjoneulegeneraattori.Ruutu;
import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RuutuTest {
    
    Ruutu ruutu;
    
    public RuutuTest() {
    }
    
    @Before
    public void setUp() {
        ruutu=new Ruutu();
    }

    @Test
    public void luoOikein(){
        assertEquals(Color.WHITE,ruutu.vari());
    }
    
    
    @Test
    public void testvaihdaVari() {
        ruutu.vaihdaVari(Color.GREEN);
        assertEquals(Color.GREEN,ruutu.vari());
    }
 
   

  
  
    
}
