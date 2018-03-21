package teht2;

public class Pelaaja {
	
	protected String nimi;
	protected int numero;
	protected String pelipaikka;
	
	public Pelaaja(String nimi, int numero, String pelipaikka) {
			this.nimi = nimi;
			this.numero = numero;
			this.pelipaikka = pelipaikka;
	}
	
	public String annaNimi() {
		return nimi;
	}
	
	public int annaNumero() {
		return numero;
	}
	
	public void tulostaTiedot() {
		System.out.println("Pelaajan nimi: " + nimi + ", #" + numero + ", " + pelipaikka);
	}
	
}
	
	

