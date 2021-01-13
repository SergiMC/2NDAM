package travelagency;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HikingTest {

    private static Trip t1;
    private static Person a1;
    private static Group g1;
    private static Trip t2;
    private static Person a2;
    private static Group g2;
    private static Child a3;


    @BeforeEach
    void setUp() {
        t1 = new Hiking("Passejant pel Montseny", 5, "10/06/2012", "10/06/2012", 30);
        t2 = new Hiking("Passejant per Collserola", 7, "20/01/2020", "20/01/2020", 30);
        a1 = new Adult("11", "Joan Grau");
        a2 = new Adult("39449342H","Sergi Muca");
        a3 = new Child("39119321S", "Baby Pluto");
        g1 = new Group();
        g2 = new Group();
    }

    @Test
    public void testPriceMes() {
        g1.add(a1);
        t1.add(g1);
        assertEquals(30., t1.pricePerPerson(), 0);
    }
    
    
    
    @Test
    public void testPriceMes1() {
        g2.add(a2);
        t2.add(g2);
        assertEquals(33., t2.pricePerPerson(), 0);
    }
    
    
    @Test
    public void testNen() {
    	g2.add(a3);
    	assertFalse(t2.add(g2));
    }
    
    @Test
	void test() {
		fail("Not yet implemented");
	}

    
    
}
