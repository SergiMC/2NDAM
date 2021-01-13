package travelagency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WalkingTest {
	
	private static Trip t1;
	private static Trip t2;
    private static Person a1;
    private static Group g1;
    private static Child a2;
    private static Child a3;
    private static Child a4;
    private static Child a5;
    private static Child a6;
    private static Child a7;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
    void setUp() {
        t1 = new Walking("Passejant per Barcelona", 1, "10/06/2012", "10/06/2012", 30);
        t2 = new Walking("Passejant per Madrid", 7, "20/06/2012", "20/06/2012", 30);
        a1 = new Adult("39449341L", "Sergi Muca");
        a2 = new Child("39119321S", "Baby Pluto");
        a3 = new Child("39119221A", "Joan Petit");
        a4 = new Child("39119331W", "Adri Petit");
        a5 = new Child("39449221A", "Jonas Petit");
        a6 = new Child("39339221X", "Michael Petit");
        a7 = new Child("39229221M", "Eric Petit");

        g1 = new Group();
    
    }
	
	@Test
	void testAdd_Nen_KO() {
		g1.add(a2);
		t1.add(g1);
		assertFalse(t1.add(g1));
	}
	
	
	@Test
	void testAdd_2AdultsKO() {
		/*Afegir Nen*/
		g1.add(a2);
		assertFalse(t1.add(g1));
	}
	


	@Test
	void testAdd_2Adults_OK() {
		/*Afegir Adult */
		g1.add(a1);
		assertTrue(t1.add(g1));
	}
	
	@Test
	void testAdd_MultiChild_KO() {
		/*Afegir Adult */
		g1.add(a1);
		g1.add(a2);
		g1.add(a3);
		g1.add(a4);
		g1.add(a5);
		g1.add(a6);
		g1.add(a7);
		assertFalse(t2.add(g1));
	}
	
	@Test
	void testAdd_MultiChild_OK() {
		/*Afegir Adult */
		g1.add(a1);
		g1.add(a2);
		g1.add(a3);
		g1.add(a4);
		g1.add(a5);
		g1.add(a6);
		assertTrue(t2.add(g1));
	}
	
	@Test
	void testpricePerPerson_OK() {
		/*Afegir Adult */
		g1.add(a1);
		g1.add(a2);
		g1.add(a3);
		g1.add(a4);
		g1.add(a5);
		g1.add(a6);
		t2.add(g1);
		assertEquals(27., t2.pricePerPerson(), 0);
	}
	
	@Test
	void testpricePerPerson2_OK() {
		/*Afegir Adult */
		g1.add(a1);
		g1.add(a2);
		t2.add(g1);
		assertEquals(30., t2.pricePerPerson(), 0);
	}
	
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
