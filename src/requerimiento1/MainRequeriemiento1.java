package requerimiento1;

import java.util.Scanner;

public class MainRequeriemiento1 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
		long numeros[] = new long[4];
		
		for (int i=0; i<4; i++) {
			System.out.println("Introduce un número en el hilo " + (i+1));
			numeros[i]= lector.nextLong();
		}
		
		lector.close();
		
		EsPrimo num1= new EsPrimo("hilo1",numeros[0]);
		EsPrimo num2= new EsPrimo("hilo2",numeros[1]);
		EsPrimo num3= new EsPrimo("hilo3",numeros[2]);
		EsPrimo num4= new EsPrimo("hilo4",numeros[3]);
				
		num1.start();
		num2.start();
		num3.start();
		num4.start();
		
		lector.close();
	}
	
	
	
	
			
	

}