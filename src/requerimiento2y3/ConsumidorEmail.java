package requerimiento2y3;

public class ConsumidorEmail extends Thread{

	public String nombre;
	public Buffer buffer;
	
	public ConsumidorEmail (String nombre, Buffer buffer){
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	
	
	//Coge un email del buffer .
	
		for(int i = 1;i <= 10;i++){
			Email email = buffer.getEmail();
				System.out.println(nombre + " ha consumido el mensaje: " + email);		
		}
	}

}