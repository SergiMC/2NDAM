package testMajor;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Major.Major;

class testMajor {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll: setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll: tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach : setUp");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		assertNotNull(Major.mayor(new int[] {1,2,3}));
		System.out.println("@AfterEach: testList Not Null");
	}

	
	@Test
	void testMayorListNums() {
		assertEquals(9, Major.mayor(new int[] {3, 7, 9, 8}));
		System.out.println("@TestMayorListNums: {3, 7, 9, 8}");
	}
	
	
	@Test
	void testMayorUniqueList() {
		assertThrows(RuntimeException.class, () -> Major.mayor(new int[] {}));
		

	}
	

	@Test
	void testMayorExtra() {
		try {
			Major.mayor(new int[] {});
			fail("Error, no llança excepció erronea");
		}
		
		catch(Exception e){
			assertTrue(true);
			
		}
		
		
	}
	

}
