package teht1;

public class Rahtilaiva extends Laiva {
	
	final double kapasiteetti;
	private double rahti;
	private double nopeusKerroin = 1.0;
	
	public Rahtilaiva(String nimi, double pituus, double syvays, double nopeus, double kapasiteetti) {
		super(nimi, pituus, syvays, nopeus);
		this.kapasiteetti = kapasiteetti;
	}
	
	public void lisaaRahtia(double rahti) {
		if(this.rahti + rahti < kapasiteetti) {
			if((int)((this.rahti + rahti) / (kapasiteetti/10)) > (int)((this.rahti) / (kapasiteetti/10)) ) {
				nopeusKerroin -= 0.1*((int)((this.rahti + rahti) / (kapasiteetti/10)) - (int)((this.rahti) / (kapasiteetti/10)));
			}
			this.rahti += rahti;
		}
		else {
			System.out.println("Rahti ei mahtunut laivaan");
		}
	}
	
	public void poistaRahtia(double rahti) {
		if(this.rahti >= rahti) {
			if((int)((this.rahti - rahti) / (kapasiteetti/10)) < (int)((this.rahti) / (kapasiteetti/10)) ) {
				nopeusKerroin += 0.1*((int)((this.rahti) / (kapasiteetti/10)) - (int)((this.rahti - rahti) / (kapasiteetti/10)));
			}
			this.rahti -= rahti;
		}
		else {
			System.out.println("Ei voida poistaa enempää kuin nykyisen rahdin maara");
		}
		
	}
	
	public void matkanKesto (double matka) {
		double kesto = matka / (nopeus * nopeusKerroin * 1.852);
		int minuutit = (int) ((kesto % 1) * 60.0);
		int tunnit = (int) kesto;
		System.out.println("Matka kestää:" + tunnit + "h " + minuutit + "min");
	}
	
}
