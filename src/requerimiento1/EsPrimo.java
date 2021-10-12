package requerimiento1;

public class EsPrimo extends Thread {
	
	private String nombre;
	private long numero;
	
	public EsPrimo (String nombre, long numero) {
		 this.nombre= nombre;
		 this.numero= numero;
	}
	
	public void run() {
		
		long inicio = System.currentTimeMillis();  //variable que almacena el tiempo cuando se inicia el m�todo
		long fin ; 								   //variable que almacena el tiempo cuando se termina el  m�todo
		long tiempo ;							   //variable que almacena la diferencia de tiempo entre el inicio y el final del m�todo
		int contador=0;
		
		//Este bucle calcula si el n�mero es primo o no y lo muestra por pantalla
	        for (int i = 1; i < (numero + 1); i++) 
	            if (numero % i == 0) 
	                contador++;
	        if (contador != 2) 
	        	System.out.println("El n�mero " + numero + " no es primo");
	        else 
	        	 System.out.println("El n�mero " + numero + " �� ES PRIMO !!");
	        
	       
	       fin = System.currentTimeMillis();
	       tiempo = fin - inicio;
	       
	       System.out.println("Procesado por el hilo " + nombre + ", ha tardado " + tiempo +" milisegundos ");
	         
	    }
		

}
