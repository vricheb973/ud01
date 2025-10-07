package random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Calificaciones {

	public static void main(String[] args) {

		List<String> clase = Arrays.asList("Cardona Carrión, Francisco Javier",
				"Carrión Borreguero, José Agustín",
				"De la Fuente Carbajo, Alberto",
				"Díaz Jiménez, Diego",
				"Díaz Romero, Miguel",
				"Galipienso Gómez, Alejandro",
				"Galocha Isorna, Juan",
				"García Santos, Mario",
				"González Crespo, José",
				"González Muñoz, Nicolás",
				"Guerrero Vargas, Jesús",
				"Moreno Roldán, José",
				"Muñoz López, Manuel",
				"Muñoz Muñoz, Álvaro",
				"Puelles Ramas, Sergio",
				"Rodrigo Cortes, Ignacio",
				"Roldán Jiménez, Rubén",
				"Salguero Carrión, Rubén",
				"Salvat Guillén, Daniel",
				"Teba Ojeda, Abraham"
		);
		
		for(String alumno : clase) {
			Random random = new Random();
			
			System.out.println(alumno + " -> Nota: " + random.nextInt(2, 10));
		
		}

	}

}
