package calctest;

import function.Calculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class MathTest {

	private int value1;
	private int value2;
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
		value1 = 3;
		value2 = 5;
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		logger.info("@AfterClass: Al final de las pruebas");
	}

	@After
	public void executedAfterEach() {
		// Sustituye al tearDown
		logger.info("@After: Despues de cada prueba");
		value1 = 0;
		value2 = 0;
	}

	@Ignore
	//Puedes usarlo en vez de comentar el método para que no se ejecute
	//http://junit.sourceforge.net/javadoc/org/junit/Ignore.html
	public void executionIgnored() {
		logger.info("@Ignore: This execution is ignored");
	}

	// --------
	// TEST
	// --------

	@Test
	public void testAdd() {
		int total = 8;
		logger.info("Test::testAdd(): suma dos numeros positivos");
		int sum = Calculation.add(value1, value2);
		assertEquals(sum, total);
	}

	@Test
	public void testCommutativeAdd() {
		logger.info("Test::testCommutativeAdd()");
		int sum1 = Calculation.add(value1, value2);
		int sum2 = Calculation.add(value2, value1);
		assertEquals(sum1, sum2);
	}

	@Test
	public void testFailedAdd() {
		int total = 9;
		logger.info("Test::testFailedAdd()");
		int sum = Calculation.add(value1, value2);
		assertNotSame(sum, total);
	}

	@Test
	public void testSub() {
		int total = 0;
		logger.info("Test::testSub()");
		int sub = Calculation.sub(value1, value1);
		assertEquals(sub, total);
	}
}
