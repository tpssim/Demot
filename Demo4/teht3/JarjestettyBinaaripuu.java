package teht3;

public class JarjestettyBinaaripuu<E extends Comparable<E>> {

	private Solmu<E> juuri;
	private int koko;
	
	public JarjestettyBinaaripuu() {
		juuri = new Solmu<E>(null, null, null);
		koko = 0;
	}
	
	//Palauttaa puun alkioiden m‰‰r‰n
	public int annaKoko() {
		return koko;
	}
	
	//Lis‰‰ arvon puhun
	//@param arvo: Lis‰tt‰v‰ arvo
	//Heitt‰‰ poikkeuksen jos koitetaan lis‰t‰ arvo joka on jo puussa
	public void lisaaArvo(E arvo) throws ArvoOnJoPuussa {
		if(koko == 0) { //Jos puu on tyhj‰ lis‰t‰‰n arvo juureen
			juuri.asetaArvo(arvo);
		}else { //Muuten kutsutaan solmun metodia arvon lis‰‰miseksi
			juuri.lisaaArvo(arvo);
			}
		koko++;
	}
	
	//Lˆytyykˆ annettu arvo puusta
	//@param arvo: Etitt‰v‰ arvo
	//@return jos arvo on puussa: true, jos ei: false
	public boolean onkoArvo(E arvo) {
		return juuri.onkoArvo(arvo);
	}
	
	private class Solmu<t extends Comparable <t>> {
		
		private t arvo;
		private Solmu<t> vasen;
		private Solmu<t> oikea;
		
		public Solmu(t arvo, Solmu<t> vasen, Solmu<t> oikea) {
			this.arvo = arvo;
			this.vasen = vasen;
			this.oikea = oikea;
		}
		
		public void asetaArvo(t arvo) {
			this.arvo = arvo;
		}
		
		public void lisaaArvo(t arvo) throws ArvoOnJoPuussa {
			if(arvo.compareTo(this.arvo) < 0) { //Jos lis‰tt‰v‰ arvo on pienemi kuin t‰m‰n solmun arvo
				if(vasen == null) { //Jos t‰ll‰ solmulla ei viel‰ ole vasenta lasta luodaan sellainen ja lis‰t‰‰n arvo siihen
					vasen = new Solmu<t>(arvo, null, null);
				}else { //Muuten kutsutaan t‰t‰ mtodia uudelleen vasemalle lapselle
					vasen.lisaaArvo(arvo);
				}
			}else if (arvo.compareTo(this.arvo) > 0) { //Jos lis‰tt‰v‰ arvo on surempi kuin t‰m‰n solmun arvo
				if(oikea == null) { //Jos t‰ll‰ solmulla ei viel‰ ole oikeaa lasta luodaan sellainen ja lis‰t‰‰n arvo siihen
					oikea = new Solmu<t>(arvo, null, null);
				}else { //Muuten kutsutaan t‰t‰ metodia uudelleen oikealle lapselle
					oikea.lisaaArvo(arvo);
				}
			}else { //Jos lis‰tt‰v‰ ei ole pienempi tai suurempi kuin t‰m‰ solmu -> yht‰suuri -> heitet‰‰n poikkeus
				throw new ArvoOnJoPuussa("");
			}
		}
		
		public boolean onkoArvo(t arvo) {
			if (arvo.compareTo(this.arvo) == 0) { //Jos arvo on sama kuin t‰m‰n solumun arvo palautetaan true
				return true;
			}else if (arvo.compareTo(this.arvo) < 0) { //Jos arvo on pienempi kuin t‰m‰n solmun arvo...
				if(vasen == null) { //... ja jos vasenta lasta ei ole olemassa palautetaan false
					return false;
				}else { //... ja jos vasen lapsi on olemassa kutsutaan t‰t‰ metodia vasemmalle lapselle
					return vasen.onkoArvo(arvo);
				}
			}else if (arvo.compareTo(this.arvo) > 0) { //Jos arvo on suurempi kuin t‰m‰n solmun arvo...
				if(oikea == null) { //... ja jos oikeaa lasta ei ole olemassa palautetaan false
					return false;
				}else { //... ja jos oikea lapsi on olemassa kutsutaan t‰t‰ metodia oikealle lapselle
					return oikea.onkoArvo(arvo);
				}
			}//T‰nne ei p‰‰se mutta k‰‰nt‰j‰ vaatii t‰m‰n
			return false;
		}
	}
}