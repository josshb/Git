package spring.domain;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("driver4")
public class Driver4 {
	
	// Marca un recurso necesario para la aplicaci�n
	// Se parece a @Autowired en que ambos inyectan beans por tipo
	//      cuando no se proporcionan atributos
	// Pero @Resource permite inyectar un bean por su nombre y @autowired no
	
	// En el siguiente caso un bean cuyo nombre es "license4" y que se encuentra en Context, debe inyectarse
	// Lo bueno de esto es que puedo tener como atributo una interfaz
	// y con el nombre le inyecto una implementacion concreta
	// Lo veremos en el ejercicio 5
	@Resource(name="license4")	
	private License4 license;
	
	@Override
	public String toString() {
		return "Driver4 [license4=" + license + "]" + " @resource con nombre";
	}
	
	
}
