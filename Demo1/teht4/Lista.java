package teht4;

//Yksisuuntainen linkitetty lista
public class Lista {

	//Listan ensimm‰inen alkio luodaan konstruktorilla
	private Alkio alku;
	
	//Konstruktorit
	//@param arvo = listan ensimm‰isen alkion arvo
	public Lista(int arvo) {
		alku = new Alkio(arvo);
	}
	
	//@param arvot = listaan alustettavat arvot
	public Lista(int[] arvot) {
		alku = new Alkio(arvot, 0);
	}
	
	//Palauttaa arvon listan indeksist‰
	//@param index = halutun arvon indeksi
	public int haeArvo(int index) {
		return alku.haeArvo(index);
	}
	
	//lis‰‰ arvon listan loppuun
	//@param arvo = listaan lis‰tt‰v‰ arvo
	public void lisaaArvo(int arvo) {
		alku.lisaaArvo(arvo);
	}
	
	//Lis‰‰ arvon annettuun indeksiin
	//@param arvo = listaan lis‰tt‰v‰ arvo
	//@param index < listan pituus
	public void lisaaArvo(int arvo, int index) {
		if(index == 0) { //Jos index == 0 lis‰t‰‰n uusi Alkio listan alkuun
			Alkio uusi = new Alkio(arvo); //Luodaan uusi alkio oikealla arvolla
			uusi.asetaSeuraava(alku); //Asetetaan udelle alkiolle seuraava alkio
			alku = uusi; //Asetetaan uusi alkio listan alkuun
		}
		else { //Muuten siirryt‰‰n seuraavan alkioon
			alku.lisaaArvo(arvo, index - 1);
		}
	}
	
	//Lis‰‰ arvot listan loppuun j‰rjestyksess‰
	//@param arvot = listaan lis‰tt‰v‰t arvot
	public void lisaaArvo(int[] arvot) {
		alku.lisaaArvo(arvot);
	}
	
	//Poistaan arvon halutusta indeksist‰
	//@param index = poistettavan arvon indeksi
	public void poistaArvo(int index) {
		if(index == 0) {
			alku = alku.annaSeuraava();
		}
		else {
			alku.poistaArvo(index);
		}
	}
	
	
	//Alkio luokan metodeja voidaan k‰ytt‰‰ vain Lista luokan sis‰ll‰
	private class Alkio {
		
		//Arvo asetetaan kostruktorilla
		private int arvo;
		//Seuraava Alkio voidaan asettaa tai luoda metodeilla
		private Alkio seuraava;
		
		public Alkio(int arvo) {
			this.arvo = arvo;
		}
		
		public Alkio(int[] arvot, int index) {
			if(index < arvot.length) { //Jos lis‰tt‰vi‰ arvoja on j‰ljell‰ jatketaan lis‰‰mist‰
				arvo = arvot[index];	
				seuraava = new Alkio(arvot, index + 1);
			}
		}
		
		//Palauttaa alkion arvon
		private int annaArvo() {
			return arvo;
		}
		
		public void asetaSeuraava(Alkio seuraava) {
			this.seuraava = seuraava;
		}
		
		//Palauttaa alkiosta seuraavan alkion
		//Palauttaa null jos seuraavaa alkiota ei ole
		public Alkio annaSeuraava() {
			return seuraava;
		}
		
		public void lisaaArvo(int arvo) {
			if(seuraava == null) { //jos seuraavaa alkiota ei ole luodaan sellainen
				seuraava = new Alkio(arvo);
			}
			else { //Muuten siirryt‰‰n seuraavaan alkioon
				seuraava.lisaaArvo(arvo);
			}
		}
		
		public void lisaaArvo(int arvo, int index) {
			if(index == 0) { //Jos index == 0 t‰m‰n ja seuraavan alkion v‰liin lis‰t‰‰n uusi alkio
				Alkio uusi = new Alkio(arvo);
				uusi.asetaSeuraava(seuraava);
				seuraava = uusi;
			}
			else { //Muuten siirryt‰‰n seuraavaan alkioon
				seuraava.lisaaArvo(arvo, index - 1);
			}
		}
		
		public void lisaaArvo(int[] arvot) {
			if(seuraava == null) { //Jos seuraavaa arvoa ei ole luodaan sellainen
				seuraava = new Alkio(arvot, 0); 
			}
			else { //Muuten siirryt‰‰n seuraavaan alkioon
				seuraava.lisaaArvo(arvot);
			}
		}
		
		public int haeArvo(int index) {
			if(index == 0) { //Kun index == 0 ollaan halutussa alkiossa
				return annaArvo();
			}
			else { //Siirryt‰‰n seuraavaan alkioon jos ei olla halutussa alkiossa
				return seuraava.haeArvo(index - 1);
			}
		}
		
		//Jos annettua indeksi‰ ei ole olemassa t‰m‰ metodi ei tee mit‰‰n
		public void poistaArvo(int index) {
			if(index == 1 && seuraava != null) { //jos index == 1 seuraava alkio halutaan poistaa 
				seuraava = seuraava.annaSeuraava();
			}
			else if(seuraava != null) { //Siirryt‰‰n eteenp‰in jos seuraava alkio on olemassa
				seuraava.poistaArvo(index - 1);
			}
		}
	}
}