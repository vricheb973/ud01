package ejercicios.prueba;

// Este es un ejemplo que le he puesto a los que vinieron el día de la huelga, lo explico el próximo día
public class Pedido {
	
	// con private limito los permisos de lectura y escritura desde fuera
	private int codigo;
	private String estado; //PENDIENTE, ENVIADO, RECIBIDO
	
	public Pedido(int codigo) {
		this.codigo = codigo;
		this.estado = "PENDIENTE";
	}
	
	// permiso de lectura (get)	
	public void getEstado() {
		System.out.println(this.estado);
	}

	// permiso de escritura (set)
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void enviar() {
		if(this.estado != "PENDIENTE") {
			throw new IllegalStateException("El pedido ya estaba enviado!!!!");
		}
		this.estado = "ENVIADO";
	}

	public void recibir() {
		if(this.estado != "ENVIADO") {
			throw new IllegalStateException("El pedido ya estaba recibido o no se ha enviado, melon!!!!");
		}
		this.estado = "RECIBIDO";
	}

}
