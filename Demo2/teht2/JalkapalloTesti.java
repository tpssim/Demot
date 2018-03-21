package teht2;

public class JalkapalloTesti {

	public static void main(String[] args) {
		
		Jalkapallojoukkue joukkue = new Jalkapallojoukkue("Joukue", "Stadion", 50000);
		
		try {
			for(int i = 0; i < 6; i++) {
				joukkue.lisaaPelaaja(new Jalkapallopelaaja("", i, "", "", 10000));
			}
		}catch(BudjettiYlitetty e) {
			System.out.println("Budjetti ylitettiin");
		}
		
		joukkue.tulostaPelaajat();
		
	}
}
