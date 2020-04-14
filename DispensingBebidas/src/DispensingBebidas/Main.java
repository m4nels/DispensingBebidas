package DispensingBebidas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		maquina oMaquina = new maquina ();
		int opcion = 0;
		int cantidadReposicion;
		
		Scanner scanner = new Scanner (System.in);
		
		oMaquina.inicializar(100, 500);
		
		while ( opcion != 5) {
			System.out.println("Seleccione opci�n:");
			System.out.println("1. Comprar bebida");
			System.out.println("2. Stock disponible");
			System.out.println("3. Recaudaci�n");
			System.out.println("4. Reposici�n Stock");
			System.out.println("5. Salir");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			case 1:
				oMaquina.comprar();
				break;
			case 2:
				System.out.println("El Stock disponible �s: "+ oMaquina.getStockDisponible());
				System.out.println();
				break;
			case 3:
				System.out.println("La recaudaci�n �s de: "+ oMaquina.getRecaudacion()+"�");
				System.out.println();
				break;
			case 4:
				System.out.print("Indique nuevo stock: ");
				cantidadReposicion = scanner.nextInt();
				oMaquina.reposicionStock(cantidadReposicion);
				System.out.println("El Stock actual �s: "+ oMaquina.getStockDisponible());
				System.out.println();
				break;
			}
		}
	}

}
