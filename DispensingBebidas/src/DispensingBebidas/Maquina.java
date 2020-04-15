package DispensingBebidas;

import java.util.Scanner;

public class Maquina {
	
	private int opcionBebida;

	
	public int getOpcionBebida() {
		return opcionBebida;
	}	
	
	public void setComprar() {
		System.out.println("Seleccione una bebida:");
		Scanner scanner = new Scanner (System.in);
		opcionBebida = scanner.nextInt();
	}
	
	public void setReponer() {
		System.out.println("Seleccione la bebida a reponer:");
		Scanner scanner = new Scanner (System.in);
		opcionBebida = scanner.nextInt();
	}
	

}
