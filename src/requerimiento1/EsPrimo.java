package requerimiento1;

public class EsPrimo extends Thread {
	
	private String nombre;
	private long numero;
	
	public EsPrimo (String nombre, long numero) {
		 this.nombre= nombre;
		 this.numero= numero;
	}
	
	public void run() {
		
		long inicio = System.currentTimeMillis();  //variable que almacena el tiempo cuando se inicia el método
		long fin ; 								   //variable que almacena el tiempo cuando se termina el  método
		long tiempo ;							   //variable que almacena la diferencia de tiempo entre el inicio y el final del método
		int contador=0;
		
		//Este bucle calcula si el número es primo o no y lo muestra por pantalla
	        for (int i = 1; i < (numero + 1); i++) 
	            if (numero % i == 0) 
	                contador++;
	        if (contador != 2) 
	        	System.out.println("El número " + numero + " no es primo");
	        else 
	        	 System.out.println("El número " + numero + " ¡¡ ES PRIMO !!");
	        
	       
	       fin = System.currentTimeMillis();
	       tiempo = fin - inicio;
	       
	       System.out.println("Procesado por el hilo " + nombre + ", ha tardado " + tiempo +" milisegundos ");
	         
	    }
		

}
