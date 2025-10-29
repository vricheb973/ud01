package ejercicios.examen.monedero;

/*
 * Total dinero de monedas
 * Clase: Monedero
 * Atributos:  cincoEuros (int), dosEuros(int), unEuro (int), cent50(int), cent20(int)
 * Método: calcularTotalEuros(): Calcula y muestra el total de dinero en euros y céntimos. 
 * Ojo, no vale mostrar decimales. 
 * Ejemplo: Total: 1,20€ (mal) - 1€ y 20 céntimos (bien)
 * Crea una clase Main donde se soliciten las cantidades, crea el objeto y muestra 
 * el resultado con el método. 
 */

public class Monedero {

	private int cincoEuros;
	private int dosEuros;
	private int unEuro;
	private int cent50;
	private int cent20;
	
	public Monedero(int cincoEuros, int dosEuros, int unEuro, int cent50, int cent20) {
		this.cincoEuros = cincoEuros;	
		this.dosEuros = dosEuros;	
		this.unEuro = unEuro;	
		this.cent50 = cent50;	
		this.cent20 = cent20;		
	}
	
	public Monedero() {
		this.cincoEuros = 0;	
		this.dosEuros = 0;	
		this.unEuro = 0;	
		this.cent50 = 0;	
		this.cent20 = 0;		
	}
	
	public void getCincoEuros() {
		System.out.println(this.cincoEuros);
	}
	
	public void setCincoEuros(int cincoEuros) {
		this.cincoEuros = cincoEuros;
	}
	
	public void calcularTotalEuros() {
		int totalCentimos = this.cincoEuros * 500 + this.dosEuros * 200 + 
				this.unEuro * 100 + this.cent50 * 50 + this.cent20 *20;
		int euros = totalCentimos / 100;
		int centimos = totalCentimos % 100;
		System.out.println("Tengo " + euros + " € y " + centimos + " céntimos. ");
		System.out.printf("Tengo %d € y %d céntimos. \n", euros, centimos);
	}

}
