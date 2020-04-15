package DispensingBebidas;

import java.util.Scanner;

public class Bebida {

	private int idProducto;
	private String nombre;
	private int stock;
	private int cantidadReposicion=0;
	private int unidadesVendidas=0;	
	private double precio;
	//private double recaudacionProductoTotal;


	public String getNombre() {
		 return nombre;
	}
	public int getStock() {
		 return stock;
	}
	public double getPrecio() {
		 return precio;
	}
	public double getUnidadesVendidas() {
		 return unidadesVendidas;
	}
	
	public double getRecaudacionProductoTotal () {
		return this.unidadesVendidas * this.precio;
	}
	 
	public int getReposicion () {
		return this.stock = this.cantidadReposicion; // ********* porque no se pone igual el this.cantidadReposicion i this.stock
	}
	
	public void setProducto (int idProducto, String nombreProducto, int stockProducto, double precioProducto) {
		this.idProducto = idProducto;
		this.nombre = nombreProducto;
		this.stock = stockProducto;
		this.precio = precioProducto;
	}
	
	public void vendaStock () {
		if(this.stock > 0) {
			//podemos vender bebida
			this.stock = this.stock-1; // restar 1 unidad al stock
			this.unidadesVendidas = this.unidadesVendidas+1; // añadir 1 undad vendida
			System.out.println("Ha elegido usted: "+this.nombre);
			System.out.println("Retire su producto. Gracias por su compra.");
			System.out.println("Stock: "+this.stock);
			System.out.println("Vendidas: "+this.unidadesVendidas);
		}
		else {
			// devolver moneda y avisar
			System.out.println("Producto agotado. Retire su dinero.");
			System.out.println();
		}
	}
	
	public void consultaStock () {
		System.out.println(this.idProducto+". "+this.nombre+" tiene un stock de "+this.stock+" unidades.");
	}
	
	
	public void setReponerProducto() {
		System.out.println("Indique cantidad a reponer:");
		Scanner scanner = new Scanner (System.in);
		cantidadReposicion = scanner.nextInt();
	}
	
		public void recaudacionProducto () {
		System.out.println(this.idProducto+". "+this.nombre+" se han vendido "+this.unidadesVendidas+" unidades.");
		System.out.println(this.nombre+" ha recaudado "+(this.unidadesVendidas*this.precio)+" €.");
	}
	
	
	
	
}
