package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;

import spring.configuration.AppConfig;
import spring.model.Empleado;
import spring.service.EmpleadoService;

@Controller("controlEmpleados")
public class ControlEmpleados {

	@Autowired
	private EmpleadoService empService;

	public void prueba() {
		// Le indico donde se encuentra la configuración
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Si quieres que no se emplee configuración mediante una clase, puedes
		// incluir estas tres lineas en vez de la anterior
		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext();
		// context.scan("spring");
		// context.refresh();

		empService = (EmpleadoService) context.getBean("employeeService");

		// Prueba: Registramos el nuevo empleado
		Empleado employee = new Empleado("Antonio Santos");

		empService.saveEmployee(employee);

		context.close();
	}

}
