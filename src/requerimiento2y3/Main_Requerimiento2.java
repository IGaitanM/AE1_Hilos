package requerimiento2y3;

public class Main_Requerimiento2 {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		Email emails1[] = new Email[10];
		emails1 [0] = new Email(1, "pikachu@gmail.com", "ash_ketchum@gmail.com", "pika-pika", "Pikachu te elijo a ti");
		emails1 [1] = new Email(2, "misty@gmail.com", "james@gmail.com", "jarl mamaar", "Lorem fistrum la caidita");
		emails1 [2] = new Email(3, "Brock@gmail.com", "iris@gmail.com", "Está la cosa muy malar", "torpedo me cago en tus muelas");
		emails1 [3] = new Email(4, "profesoroak@gmail.com", "deliaketchum@gmail.com", "te va a hasé pupitaa", "no te digo trigo por no llamarte Rodrigor");
		emails1 [4] = new Email(5, "dawn@gmail.com", "todd@gmail.com", "A wan qué dise usteer", "papaar papaar tiene musho peligro");
		emails1 [5] = new Email(6, "clemont@gmail.com", "pikachu@gmail.com", "hombree", "pupitaa diodeno a gramenawer");
		emails1 [6] = new Email(7, "cliam@gmail.com", "bulbasur@gmail.com", "No puedor", "te va a hasé pupitaa");
		emails1 [7] = new Email(8, "clem@gmail.com", "kiawe@gmail.com", "a peich diodeno", "Amatomaa ese pedazo");
		emails1 [8] = new Email(9, "garyoak@gmail.com", "cress@gmail.com", "caballo blanco", "condemor se calle ustée");
		emails1 [9] = new Email(10, "may@gmail.com", "solgaleo@gmail.com", "gramenawer", "Fistro torpedo está la cosa muy malar");
		
		Email emails2[] = new Email[10];
		emails2 [0] = new Email(11, "pika@gmaiom", "ash_chumail.com", "pika", "telijo a ti");
		emails2 [1] = new Email(12, "misty@gmai.com", "james@gmail.com", "jarl mamaar", "Lorem fistrum la caidita");
		emails2 [2] = new Email(13, "Brock@ail.com", "is@gmaicom", "Está cosa muyalar", "tordo me cago en t muelas");
		emails2 [3] = new Email(14, "profesak@gmail.com", "deliakeum@gmail.com", "tea a hasé pia", "no t dig por noamarte Rodrigor");
		emails2 [4] = new Email(15, "dawn@gil.com", "todd@gil.cm", "A wan qué diseteer", "papaar par tiene musho peligro");
		emails2 [5] = new Email(16, "clemont@gil.com", "glasion@gma.com", "homree", "pupitadiodeno a amenawer");
		emails2 [6] = new Email(17, "cliam@gmaicom", "bulbasur@gil.com", "No pdor", "t a hasé pupitaa");
		emails2 [7] = new Email(18, "pikachu@mail.com", "kia@gmai.com", "a peich ddeno", "Amataa ese pedazo");
		emails2 [8] = new Email(19, "gaoak@gmail.com", "crss@gail.com", "ablo blanco", "conmor se alle ustée");
		emails2 [9] = new Email(20, "may@gml.com", "soaleo@gmail.com", "ramenwer", "Fisto torpedo etá la cos muy malar");
		
		Email emails3[] = new Email[10];
		emails3 [0] = new Email(21, "pikamail.com", "ashkm@gmail.com", "ia-pa", "kachute elo a tí");
		emails3 [1] = new Email(22, "mity@gmail.com", "jaes@gmail.com", "jar mamaar", "Lorem fisum la caidita");
		emails3 [2] = new Email(23, "pikachu@gmail.com", "irs@gmail.com", "Estáa cosa muy malar", "toedo me cago en tus muelas");
		emails3 [3] = new Email(24, "proesoroak@gmail.com", "deliketchum@gmail.com", " va a hasé pitaa", "no te digo trigo por no llamarte Rodrigor");
		emails3 [4] = new Email(25, "daw@gmail.com", "tod@gmail.com", "A wan qué disesteer", "paar papaar tiene musho peligro");
		emails3 [5] = new Email(26, "cleont@gmail.com", "glaion@gmail.com", "hombee", "pupitaa ddeno a gramenawer");
		emails3 [6] = new Email(27, "clam@gmail.com", "bulasur@gmail.com", "No pueor", "te va a sé pupitaa");
		emails3 [7] = new Email(28, "clm@gmail.com", "kiae@gmail.com", "a peich ddeno", "Amatoa ese pedazo");
		emails3 [8] = new Email(29, "gayoak@gmail.com", "crss@gmail.com", "cabao blanco", "conmor se calle ustée");
		emails3 [9] = new Email(30, "ma@gmail.com", "solgaeo@gmail.com", "gramewer", "Fistroorpedo está la cosa muy malar");
		
		
		ProductorEmail p1 = new ProductorEmail("Productor-1", emails1, buffer);
		ProductorEmail p2 = new ProductorEmail("Productor-2", emails2, buffer);
		ProductorEmail p3 = new ProductorEmail("Productor-3", emails3, buffer);
		ConsumidorEmail c1 = new ConsumidorEmail("Consumidor-1", buffer);
		ConsumidorEmail c2 = new ConsumidorEmail("Consumidor-2", buffer);
		
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
		
		
	}

}
