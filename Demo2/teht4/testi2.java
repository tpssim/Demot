package teht4;

public class testi2 {
	
	public static void main(String[] args) {
		KaksisuuntainenLista lista = new KaksisuuntainenLista(12);
		
		lista.lisaaAlkuun(4);
		lista.lisaaLoppuun(54);
		
		System.out.println(lista.ensimmainenArvo());
		System.out.println(lista.viimeinenArvo());
		
		lista.poistaEnsimmainen();
		lista.poistaViimeinen();
		
		System.out.println(lista.ensimmainenArvo());
		System.out.print(lista.viimeinenArvo());
	}
}
