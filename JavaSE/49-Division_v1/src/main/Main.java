package main;

public class Main {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 0;

		
		try{
		    System.out.println("Voy a arriesgarme mucho");			
			int div = num1/num2;
			System.out.println("Division: "+div);
		}
		catch (ArithmeticException e){
		     System.out.println("Esta la cosa mu malita");
		     System.out.println(e.toString());
		     e.printStackTrace();
		     System.out.println("Jarrrrlllll");		     
		}
		finally{
			System.out.println("Ta luego, Lucas");
		}
		System.out.println("Sa cabó");
		
		
		
		
	}
	
	
	


}
