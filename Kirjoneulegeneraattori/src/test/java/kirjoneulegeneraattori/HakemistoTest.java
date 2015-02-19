

package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class HakemistoTest {
    Hakemisto hakemisto;
    Malli malli1;
    Malli malli2;
    Set<Color> varit1;
    Set<Color> varit2;
    public HakemistoTest() {
       }
    
   
    
    @Before
    public void setUp() {
        
     hakemisto=new Hakemisto();
     varit1=new HashSet<Color>();
     varit1.add(Color.BLACK);
     varit1.add(Color.GRAY);
     varit2=new HashSet<Color>();
     varit2.add(Color.GREEN);
     varit2.add(Color.RED);
     varit2.add(Color.YELLOW);
     malli1=new Malli(2,5,varit1);
     malli1.vaihdaNimi("Malli1");
     malli2=new Malli(3,10,varit2);
     malli2.vaihdaNimi("Malli2");
     
     
    }
   @Test
   public void testLisaaMalli(){
       hakemisto.lisaaMalli(malli1);
       assertEquals("Malli1", hakemisto.haeMalli("Malli1").nimi());
       
   }
   @Test 
   public void testHaeMalli(){
       hakemisto.lisaaMalli(malli1);
       hakemisto.lisaaMalli(malli2);
       assertEquals("Malli2", hakemisto.haeMalli("Malli2").nimi());
   }
   @Test 
   public void testHaeMalliOlemattomalla(){
       assertNull(hakemisto.haeMalli("2"));
   }
   @Test 
   public void testPoistaMalli(){
       hakemisto.lisaaMalli(malli2);
       hakemisto.poistaMalli(malli2);
       assertNull(hakemisto.haeMalli("Malli2"));
   }
   @Test
   public void testPoistaMalliOlematon(){
      hakemisto.poistaMalli(malli1);
      assertNull(hakemisto.haeMalli("Malli1"));
   }
 @Test
 public void testKoko(){
     hakemisto.lisaaMalli(malli1);
     hakemisto.lisaaMalli(malli2);
     assertEquals(2,hakemisto.koko());
 }
    
}
