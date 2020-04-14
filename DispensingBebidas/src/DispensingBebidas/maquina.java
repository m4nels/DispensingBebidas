package DispensingBebidas;

public class maquina {
	
	int stock=0;
	int unidadesVendidas=0;
	int precio=500;
	boolean pagado=false;
	
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
	}
}
