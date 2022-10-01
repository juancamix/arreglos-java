package arreglosEjemplo;

import java.util.Scanner;

public class paresImpares {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese la cantidad de numeros: ");
	        int numeros = scanner.nextInt();
	        int arreglo[] = new int [numeros];
	        int arregloFinal[] = new int [numeros];
	        int resultado = 0;
	        
	        for (int i = 0; i < arreglo.length; i++) {
	        	System.out.println("Ingrese el "+ (i+1)+ " numero: ");
	        	arreglo[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < arregloFinal.length; i++) {
	        	resultado = arreglo[i] % 2;
	        	arregloFinal[i] = resultado;
	        	if (arregloFinal[i] == 0) {
	        		System.out.print(arreglo[i] + "|");	        		
	        	}
	        }
	        System.out.println();
	        for (int i = 0; i < arregloFinal.length; i++) {
	        	resultado = arreglo[i] % 2;
	        	arregloFinal[i] = resultado;
	        	if (arregloFinal[i] != 0) {
	        			System.out.print(arreglo[i] + "|");
	        	}
	        }
	        
	   }
	}
}


