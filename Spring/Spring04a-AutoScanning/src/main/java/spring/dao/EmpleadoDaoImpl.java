package spring.dao;

import org.springframework.stereotype.Repository;

import spring.model.Empleado;

//Se utiliza para las capas de persistencia
@Repository("employeeDao")
public class EmpleadoDaoImpl implements EmpleadoDao {

	public void saveEmployee(Empleado employee) {

		System.out.println("Empleado " + employee.getName() + " registrado");
		System.out.println("D�a del registro " + employee.getAssessmentDate());

	}

}
