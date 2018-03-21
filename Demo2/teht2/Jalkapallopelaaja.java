package teht2;

public class Jalkapallopelaaja extends Pelaaja implements Comparable<Jalkapallopelaaja>{

	private String jalkaisuus;
	private int viikkopalkka;
	
	public Jalkapallopelaaja(String nimi, int numero, String pelipaikka, String jalkaisuus, int viikkopalkka) {
		super(nimi, numero, pelipaikka);
		this.jalkaisuus = jalkaisuus;
		this.viikkopalkka = viikkopalkka;
	}
	
	public void asetaPalkka(int viikkopalkka) {
		this.viikkopalkka = viikkopalkka;
	}
	
	public int annaPalkka() {
		return viikkopalkka;
	}
	
	public int compareTo(Jalkapallopelaaja j) {
		if(this.annaPalkka() > j.annaPalkka()) {
			return 1;
		}
		if(this.annaPalkka() < j.annaPalkka()) {
			return -1;
		}
		return 0;
	}
	
	public void tulostaTiedot() {
		System.out.println("Pelaajan nimi: " + nimi + ", #" + numero + ", " + pelipaikka + ", " + jalkaisuus + ", vikkopalkka: " + viikkopalkka);
	}
	
	public String toString() {
		return "Pelaajan nimi: " + nimi + ", #" + numero + ", " + pelipaikka + ", " + jalkaisuus + ", vikkopalkka: " + viikkopalkka;
	}
}
