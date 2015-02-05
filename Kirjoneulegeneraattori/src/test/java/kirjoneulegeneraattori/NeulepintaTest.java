package kirjoneulegeneraattori;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import kirjoneulegeneraattori.Neulepinta;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NeulepintaTest {

    Neulepinta pinta;
    Malli malli;
    Set<Color> varit;

    public NeulepintaTest() {
    }

    @Before
    public void setUp() {
        varit = new HashSet<Color>();
        varit.add(Color.WHITE);
        varit.add(Color.BLUE);
        varit.add(Color.BLACK);
        malli = new Malli(2, 3, varit);
        malli.varitaRuutu(0, 0, Color.WHITE);
        malli.varitaRuutu(0, 1, Color.BLACK);
        malli.varitaRuutu(0, 2, Color.WHITE);
        malli.varitaRuutu(1, 0, Color.BLUE);
        malli.varitaRuutu(1, 1, Color.WHITE);
        malli.varitaRuutu(1, 2, Color.BLUE);

        try {
            pinta = new Neulepinta(malli, 3, 4);

        } catch (Exception ex) {

        }

    }

    @Test
    public void testKorkeus() {
        assertEquals(6, pinta.korkeus());
    }

    @Test
    public void testLeveys() {
        assertEquals(12, pinta.leveys());
    }

    @Test
    public void testLuoOikein() {
        assertEquals(Color.BLACK, pinta.hae(0, 1).vari());
        assertEquals(Color.BLACK, pinta.hae(0, 7).vari());
        assertEquals(Color.BLACK, pinta.hae(2, 7).vari());
        assertEquals(Color.BLACK, pinta.hae(4, 4).vari());
        assertEquals(Color.BLACK, pinta.hae(4, 10).vari());
        assertEquals(Color.WHITE, pinta.hae(0, 0).vari());
        assertEquals(Color.WHITE, pinta.hae(2, 9).vari());
        assertEquals(Color.WHITE, pinta.hae(5, 1).vari());
        assertEquals(Color.BLUE, pinta.hae(1, 2).vari());
        assertEquals(Color.BLUE, pinta.hae(3, 6).vari());
        assertEquals(Color.BLUE, pinta.hae(5, 11).vari());
    }

}
