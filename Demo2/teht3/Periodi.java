package teht3;

import java.util.ArrayList;

public class Periodi {

	private ArrayList<Kurssi> kurssit;
	
	public Periodi() {
		kurssit = new ArrayList<Kurssi>();
	}
	
	public void lisaaKursseja(Kurssi[] kurssit) {
		for(Kurssi k : kurssit) {
			this.kurssit.add(k);
		}
	}
}
