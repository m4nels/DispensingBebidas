package DispensingBebidas;

public class Bebida {

	private String nombre;
	private int stock;
	private int unidadesVendidas=0;	
	private double precio;


	public String getNombre() {
		 return nombre;
	}
	public int getStock() {
		 return stock;
	}
	public double getPrecio() {
		 return precio;
	}
	 
	public void setProducto (String nombreProducto, int stockProducto, double precioProducto) {
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
	
}
