

package kirjoneulegeneraattori;

import kirjoneulegeneraattori.Malli;
import kirjoneulegeneraattori.Ruutu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MalliTest {
    
    public MalliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testNimi() {
        System.out.println("nimi");
        Malli instance = null;
        String expResult = "";
        String result = instance.nimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testVaihdaNimi() {
        System.out.println("vaihdaNimi");
        Malli instance = null;
        instance.vaihdaNimi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testVaihdaVari() {
        System.out.println("vaihdaVari");
        Malli instance = null;
        instance.vaihdaVari();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testKorkeus() {
        System.out.println("Korkeus");
        Malli instance = null;
        int expResult = 0;
        int result = instance.Korkeus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testLeveys() {
        System.out.println("Leveys");
        Malli instance = null;
        int expResult = 0;
        int result = instance.Leveys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testHae() {
        System.out.println("hae");
        int n = 0;
        int m = 0;
        Malli instance = null;
        Ruutu expResult = null;
        Ruutu result = instance.hae(n, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
