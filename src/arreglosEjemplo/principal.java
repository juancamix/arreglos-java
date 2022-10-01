package arreglosEjemplo;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese la cantidad de personas: ");
			int cantidadPersonas = scanner.nextInt();
			String nombre[] = new String[cantidadPersonas];
			int edad[] = new int[nombre.length];
			
			for (int i = 0; i < nombre.length; i++) {
				System.out.println("Ingrese el nombre de la persona "+(i+1));
				nombre[i] = scanner.next();
				System.out.println("Ingrese la edad de "+ nombre[i]);
				edad[i] = scanner.nextInt();
				
				System.out.println("La edad de "+nombre[i]+ " es "+edad[i]);
				System.out.println("--------------------------");
			}
			
			for (int i = 0; i < nombre.length; i++) {
				System.out.println(nombre[i]+ " - " + edad[i]);
			}
		}
	}

}
