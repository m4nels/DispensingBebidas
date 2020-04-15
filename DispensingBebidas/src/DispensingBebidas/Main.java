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

		
		refreco01.setProducto(1,"Coca-Cola", 2, 1.50);
		refreco02.setProducto(2,"Coca-Cola Zero", 10, 1.55);
		refreco03.setProducto(3,"Fanta Naranja", 10, 1.50);
		refreco04.setProducto(4,"Fanta Limón", 10, 1.50);
		refreco05.setProducto(5,"Acuarius", 10, 1.60);
		refreco06.setProducto(6,"Sprite", 10, 1.60);
		 
	
		int opcion = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		// INSERTAR SALDO!!!!!!!!!!!!!!!!!------------------------------------------------------------------
		
		while ( opcion != 6) {		
			System.out.println("Seleccione opción:");
			System.out.println("1. Comprar bebida");    // ok
			System.out.println("2. Stock");    // ok
			System.out.println("3. Recaudación");    // ok
			System.out.println("4. Reposición Stock");    // ******* error, no cambia el stock actual por el estoc que se entra
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
					
				case 2:
					System.out.println("El estock actual és de:");
					refreco01.consultaStock();
					refreco02.consultaStock();
					refreco03.consultaStock();
					refreco04.consultaStock();
					refreco05.consultaStock();
					refreco06.consultaStock();
					System.out.println();
					break;
					
				case 3:
					System.out.println("La recaudación por productos és:");
					refreco01.recaudacionProducto();
					refreco02.recaudacionProducto();
					refreco03.recaudacionProducto();
					refreco04.recaudacionProducto();
					refreco05.recaudacionProducto();
					refreco06.recaudacionProducto();
					System.out.println();
					System.out.println("La recaudacion total és de: "+(refreco01.getRecaudacionProductoTotal()
							  +refreco02.getRecaudacionProductoTotal()
							  +refreco03.getRecaudacionProductoTotal()
							  +refreco04.getRecaudacionProductoTotal()
							  +refreco05.getRecaudacionProductoTotal()
							  +refreco06.getRecaudacionProductoTotal())+"€.");
					System.out.println();
					break;
					
				case 4:
				
					oMaquina.setReponer();
					
					switch(oMaquina.getOpcionBebida()) {
					case 1:
						refreco01.setReponerProducto();
						refreco01.consultaStock();
						System.out.println("repo "+refreco01.getReposicion());// ********* porque no se pone igual el this.cantidadReposicion i this.stock
						break;
					case 2:
						refreco02.setReponerProducto();
						break;
					case 3:
						refreco03.setReponerProducto();
						break;
					case 4:
						refreco04.setReponerProducto();
						break;
					case 5:
						refreco05.setReponerProducto();
						break;
					case 6:
						refreco06.setReponerProducto();
						break;
					}
					
					break;
			}
		}

	}

}
