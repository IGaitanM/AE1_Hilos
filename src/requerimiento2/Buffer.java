package requerimiento2;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	//Numero maximo de emails que acepto en el buffer
	public final static int MAX_ELEMENTOS = 5;
	
	// La varible buffer almacenar� un array con los datos de los emails.
	private Queue<Email> buffer = new LinkedList<>();
	
	public synchronized void addEmail(Email email){
		//Si la capacidad del buffer esta llena...
		while(buffer.size() == MAX_ELEMENTOS){
			try {
				// No entra ning�n email al buffer y manda esperar con wait() al productor de emails
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Si el buffer no esta lleno entonces se a�aden m�s emails.
		try {
			//Pero para 500 milisegundos antes de a�adir otro email.
			Thread.sleep(500);//
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		buffer.offer(email);;
		//Se notifica a los consumidores de emails que ya pueden coger emais del buffer
		notify();
	}
	
	public synchronized Email getEmail(){
		Email email = null;
		//Si la capacidad del buffer esta vac�a no se pueden coger emails del buffer
		while(buffer.size() == 0){
			try {
				//Por lo tanto mandamos esperar al consumidor de emails
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//Si no est� vac�o el buffer, mandamos coger un email.
		email = buffer.poll();
		
		//Notificamos a los consumidores de emails que ya pueden coger emails del buffer.
		notify();
		return email;
	}
}
	
