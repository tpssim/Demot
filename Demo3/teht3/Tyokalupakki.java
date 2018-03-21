package teht3;

 import java.util.ArrayList;

public class Tyokalupakki {

	private ArrayList<Tyokalu> tyokalut;
	
	public Tyokalupakki() {
		tyokalut = new ArrayList<Tyokalu>();
	}
	
	//Lisää työkalun pakkiin
	//@param t: lisättävä työkalu
	public void lisaaPakkiin(Tyokalu t) {
		tyokalut.add(t);
	}
	
	//Lataa pakin ladattavat työkalut
	public void lataaLadattavat() {
		for(Tyokalu t : tyokalut) {
			if(t instanceof Ladattava) {
				((Ladattava) t).lataa();
			}
		}
	}
	
	//Teroittaa pakin teroitettavat työkalut
	public void teroitaTeroitettavat() {
		for(Tyokalu t : tyokalut) {
			if(t instanceof Teroitettava) {
				((Teroitettava) t).teroita();
			}
		}
	}
	
	//Käyttää annetun tyyppistä tykalua
	//@param tyyppi: työkalun tyyppi jota halutaan käyttää
	//Kutsutaan esim kayta(Puukko.class);
	public <T extends Tyokalu> void kayta(Class<T> tyyppi) {
		for(Tyokalu t : tyokalut) {
			if(tyyppi.isInstance(t)) {
				t.kayta();
			}
		}
	}
}
