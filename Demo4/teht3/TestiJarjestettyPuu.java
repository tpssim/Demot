package teht3;

public class TestiJarjestettyPuu {

	public static void main(String[] args) {
		
		JarjestettyBinaaripuu<Integer> puu = new JarjestettyBinaaripuu<>();
		
		try{
			System.out.println("Lis‰t‰‰n puuhun arvo 100");
			puu.lisaaArvo(100);
		}catch(ArvoOnJoPuussa e) {
			
		}
		
		System.out.println("Lis‰t‰‰n puuhun arvot 0-200");
		for(int i = 0; i < 200; i++) {
			try {
				puu.lisaaArvo(i);
			}catch(ArvoOnJoPuussa e) {
				System.out.println("Yritettiin lis‰t‰ sama arvo toistamiseen");
			}
		}
		
		System.out.println("Onko puussa arvo 1: " + puu.onkoArvo(1));
		System.out.println("Onko puussa arvo 10: " + puu.onkoArvo(10));
		System.out.println("Onko puussa arvo 100: " + puu.onkoArvo(100));
		System.out.println("Onko puussa arvo 42: " + puu.onkoArvo(42));
		System.out.println("Onko puussa arvo 136: " + puu.onkoArvo(136));
		System.out.println("Onko puussa arvo 243: " + puu.onkoArvo(243));
	}
}
