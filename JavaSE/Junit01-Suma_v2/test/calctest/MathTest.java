package calctest;

import function.Calculation;
import junit.framework.TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class MathTest {

	private int value1;
	private int value2;
    private static Logger logger;
    
    //Inicializo
    static {
        try {
             logger = LogManager.getLogger(MathTest.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }
    
    
	public MathTest() {
	}
	
	//Uso ya Junit 4.x (fijate que no hago    extends TestCase)
	//Ojo: NO usaremos el setUp (fijate que no aparece este texto)
	//     en el proximo ejercicio usaremos anotaciones

	protected void setUp() throws Exception {
		logger.info("setUp(): before every test invocation");
		value1 = 3;
		value2 = 5;
	}

	protected void tearDown() throws Exception {
		logger.info("tearDown(): after every test method");		
		value1 = 0;
		value2 = 0;
	}

	@Test
	public void testAdd() {
		int total = 8;
		logger.info("Test::testAdd()");			
		int sum = Calculation.add(4, 5);
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
		int sub = Calculation.sub(4, 4);
		assertEquals(sub, total);
	}
}
