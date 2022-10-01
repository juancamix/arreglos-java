package arreglosEjemplo;

import javax.swing.JOptionPane;

public class arreglo1 {

	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog
				("Ingrese la cantidad de estudiantes a procesar"));
		double n1=0,n2=0,n3=0;
		String nombre="";
		String nombres[]=new String[n];
		double notas[]=new double[nombres.length];
		int valida=0,registro=0;
		
		String menu="MENU ESTUDIANTES\n\n";
		menu+="1. Registrar información\n";
		menu+="2. Imprimir lista estudiantes\n";
		menu+="3. Imprimir lista de notas\n";
		menu+="4. Salir\n";
		menu+="Seleccione una opcion\n";
		
		int opc=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog
					(menu));
			
			switch (opc) {
			case 1://Registrar información
				
				String resp="";
				do {
					if (valida==0) {
						valida=1;
						
						for (int i = 0; i < nombres.length; i++) {
							nombre=JOptionPane.showInputDialog
									("Ingrese el nombre del estudiante "+(i+1));
							
							//almacena el nombre del estudiante en cada pos del arreglo
							nombres[i]=nombre;
							
							n1=Double.parseDouble(JOptionPane.showInputDialog
									("Ingrese la nota 1 para el estudiante "+nombres[i]));
							n2=Double.parseDouble(JOptionPane.showInputDialog
									("Ingrese la nota 2 para el estudiante "+nombres[i]));
							n3=Double.parseDouble(JOptionPane.showInputDialog
									("Ingrese la nota 3 para el estudiante "+nombres[i]));
							
							double promedio=(n1+n2+n3)/3;
							notas[i]=promedio;
							
							System.out.println("n1="+n1+", n2="+n2+", n3="+n3);
							System.out.println("("+n1+"+"+n2+"+"+n3+")/3="+promedio);
							
							if (promedio>=3.5) {
								System.out.println(nombres[i]+" GANA la materia");
							}else {
								System.out.println(nombres[i]+" PIERDE la materia");
								
							}
							registro=1;
						}
					}else {
						JOptionPane.showMessageDialog(null,"Tenga en cuenta que si registra nuevamente, se perderan los datos anteriores");
						registro=0;
					}
					
					if (registro==0) {
						resp=JOptionPane.showInputDialog("Ingrese si para continuar");
						if (resp.equalsIgnoreCase("si")) {
							valida=0;
						}	
					}else {
						resp="no";
					}
					
					
					
				}while(resp.equalsIgnoreCase("si"));
					

				break;
			case 2://Lista estudiantes
				if (valida!=0) {
					System.out.println();
					System.out.print("|");
					for (int i = 0; i < nombres.length; i++) {
						System.out.print(nombres[i]+" | ");
					}
				}else {
					System.out.println("Debe registrar datos primero");
				}
			
				break;
			case 3://Lista notas
				if (valida!=0) {
					System.out.println();
					System.out.print("|");
					for (int i = 0; i < notas.length; i++) {
						System.out.print(notas[i]+" | ");
					}
				}else {
					System.out.println("Debe registrar datos primero");
				}
				
				
				break;
			case 4:System.out.println("CHAO!");
				
				break;

			default:System.out.println("La opción no existe");
				break;
			}
			
		} while (opc!=4);
	}

}
