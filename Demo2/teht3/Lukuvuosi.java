package teht3;

public class Lukuvuosi {

	Periodi[] periodit;
	
	public Lukuvuosi() {
		periodit = new Periodi[5];
	}
	
	public void lisaaPeriodi(Periodi p) {
		boolean lisatty = false;
		for(int i = 0; i < 5; i++) {
			if(periodit[i] == null) {
				periodit[i] = p;
				lisatty = true;
				break;
			}
		}
		if(!lisatty) {
			System.out.println("Lukuvuosi on jo täynnä");
		}
	}
	
}
