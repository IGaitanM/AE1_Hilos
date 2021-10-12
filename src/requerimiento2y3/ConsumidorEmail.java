package requerimiento2y3;

public class ConsumidorEmail extends Thread{

	public String nombre;
	public Buffer buffer;
	
	public ConsumidorEmail (String nombre, Buffer buffer){
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}
	
	//Coge un email del buffer siempre que no se encuentre vacío.
	public void run(){
		do {
			Email email = buffer.getEmail();
			System.out.println(nombre + " ha enviado el email: " + email.toString());
		}while (buffer.isEmpty() == false) ;
	
					
		
	}

}