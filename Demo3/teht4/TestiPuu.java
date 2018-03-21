package teht4;

public class TestiPuu {

	public static void main(String[] args) {
		
		Binaaripuu<Integer> puu = new Binaaripuu<Integer>();
		
		long time = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			puu.lisaaArvo(i);
		}
		time = System.currentTimeMillis() - time;
		
		System.out.println("1000 alkion lisääminen puuhun kesti: " + time + "ms");
		
	}
}