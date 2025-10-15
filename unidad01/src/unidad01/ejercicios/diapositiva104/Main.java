package unidad01.ejercicios.diapositiva104;

public class Main {

	public static void main(String[] args) {
		
		CuentaCorriente cc1 = new CuentaCorriente("11111111A", "Vladi");
		cc1.mostrarInformación();
		cc1.ingresar(500000000);
		cc1.mostrarInformación();
		
		CuentaCorriente cc2 = new CuentaCorriente("22122222B", "Octavio");
		cc2.mostrarInformación();
		cc2.retirar(50);
		cc2.mostrarInformación();
		
		
		
		

	}

}
