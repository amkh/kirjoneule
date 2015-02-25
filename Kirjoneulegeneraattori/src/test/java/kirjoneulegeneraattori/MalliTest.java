

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

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
    Set<Color> varit;
    
    public MalliTest() {
    }
    
 
    
    @Before
    public void setUp() {
        varit= new HashSet<Color>();
        varit.add(Color.WHITE);
        varit.add(Color.BLUE);
        varit.add(Color.BLACK);
        malli=new Malli(7,9,varit);
    }


    
    @Test
    public void testDefaultNimi() {
        assertEquals("malli",malli.nimi());
    
    }

 
    @Test
    public void testVaihdaNimi() {
        malli.vaihdaNimi("aaa");
        assertEquals("aaa",malli.nimi());
       
    }

    
    @Test
    public void testKorkeus() {
       assertEquals(7,malli.Korkeus());
    }

  
    @Test
    public void testLeveys() {
        assertEquals(9,malli.Leveys());
    }

    @Test
    public void testHaeVarit() {
        HashSet<Color> varit1= new HashSet<Color>();
        varit1.add(Color.WHITE);
        varit1.add(Color.BLUE);
        varit1.add(Color.BLACK);
        assertEquals(varit1, malli.varit());
   
    }
    
    @Test 
    public void testLisaaVari(){
      Color vari=Color.RED;
      malli.lisaaVari(vari);
      assertTrue(malli.haeVari(vari));
       
    }
    @Test 
    public void testPoistaVari(){
      Color vari=Color.BLUE;
      malli.poistaVari(vari);
      assertFalse(malli.haeVari(vari));
    }
    
    @Test
    public void testVaritaRuutu(){
        Color vari=Color.BLACK;
        malli.varitaRuutu(1, 1, vari);
        assertEquals(Color.BLACK,malli.hae(1, 1).vari());
    }
    @Test
    public void testVaritaRuutuVaaralla(){
        Color vari=Color.MAGENTA;
        malli.varitaRuutu(1, 1, vari);
        assertEquals(Color.WHITE,malli.hae(1, 1).vari());
    }
           
    @Test
    public void testVaihdaVari(){
        Color vari1=Color.BLACK;
        Color vari2=Color.BLUE;
        malli.varitaRuutu(2, 4, vari1);
        malli.varitaRuutu(2, 4, vari2);
        assertEquals(Color.BLUE,malli.hae(2, 4).vari());
        
    }
    @Test
    public void testVaihdaVariVaarin(){
        Color vari1=Color.BLACK;
        Color vari2=Color.MAGENTA;
        malli.varitaRuutu(1, 1, vari1);
        malli.varitaRuutu(1, 1, vari2);
        assertEquals(Color.BLACK,malli.hae(1, 1).vari());
        
    }
}
