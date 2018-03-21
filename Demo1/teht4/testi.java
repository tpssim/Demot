package teht4;

public class testi {
	
	public static void main(String[] args) {
		
		Lista lista = new Lista(4);
		Lista lista2 = new Lista(new int[] {2,4,6,4,2,6});
		
		lista.lisaaArvo(3);
		lista.lisaaArvo(new int[] {8,5,9,3});
		
		System.out.println("lista: @index=3:  " + lista.haeArvo(3));
		System.out.println("lista2: @index=3:  " + lista2.haeArvo(3));
		
		System.out.println("Poistetaan molemmista arvo indeksist‰ 3");
		lista.poistaArvo(3);
		lista2.poistaArvo(3);
		
		System.out.println("lista: @index=3:  " + lista.haeArvo(3));
		System.out.println("lista2: @index=3:  " + lista2.haeArvo(3));
		
		System.out.println("Lis‰t‰‰n listaan arvo 5 indeksiin 3 ja lista2 arvo 3 indeksiin 0");
		lista.lisaaArvo(5, 3);
		lista2.lisaaArvo(3, 0);
		
		System.out.println("lista: @index=3:  " + lista.haeArvo(3));
		System.out.println("lista2: @index=0:  " + lista2.haeArvo(0));
		
		lista2.poistaArvo(10);
		
	}
}
