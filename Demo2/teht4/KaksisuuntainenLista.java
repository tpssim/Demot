package teht4;

public class KaksisuuntainenLista {

	private Alkio alku;
	private Alkio loppu;
	
	public KaksisuuntainenLista(Object arvo) {
		alku = new Alkio(null, arvo, null);
		loppu = alku;
	}
	
	public Object ensimmainenArvo() {
		return alku.annaArvo();
	}
	
	public Object viimeinenArvo() {
		return loppu.annaArvo();
	}
	
	public void poistaEnsimmainen() {
		alku = alku.annaSeuraava();
	}
	
	public void poistaViimeinen() {
		loppu = loppu.annaEdellinen();
	}
	
	public void lisaaAlkuun(Object arvo) {
		Alkio temp = new Alkio(null, arvo, alku);
		alku.asetaEdellinen(temp);
		alku = temp;
	}
	
	public void lisaaLoppuun(Object arvo) {
		Alkio temp = new Alkio(loppu, arvo, null);
		loppu.asetaSeuraava(temp);
		loppu = temp;
	}
	
	private class Alkio{
		
		private Alkio edellinen;
		private Object arvo;
		private Alkio seuraava;
		
		public Alkio(Alkio edellinen, Object arvo, Alkio seuraava) {
			this.edellinen = edellinen;
			this.arvo = arvo;
			this.seuraava = seuraava;
		}
		
		public void asetaEdellinen(Alkio edellinen) {
			this.edellinen = edellinen;
		}
		
		public void asetaSeuraava(Alkio seuraava) {
			this.seuraava = seuraava;
		}
		
		public Alkio annaEdellinen() {
			return edellinen;
		}
		
		public Alkio annaSeuraava() {
			return seuraava;
		}
		
		public Object annaArvo() {
			return arvo;
		}
	}
}