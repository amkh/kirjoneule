

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            pohja=new Pohja(5,7);
        } catch (Exception ex) {
            
        }
    }
   

  
    @Test
    public void testUusiLeveys() {
        pohja.uusiLeveys(10);
       assertEquals(10,pohja.Leveys());
    }
    @Test
    public void testUusiLeveysLiikaa(){
        pohja.uusiLeveys(200);
        assertEquals(7,pohja.Leveys());
    }
 @Test
    public void testUusiLeveysNegatiivinen(){
        pohja.uusiLeveys(-13);
        assertEquals(7,pohja.Leveys());
    }

  
    @Test
    public void testUusiKorkeus() {
      pohja.uusiKorkeus(8);
      assertEquals(8,pohja.Korkeus());
    }
    
    @Test
    public void testUusiKorkeusLiikaa(){
        pohja.uusiKorkeus(102);
        assertEquals(5,pohja.Korkeus());
    }

  @Test
    public void testUusiKorkeusNegatiivinen(){
        pohja.uusiKorkeus(-12);
        assertEquals(5,pohja.Korkeus());
    }

    @Test
    public void testUusiKoko() {
     pohja.uusiKoko(2,6);
     assertEquals(6,pohja.Leveys());
     assertEquals(2,pohja.Korkeus());
    }
    
   @Test
    public void testUusiKokoLiikaa1() {
     pohja.uusiKoko(102,6);
     assertEquals(7,pohja.Leveys());
     assertEquals(5,pohja.Korkeus());
    }
 @Test
    public void testUusiKokoLiikaa2() {
     pohja.uusiKoko(1,130);
     assertEquals(7,pohja.Leveys());
     assertEquals(5,pohja.Korkeus());
    }
 @Test
    public void testUusiKokoNegatiivinen1() {
     pohja.uusiKoko(-2,6);
     assertEquals(7,pohja.Leveys());
     assertEquals(5,pohja.Korkeus());
    }
    @Test
    public void testUusiKokoNegatiivinen2() {
     pohja.uusiKoko(12,-6);
     assertEquals(7,pohja.Leveys());
     assertEquals(5,pohja.Korkeus());
    }
 
 
    @Test
    public void testKorkeus() {
        assertEquals(5,pohja.Korkeus());
     
    }

 
    @Test
    public void testLeveys() {
      assertEquals(7,pohja.Leveys());
    }

    
    @Test
    public void testHaeSopivalla() {
     
      
      Ruutu ruutu=pohja.hae(2,3);
      assertEquals(Color.WHITE,ruutu.vari());
   
      
    }
    @Test
    public void testHaeIsollaLeveydella(){
       
            assertNull(pohja.hae(1,11));
        
    }
   @Test
    public void testHaeIsollaKorkeudella(){
        assertNull(pohja.hae(12,2));
    }
    @Test
    public void testHaeNagatiivisellaLeveydella(){
        assertNull(pohja.hae(1,-1));
    }
    @Test
    public void testHaeNegatiivisellaKorkeudella(){
     
            assertNull(pohja.hae(-2, 3));
        
    }
    @Test 
    public void luoSopivaKorkeus(){
        assertEquals(5,pohja.Korkeus());
    }
     @Test 
    public void luoSopivaLeveys(){
        assertEquals(7,pohja.Leveys());
    }
    @Test 
    public void testDefaultVari(){
       
        for(int nn=0;nn<5;nn++){
            for(int mm=0;mm<7;mm++){
                assertEquals(Color.WHITE,pohja.hae(nn, mm).vari());
            }
        }
    }
   
}
