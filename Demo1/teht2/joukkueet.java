package teht2;

public class joukkueet {

	public static void main(String[] args) {
		
		Joukkue j1 = new Joukkue("vihreat");
		Joukkue j2 = new Joukkue("punaiset");
		
		j1.lisaaPelaaja(new Pelaaja("Ville", 1, "hyokkaaja"));
		j1.lisaaPelaaja(new Pelaaja("Kalle", 15, "maalivahti"));
		j1.lisaaPelaaja(new Pelaaja("Jukka", 6, "puolustaja"));
		
		j2.lisaaPelaaja(new Pelaaja("Pekka", 42, "puoustaja"));
		
		j1.tulostaPelaajienTiedot();
		j2.tulostaPelaajienTiedot();
		
		j1.poistaPelaaja(15);
		j1.poistaPelaaja("Ville");
		j2.poistaPelaaja(30);
		
		j2.lisaaPelaaja(new Pelaaja("Ville", 1, "hyokkaaja"));
		j2.lisaaPelaaja(new Pelaaja("Kalle", 15, "maalivahti"));
		
		j1.tulostaPelaajienTiedot();
		j2.tulostaPelaajienTiedot();
	}
	
}
