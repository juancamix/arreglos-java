package arreglosEjemplo;

import java.util.Scanner;

public class sumArreglos {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el tamaño del arreglo: ");
			int tamaño = scanner.nextInt();
			
			int arreglo1[] = new int [tamaño];
			int arreglo2[] = new int [tamaño];
			int arregloSuma[] = new int[tamaño];
			int suma = 0;
			
			for (int i = 0; i < tamaño; i++) {
				do {
					System.out.println("Ingresa el valor del primer arreglo en la posicion "+(i+1));
					arreglo1[i] = scanner.nextInt();					
					if (arreglo1[i] < 0) {
						System.out.println("No puedes ingresar datos negativos");
					}					
				} while (arreglo1[i]<0);
			}
			for (int i = 0; i < tamaño; i++) {
				do {
					System.out.println("Ingresa el valor del segundo arreglo en la posicion "+(i+1));
					arreglo2[i] = scanner.nextInt();
					if (arreglo2[i] < 0) {
						System.out.println("No puedes ingresar datos negativos");
					}					
				} while (arreglo2[i]<0);
			}
			
			for (int i = 0; i < arregloSuma.length; i++) {
				suma = arreglo1[i] + arreglo2[i];
				arregloSuma[i] = suma;	
			}
			
			System.out.println();
			for (int primero : arreglo1) {
				System.out.print(primero + " ");
			}
			System.out.println();
			for (int segundo : arreglo2) {
				System.out.print(segundo + " ");
			}
			System.out.println();
			for (int total : arregloSuma) {
				System.out.print(total + " ");
			}
		}
	}

}
