package utilities;

import lados.Lados;
public class ComparadorLados {
	/*int L1=new Lados().getLado1();
	int L2=new Lados().getLado2();
	int L3=new Lados().getLado3();
	
	public int Comparacion() {
		
		
	int LadoMasLargo=Math.max (L1,L2);
	int Largo=0;
	LadoMasLargo=Largo;
	
	LadoMasLargo=Math.max(Largo, L3);
	return LadoMasLargo;
	}*/
	public int LadoMasLargo;
	
	public int getLadoMasLargo() {
		return LadoMasLargo;
		
	}
	public void setLadoMasLargo(int LadoMasLargo) {
		int L1=new Lados().getLado1();
		int L2=new Lados().getLado2();
		int L3=new Lados().getLado3();
		
		int LadoLargo=Math.max (L1,L2);
		
		
		LadoLargo=Math.max(LadoLargo, L3);
		LadoLargo=LadoMasLargo;
		this.LadoMasLargo=LadoMasLargo;
	}
	
	

}
