package ejercicios.ej06;

public class Compra {
	
	private double total;
	
	public Compra(double total) {
		this.total = total;
	}
	
	public void getTotal() {
		System.out.println(this.total);
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void mostrarTotalConDescuento() {
		double totalConDescuento = this.total * 0.85;

		System.out.printf("Total: %.2f€ \n", this.total);
		System.out.printf("Descuento: %.2f€ \n", this,total*0.15);
		System.out.printf("Total con descuento: %.2f€ \n", totalConDescuento);
		
	}
	
}
