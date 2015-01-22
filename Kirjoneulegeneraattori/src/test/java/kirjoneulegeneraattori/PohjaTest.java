

package kirjoneulegeneraattori;

import kirjoneulegeneraattori.Pohja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PohjaTest {
    
    Pohja pohja;
    
    
    public PohjaTest() {
    }
    
 
    
    @Before
    public void setUp() {
        pohja=new Pohja(5,7);
    }
    
   

  
    @Test
    public void testUusiLeveys() {
       
    }

  
    @Test
    public void testUusiKorkeus() {
      
    }

 
    @Test
    public void testUusiKoko() {
     
    }

 
    @Test
    public void testKorkeus() {
     
    }

 
    @Test
    public void testLeveys() {
      
    }


    @Test
    public void testHaeSopivalla() {
      pohja.hae(2, 3);
    }
    @Test
    public void testHaeIsolla1(){
        pohja.hae(1, 11);
    }
    @Test
    
}
