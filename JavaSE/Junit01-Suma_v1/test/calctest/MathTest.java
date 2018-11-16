package calctest;

import org.junit.Test;

import function.Calculation;
import junit.framework.TestCase;

public class MathTest extends TestCase {

	//Hacer esto tiene sentido cuando todas las pruebas son los mismos valores
	private int value1;
	private int value2;

	public MathTest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("--setUp(): before every test invocation");
		value1 = 3;
		value2 = 5;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("--tearDown(): after every test method");		
		value1 = 0;
		value2 = 0;
	}

	//En Junit 3.x no es obligatorio esta anotacion
	//(JUnit 3-style): create a class that extends TestCase, 
	//    and start test methods with the word test. 
	//    When running the class as a JUnit Test (in Eclipse), 
	//    all methods starting with the word test are automatically run.
	@Test
	public void testAdd() {
		int total = 8;
		System.out.println("--@testAdd()");			
		int sum = Calculation.add(value1, value2);
		assertEquals(sum, total);
	}
	
	public void testCommutativeAdd() {
		System.out.println("--@testCommutativeAdd()");	
		int sum1 = Calculation.add(value1, value2);
		int sum2 = Calculation.add(value2, value1);	
		assertEquals(sum1, sum2);
	}	

	public void testFailedAdd() {
		int total = 8;
		System.out.println("--@testFailedAdd()");			
		int sum = Calculation.add(value1, value2);
		assertNotSame(sum, total);
	}
	
	public void testSub() {
		int total = 0;
		//Diseñar
		int rest = Calculation.sub(value1, value1);
		assertEquals(total, rest);

	}
}
