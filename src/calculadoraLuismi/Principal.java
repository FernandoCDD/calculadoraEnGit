package calculadoraLuismi;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0, cero = 0;
		double resultado = 0.0, numerador = 0.0, denominador = 0.0;

		Scanner sc = new Scanner (System.in);
		Operaciones op = new Operaciones ();
		
		do {
			try {
				System.out.println("¿Qué quieres hacer?");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir.");
				System.out.println("0. Salir");
				opcion = Integer.parseInt(sc.nextLine());
				
				switch (opcion) {
			
				case 0:
					
					System.out.println("Saliendo...");
					break;
					
				case 1:
					
					try {
						System.out.println("¿Numerador?");
						numerador = Double.parseDouble(sc.nextLine());
						System.out.println("¿Denominador?");
						denominador= Double.parseDouble(sc.nextLine());
						
						resultado = op.sumar(numerador, denominador);
						
						System.out.printf("El resultado es: %.2f\n",resultado);
						
						}catch(NumberFormatException n) {
							System.out.println("Error, mete un número.");
						}
						break;
				}
					
			}catch (NumberFormatException n) {
					System.out.println("Error, mete un número.");
			}
				
		}while (opcion != cero);
	}

}
