package spring.model;

import java.util.Date;

public class Empleado {

	private int id;
	private String name;
	private Date assessmentDate;

	public Empleado() {
		super();
	}

	public Empleado(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", assessmentDate=" + assessmentDate + "]";
	}

}
