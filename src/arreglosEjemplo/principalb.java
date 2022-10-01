package arreglosEjemplo;

import java.util.Scanner;

public class principalb {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese la cantidad de personas: ");
			int cantidadPersonas = scanner.nextInt();
			String nombre[] = new String[cantidadPersonas];
			int nota1[]= new int[nombre.length];
			int nota2[]= new int[nombre.length];
			int nota3[]= new int[nombre.length];
			
			for (int i = 0; i < nombre.length; i++) {
				System.out.println("Ingrese el nombre: ");
				nombre[i] = scanner.next();
				System.out.println("Ingrese la primera nota de "+ nombre[i]);
				nota1[i] = scanner.nextInt();
				System.out.println("Ingrese la segunda nota de "+ nombre[i]);
				nota2[i] = scanner.nextInt();
				System.out.println("Ingrese la tercera nota de "+ nombre[i]);
				nota3[i] = scanner.nextInt();
				
				System.out.println("La primera nota de "+nombre[i]+ " es "+nota1[i]);
				System.out.println("La segunda nota de "+nombre[i]+ " es "+nota2[i]);
				System.out.println("La tercera nota de "+nombre[i]+ " es "+nota3[i]);
				System.out.println("--------------------------");
			}
			
			for (int i = 0; i < nombre.length; i++) {
				int promedio = (nota1[i] + nota2[i] + nota3[i])/3;
				
				System.out.println("El promedio del estudiante "+nombre[i]+" es "+promedio);
				
			}
			for (String i : nombre) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i : nota1) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i : nota2) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i : nota3) {
				System.out.print(i + " ");
			}
		}
	}

}
