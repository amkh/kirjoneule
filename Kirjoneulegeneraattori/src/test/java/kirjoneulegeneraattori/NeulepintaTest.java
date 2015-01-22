

package kirjoneulegeneraattori;

import kirjoneulegeneraattori.Neulepinta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NeulepintaTest {
    
    Neulepinta pinta;
    
    public NeulepintaTest() {
    }
    
 
    @Before
    public void setUp() {
        pinta=new Neulepinta(malli,3,4);
    }
    
  

   
    @Test
    public void testTulostaPinta() {
     
    }
    
}
