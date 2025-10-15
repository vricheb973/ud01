package unidad01.operadores;

public class Logicos {

	public static void main(String[] args) {
		int edad2 = 19;
		String provincia = "Sevilla";
		
		
		boolean beca = (edad2 >= 18) && (provincia == "Sevilla"); 
		
		boolean llueve = true;
		boolean tareas = true;
		boolean biblio = true;
		
		boolean salirALaCalle = (llueve==false && tareas == true) || biblio == true;
		
		boolean salirALaCalle2 = (!llueve && tareas) || biblio;

	}

}
