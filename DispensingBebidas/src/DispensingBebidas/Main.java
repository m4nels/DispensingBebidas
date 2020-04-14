package DispensingBebidas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Maquina oMaquina = new Maquina();
		Bebida refreco01 = new Bebida();
		Bebida refreco02 = new Bebida();
		Bebida refreco03 = new Bebida();
		Bebida refreco04 = new Bebida();
		Bebida refreco05 = new Bebida();
		Bebida refreco06 = new Bebida();

		
		refreco01.setProducto("Coca-Cola", 2, 1.50);
		refreco02.setProducto("Coca-Cola Zero", 10, 1.55);
		refreco03.setProducto("Fanta Naranja", 10, 1.50);
		refreco04.setProducto("Fanta Limón", 10, 1.50);
		refreco05.setProducto("Acuarius", 10, 1.60);
		refreco06.setProducto("Sprite", 10, 1.60);
	
		
		int opcion = 0;
		//int opcionBebida=0;
		//int cantidadReposicion;
		
		Scanner scanner = new Scanner (System.in);
		
		// INSERTAR SALDO!!!!!!!!!!!!!!!!!------------------------------------------------------------------
		
		while ( opcion != 6) {		
			System.out.println("Seleccione opción:");
			System.out.println("1. Comprar bebida");
			System.out.println("2. Stock");
			System.out.println("3. Recaudación");
			System.out.println("4. Reposición Stock");
			System.out.println("5. Salir");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			case 1:
				
				oMaquina.setComprar();
				
				switch(oMaquina.getOpcionBebida()) {
				case 1:
					refreco01.vendaStock();
					break;
				case 2:
					refreco02.vendaStock();
					break;
				case 3:
					refreco03.vendaStock();
					break;
				case 4:
					refreco04.vendaStock();
					break;
				case 5:
					refreco05.vendaStock();
					break;
				case 6:
					refreco06.vendaStock();
					break;
				}
			}
		}


	/*	int opcion = 0;
		int cantidadReposicion;
		
		Scanner scanner = new Scanner (System.in);
		
		oMaquina.inicializar(100, 500);
		
		while ( opcion != 5) {
			System.out.println("Seleccione opción:");
			System.out.println("1. Comprar bebida");
			System.out.println("2. Stock disponible");
			System.out.println("3. Recaudación");
			System.out.println("4. Reposición Stock");
			System.out.println("5. Salir");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			case 1:
				oMaquina.comprar();
				break;
			case 2:
				System.out.println("El Stock disponible és: "+ oMaquina.getStockDisponible());
				System.out.println();
				break;
			case 3:
				System.out.println("La recaudación és de: "+ oMaquina.getRecaudacion()+"€");
				System.out.println();
				break;
			case 4:
				System.out.print("Indique nuevo stock: ");
				cantidadReposicion = scanner.nextInt();
				oMaquina.reposicionStock(cantidadReposicion);
				System.out.println("El Stock actual és: "+ oMaquina.getStockDisponible());
				System.out.println();
				break;
			}
		}*/
	}

}
