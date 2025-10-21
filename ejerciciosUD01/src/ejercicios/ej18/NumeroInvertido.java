package ejercicios.ej18;

public class NumeroInvertido {

	private int numero;

	public NumeroInvertido(int numero) {
		this.numero = numero;
	}

	public void getNumero() {
		System.out.println(this.numero);
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void invertirNumero() {
		int unidades = this.numero % 10;
		int decenas = this.numero / 10;
		System.out.println(unidades * 10 + decenas);
	}

}
