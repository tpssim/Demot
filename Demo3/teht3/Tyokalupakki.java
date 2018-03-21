package teht3;

 import java.util.ArrayList;

public class Tyokalupakki {

	private ArrayList<Tyokalu> tyokalut;
	
	public Tyokalupakki() {
		tyokalut = new ArrayList<Tyokalu>();
	}
	
	//Lis�� ty�kalun pakkiin
	//@param t: lis�tt�v� ty�kalu
	public void lisaaPakkiin(Tyokalu t) {
		tyokalut.add(t);
	}
	
	//Lataa pakin ladattavat ty�kalut
	public void lataaLadattavat() {
		for(Tyokalu t : tyokalut) {
			if(t instanceof Ladattava) {
				((Ladattava) t).lataa();
			}
		}
	}
	
	//Teroittaa pakin teroitettavat ty�kalut
	public void teroitaTeroitettavat() {
		for(Tyokalu t : tyokalut) {
			if(t instanceof Teroitettava) {
				((Teroitettava) t).teroita();
			}
		}
	}
	
	//K�ytt�� annetun tyyppist� tykalua
	//@param tyyppi: ty�kalun tyyppi jota halutaan k�ytt��
	//Kutsutaan esim kayta(Puukko.class);
	public <T extends Tyokalu> void kayta(Class<T> tyyppi) {
		for(Tyokalu t : tyokalut) {
			if(tyyppi.isInstance(t)) {
				t.kayta();
			}
		}
	}
}
