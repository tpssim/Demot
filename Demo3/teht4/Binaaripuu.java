package teht4;

public class Binaaripuu <t> {
	
	private Alkio<t> juuri;
	private int koko;
	
	public Binaaripuu(){
		juuri = new Alkio<t>(null, null, null);
	}
	
	//Palauttaa puun alkioiden m‰‰r‰n
	public int annaKoko() {
		return koko;
	}
	
	//Lis‰‰ arvo seuraavaan tyhj‰‰n indeksiin
	//@param arvo lis‰tt‰v‰ arvo
	public void lisaaArvo(t arvo) {
		if(koko == 0) { //Jos tyhj‰ lis‰t‰‰n arvo juureen
			juuri.asetaArvo(arvo);
			koko++;
		}
		else { //muuten etsit‰‰n seurava tyhj‰
			juuri.lisaaArvo(arvo, koko + 1, 1); 
			koko++;
		}
	}
	
	//hae arvo annetusta indeksist‰
	//@param arvo: halutun arvon indeksi
	public t haeArvo(int index) {
		if(index == 0) {//jos haluttu arvo on indeksiss‰ 0 palautetaan se
			return juuri.annaArvo();
		}
		else {//muuten etsit‰‰n haluttu indeksi
			return juuri.haeArvo(index + 1, 1);
		}
	}
	


	private class Alkio <T>{
	
		private T arvo;
		private Alkio<T> vasen;
		private Alkio<T> oikea;
		
		public Alkio(T arvo, Alkio<T> vasen, Alkio<T> oikea){
			this.arvo = arvo;
			this.vasen = vasen;
			this.oikea = oikea;
		}
		
		public T annaArvo() {
			return arvo;
		}
		
		public void asetaArvo(T arvo) {
			this.arvo = arvo;
		}
		
		//@param arvo: arvo joka lis‰t‰‰n puuhun
		//@param seuraava: seuraavan tyhj‰n alkion indeksi + 1
		//@param tama: nykyisen alkion indeksi + 1
		public void lisaaArvo(T arvo, int seuraava, int tama) {
			if(seuraava / 2 == tama) { //jos seuraava tyhj‰ on t‰m‰n alkion lapsi
				if(seuraava%2 == 0) { //jos seuraava tyhj‰ on vasen lapsi
					vasen = new Alkio<T>(arvo, null, null);
				}
				else { //jos seuraava tyhj‰ on oikea lapsi
					oikea = new Alkio<T>(arvo, null, null);
				}
			}
			else {
				if(oikeaVaiVasen(seuraava, tama)) { // seuraava tyj‰ lˆytyy oikealta
					oikea.lisaaArvo(arvo, seuraava, tama * 2 + 1);
				}
				else { //seuraava tyhj‰ lˆytyy vasemmalta
					vasen.lisaaArvo(arvo, seuraava, tama * 2);
				}
			}
		}
		
		//@param index: haetun alkion indeksi + 1
		//@param tama: nykyisen alkion indeksi + 1
		public T haeArvo(int index, int tama) {
			if(index / 2 == tama) { //jos haettu arvo on t‰m‰n alkion lapsi
				if(index % 2 == 0) { //haettu arvo on vasen lapsi
					return vasen.annaArvo();
				}
				else { //haettu arvo on oikea lapsi
					return oikea.annaArvo();
				}
			}
			else { //muuten siirryt‰‰n puussa alasp‰in
				if(oikeaVaiVasen(index, tama)) { //jos etsitty lapsi lˆytyy oikealta
					return oikea.haeArvo(index, tama * 2 +1);
				}
				else { //jos etsitty lapsi lˆytyy vasemmalta
					return vasen.haeArvo(index, tama * 2);
				}
			}
		}
		
		//Mihin suuntaan pit‰‰ edet‰ jotta lˆudet‰‰n indeksi seuraava-1
		//oikea = true, vasen = false
		//@param seuraava: halutun alkion indeksi + 1
		//@param tama: nykyisen alkion indeksi + 1
		private boolean oikeaVaiVasen(int seuraava, int tama) {
			while(seuraava > tama * 2 + 1){
				seuraava = seuraava / 2; 
			}
			if(seuraava % 2 == 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}
}