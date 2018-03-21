package teht3;

import java.util.ArrayList;

public class Kurssi {

	private String nimi;
	private String aihe;
	private ArrayList<Opiskelija> osallistujat;
	private Opettaja opettaja;
	
	public Kurssi(String nimi, String aihe, Opettaja opettaja) {
		this.nimi = nimi;
		this.aihe = aihe;
		this.opettaja = opettaja;
	}
	
	public String annaNimi() {
		return nimi;
	}
	
	public String annaAihe() {
		return aihe;
	}
	
	public Opettaja annaOpettaja() {
		return opettaja;
	}
	
	public void lisaaOsallistujia(Opiskelija[] opiskelijat) {
		for(Opiskelija o : opiskelijat) {
			osallistujat.add(o);
		}
	}
	
	public void poistaOsallistujia(String[] opiskelijaTunnukset) {
		for(String t : opiskelijaTunnukset) {
			for(int i = 0; i < osallistujat.size(); i++) {
				if(osallistujat.get(i).annaTunnus().equals(t)) {
					osallistujat.remove(i);
					break;
				}
			}
		}
	}
}
