package teht1;

public class Autolautta extends Laiva {

	final int kapasiteetti;
	private int matkustajienMaara;
	private int ajoneuvojenMaara;
	
	public Autolautta(String nimi, double pituus, double syvays, double nopeus, int kapasiteetti) {
		super(nimi, pituus, syvays, nopeus);
		this.kapasiteetti = kapasiteetti;
	}
	
	public void lisaaLastia(int matkustajia, int ajoneuvoja){
		if(kapasiteetti <= (matkustajia + (ajoneuvoja*10))+(matkustajienMaara + (ajoneuvojenMaara*10))) {
			matkustajienMaara += matkustajia;
			ajoneuvojenMaara += ajoneuvoja;
		}
		else {
			System.out.println("Kapasiteetti ei riitä");
		}
	}

	public void poistaLastia(int matkustajia, int ajoneuvoja) {
		if(matkustajienMaara >= matkustajia && ajoneuvojenMaara >= ajoneuvoja) {
			matkustajienMaara -= matkustajia;
			ajoneuvojenMaara -= ajoneuvoja;
		}
		else {
			System.out.println("Ei voida poistaa enempää kuin nykyiset matkustajat/aujoneuvot");
		}
	}
	
}
