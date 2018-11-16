package function;

import function.Calculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class MathTest {

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
		logger.info("@BeforeClass: Al inicio de las pruebas");
	}

	@Before
	public void executedBeforeEach() {
		// Sustituye al setUp
		logger.info("@Before: Antes de cada prueba");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		logger.info("@AfterClass: Al final de las pruebas");
	}

	@After
	public void executedAfterEach() {
		// Sustituye al tearDown
		logger.info("@After: Despues de cada prueba");
	}

	@Ignore
	public void executionIgnored() {
		logger.info("@Ignore: This execution is ignored");
	}

	// --------
	// TEST
	// --------

	@Test
	public void sumaPositivoNegativo() {
		logger.info("Test::sumaPositivoNegativo(): suma número positivo y número negativo ...");
		assertTrue(Calculation.add(2, -3) == -1);
	}

	@Test
	public void sumaAsimetrica() {
		logger.warn("Test::sumaAsimetrica(): Fallo. Comprobando la asimetria ...");
		assertFalse(Calculation.add(2, 4) == Calculation.add(4, 2));
	}

	@Test
	public void testAdd() {
		logger.info("Test::testAdd(): suma dos numeros positivos");
		assertEquals(Calculation.add(2, 4), 6);
	}

	@Test
	public void testAddNegativos() {
		logger.info("Test::testAddNegativos(): suma dos numeros negativos");
		assertEquals(Calculation.add(-3, -5), -8);
	}

	@Test
	public void testCommutativeAdd() {
		logger.info("Test::testCommutativeAdd(): Comprobando la simetria");
		assertEquals(Calculation.add(2, 4),Calculation.add(4, 2));
	}

	@Test
	public void testFailedAdd() {
		logger.info("Test::testFailedAdd()");
		assertNotSame(Calculation.add(2, 4), 7);
	}

	@Test
	public void testSub() {
		logger.info("Test::testSub()");
		assertEquals(Calculation.sub(4, 4), 0);
	}

}
