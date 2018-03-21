package teht1;

public class Laiva {
	
	private String nimi;
	private double pituus;
	private double syvays;
	protected double nopeus;

	public Laiva (String nimi, double pituus, double syvays, double nopeus) {
		this.nimi = nimi;
		this.pituus = pituus;
		this.syvays = syvays;
		this.nopeus = nopeus;
	}
	
	//@args matka = matka kilometrein‰
	//@return = matkan kesto
	public void matkanKesto (double matka) {
		double kesto = matka / (nopeus * 1.852);
		int minuutit = (int) ((kesto % 1) * 60.0);
		int tunnit = (int) kesto;
		System.out.println("Matka kest‰‰:" + tunnit + "h " + minuutit + "min");
	}
}
