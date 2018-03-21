package teht2;

import java.util.ArrayList;
import java.util.Collections;

public class Jalkapallojoukkue extends Joukkue{
	
	private String kotistadion;
	private final int pelaajienMaksimimaara = 22;
	private ArrayList<Jalkapallopelaaja> pelaajat;
	private int budjetti;
	private int palkat;
	private final int PALKKAKATTO = 1000000;
	
	public String annaKotistadion() {
		return kotistadion;
	}
	
	public Jalkapallojoukkue(String nimi, String kotistadion, int budjetti) {
		super(nimi);
		if (budjetti > PALKKAKATTO) {
			throw new IllegalArgumentException("liian suuri budjetti");
		}else {
			this.budjetti = budjetti;
		}
		pelaajat = new ArrayList<Jalkapallopelaaja>();
		this.kotistadion = kotistadion;
	}
	
	public void lisaaPelaaja(Jalkapallopelaaja pelaaja) throws BudjettiYlitetty {
		if(palkat + pelaaja.annaPalkka() > budjetti) {
			throw new BudjettiYlitetty();
		}else {
			if(pelaajat.size() < pelaajienMaksimimaara) {
				pelaajat.add(pelaaja);
				palkat += pelaaja.annaPalkka();
			}
			else {
				System.out.println("Joukue on täynnä, pelaajaa ei lisätty");
			}
		}
	}
	
	public void tulostaPelaajat() {
		Collections.sort(pelaajat);
		for (Jalkapallopelaaja j : pelaajat) {
			System.out.println(j.toString());
		}
	}
	
	public ArrayList<Jalkapallopelaaja> annaKalleimmat(int maara) {
		Collections.sort(pelaajat);
		return (ArrayList<Jalkapallopelaaja>) pelaajat.subList(pelaajat.size()-maara-1, pelaajat.size()-1);
	}

}
