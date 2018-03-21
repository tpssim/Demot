package teht1;

public class laivaaja {
	public static void main(String[] args) {
		
		Rahtilaiva laiva = new Rahtilaiva("Laiva", 14.6, 0.9, 14.5, 500.0);
		
		laiva.matkanKesto(70);
		
		laiva.lisaaRahtia(60.0);
		
		laiva.matkanKesto(70);
		
		laiva.poistaRahtia(60.0);
		
		laiva.matkanKesto(70);
	}
}
