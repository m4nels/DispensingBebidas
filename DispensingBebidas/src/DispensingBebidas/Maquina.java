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
	
	
		
		/*
	private int stock=0;
	private int unidadesVendidas=0;
	private int precio=500;
	private boolean pagado=false;
	
	public void inicializar (int stockActual, int precioActual) {
		this.stock = stockActual;
		this.precio = precioActual;
	}
	
	public void comprar() {
		if(this.stock > 0) {
			//podemos vender bebida
			this.stock = this.stock-1; // restar 1 unidad al stock
			this.unidadesVendidas = this.unidadesVendidas+1; // añadir 1 undad vendida
			System.out.println("Retire su bebida. Gracia por su compra!");
			System.out.println();
		}
		else {
			// devolver moneda y avisar
			System.out.println("Producto agotado. Retire dinero.");
			System.out.println();
		}
	}
	public int getStockDisponible () {
		return this.stock;
	}
	
	public int getRecaudacion () {
		return this.unidadesVendidas * this.precio;
	}
	
	public void reposicionStock (int cantidadReposicionStock) {
		this.stock = cantidadReposicionStock;
	}*/
}
