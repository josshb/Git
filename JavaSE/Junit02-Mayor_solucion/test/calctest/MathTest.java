package calctest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import function.Calculation;

public class MathTest {

	private static byte cont = 1;
	private static Logger logger;

	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(MathTest.class);
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		logger.info(">>> Iniciando las pruebas");
	}

	@Before
	public void executedBeforeEach() {
		System.out.println("");
		logger.info("=== PRUEBA "+(cont++)+" ======");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		logger.info(">>> Terminado las pruebas");
	}


	// --------
	// TEST
	// --------

	@Test
	public void testMayor() {
		logger.info("Test::testMayor(): 7 > 5");
		boolean result = new Calculation().isGreater(7, 5);
		assertTrue(result);
	}
	
	@Test
	public void testMenor() {
		logger.info("Test::testMenor(): 5 < 7");
		boolean result = new Calculation().isGreater(5, 7);
		assertFalse(result);
	}	
	
	@Test
	public void testIgual() {
		logger.info("Test::testIgual(): 5 = 5");
		boolean result = new Calculation().isGreater(5, 5);
		assertFalse(result);
	}	

}
