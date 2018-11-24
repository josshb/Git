package spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver5 {
	
	@Autowired
	@Qualifier("camion")
	// @Qualifier es �til cuando se pueden emparejar varios beans
	//    si hay ambig�edad
	
	// Si no se hubiera colocado al lanzar en el main
	//   		Driver5 driver5 = (Driver5) context.getBean("driver5");
	// cuando crea el objero driver5 no sabr�a cual de las dos licencias podr�a utilizar
	//   y dar�a una excepci�n
	private iLicense5 license;
	
	public void tipoDeLicencia(){
		license.getLicencia();
	}
	
	public String toString() {
		return "Driver5 + " +  "@Qualifier para elegir licencia. ";
	}
	
}
