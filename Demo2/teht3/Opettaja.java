package teht3;

public class Opettaja extends Yliopistolainen {

	private int palkka;
	
	public Opettaja(String nimi, int palkka){
		super(nimi);
		this.palkka = palkka;
	}
	
	public int annaPalkka() {
		return palkka;
	}
	
}
