package control;


public class Elemento {

	
	
	private String Name;
	private String Symbol;
	private int numero;
	private int Contador=0;
	
	
	public void Elemento() {
		
	}
	
	public String getName() {
		return Name;
		
	}
	public String getSymbol() {
		return Symbol;
		
	}
	public int getNumero() {
		return numero;
		
	}
	public int getContador() {
		return Contador;
		
	}
	public void setName(String Name) {
		this.Name=Name;
		
	}
	public void setSymbol(String Symbol) {
		this.Symbol=Symbol;
		
	}
	public void setNumero(int numero) {
		this.numero=numero;
		
	}
	public void setContador (int Contador) {
		this.Contador=Contador;
		
	}

	@Override
	public String toString() {
		return "Elemento [Name=" + Name + ", Symbol=" + Symbol + ", numero=" + numero + ", Contador=" + Contador + "]";
	}
	
	
	
	


	

	
	
	
}
