package teht3;

public class Puukko extends Tyokalu implements Teroitettava {

	int teravyys;
	
	public Puukko() {
		teravyys = 100;
	}
	
	public void teroita() {
		teravyys = 100;
		System.out.println("Puukko teroitettu.");
	}
	
	public void kayta() {
		if(teravyys < 10) {
			System.out.println("Puukko ei ole tarpeeksi terävä");
		}
		else {
			teravyys -= 10;
			System.out.println("*puukon ääniä*");
		}
	}
}
