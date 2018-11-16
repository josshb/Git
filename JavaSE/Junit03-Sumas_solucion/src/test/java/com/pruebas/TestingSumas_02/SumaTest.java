package com.pruebas.TestingSumas_02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class SumaTest {
	
	private static byte cont = 1;
	private static Logger logger;

	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(SumaTest.class);
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
	   public void sumaPositivos() {
		   logger.info("Sumando dos números positivos ...");
	       assertTrue(new Suma(2,3).sumar() == 5);
	   }

	   @Test
	   public void sumaNegativos() {
		   logger.info("Sumando dos números negativos ...");
	       assertTrue(new Suma(-2,-3).sumar() == -5);
	   }

	   @Test
	   public void sumaPositivoNegativo() {
		   logger.info("Sumando un número positivo y un número negativo ...");
	       assertTrue(new Suma(2,-3).sumar() == -1);
	   }
	   
	   @Test
	   public void sumaSimetrica() {
		   logger.info("Comprobando la simetria ...");
	       Suma S1 = new Suma(2, 3);
	       Suma S2 = new Suma(3, 2);
	       assertTrue(S1.sumar() == S2.sumar());
	   }	
	   
	   @Test
	   public void sumaASimetrica() {
		   logger.warn("Fallo. Comprobando la asimetria ...");
	       Suma S1 = new Suma(2, 4);
	       Suma S2 = new Suma(3, 2);
	       assertTrue(S1.sumar() == S2.sumar());
	   }		   
} 