package requerimiento2y3;

public class ProductorEmail extends Thread{

	public String nombre;
	public Email emails[];
	public Buffer buffer;
	
	public ProductorEmail(String nombre, Email emails[], Buffer buffer){
		super();
		this.nombre = nombre;
		this.emails = emails;
		this.buffer = buffer;
	}
	
	public void run(){
		for(int i = 0; i<emails.length; i++){
			System.out.println("El hilo: " + nombre + " --> ha añadido al buffer el email con ID " + emails[i].getId());
			buffer.addEmail(emails[i]);
					
				}
		}
}


