package teht2;
import java.util.ArrayList;

public class Joukkue {
	
	String nimi;
	ArrayList<Pelaaja> pelaajat;

	public Joukkue(String nimi) {
		this.nimi = nimi;
		pelaajat = new ArrayList<Pelaaja>();
	}
	
	public void lisaaPelaaja(Pelaaja pelaaja) {
		pelaajat.add(pelaaja);
	}
	
	public void poistaPelaaja(String nimi) {
		if(etsiPelaaja(nimi) != -1) {
			pelaajat.remove(etsiPelaaja(nimi));
		}
		else {
			System.out.println("Pelaajaa ei löydy. Joukkuetta ei muokattu.");
		}
	}
	
	public void poistaPelaaja(int numero) {
		if(etsiPelaaja(numero) != -1) {
			pelaajat.remove(etsiPelaaja(numero));
		}
		else {
			System.out.println("Pelaajaa ei löydy. Joukkuetta ei muokattu.");
		}
	}
	
	public void tulostaPelaajienTiedot() {
		System.out.println("Joukkue:" + nimi);
		for(int i = 0; i < pelaajat.size(); i++) {
			pelaajat.get(i).tulostaTiedot();
		}
	}
	
	private int etsiPelaaja(String nimi) {
		for(int i = 0; i < pelaajat.size(); i++) {
			if(pelaajat.get(i).annaNimi().equals(nimi)) {
				return i;
			}
		}
		return -1;
	}
	
	private int etsiPelaaja(int numero) {
		for(int i = 0; i < pelaajat.size(); i++) {
			if(pelaajat.get(i).annaNumero() == numero) {
				return i;
			}
		}
		return -1;
	}

}
