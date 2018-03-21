package teht3;

public class Kirves extends Tyokalu implements Teroitettava {
	
	int teravyys;
	
	public Kirves() {
		teravyys = 100;
	}
	
	public void teroita() {
		teravyys = 100;
		System.out.println("Kirves teroitettu.");
	}
	
	public void kayta() {
		if(teravyys < 10) {
			System.out.println("Kirves ei ole tarpeeksi terävä");
		}
		else {
			teravyys -= 10;
			System.out.println("*kirveen ääniä*");
		}
	}
}
