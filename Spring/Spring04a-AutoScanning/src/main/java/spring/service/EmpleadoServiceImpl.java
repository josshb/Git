package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.EmpleadoDao;
import spring.model.Empleado;
import spring.util.Simulaciones;

//Incluye las capas de servicios y lógica
@Service("employeeService")
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao employeeDao;

	public EmpleadoServiceImpl() {

	}

	public EmpleadoServiceImpl(EmpleadoDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	public void saveEmployee(Empleado employee) {
		employee.setAssessmentDate(Simulaciones.fechaAleatoria());
		employeeDao.saveEmployee(employee);
	}

}
