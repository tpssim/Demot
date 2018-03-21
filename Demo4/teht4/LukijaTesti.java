package teht4;

public class LukijaTesti {

	public static void main(String[] args) {
		
		TiedostoLukija.kirjoitaNumerot(5, "D:\\eclipse-workspace\\Demot\\Demo4\\teht4\\luettava.txt");
		
		int numerot = TiedostoLukija.lueNumerot("D:\\eclipse-workspace\\Demot\\Demo4\\teht4\\luettava.txt");
		
		System.out.println(numerot);
	}
	
}
