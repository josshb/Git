package enums;

public class Enums {
enum Talla{
	mini("s"), Mediano("m"), 
	Grande("l"),muygrande("xl");
	
	private String abreviatura;
	
	private Talla(String abreviatura) {
		this.abreviatura=abreviatura;
		
	}
	public String dameabreviatura() {
		// TODO Auto-generated method stub
		return abreviatura;
	}
}

}