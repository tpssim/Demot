package teht3;

public class Hiomakone extends Tyokalu implements Ladattava {
	
	private int akunVaraus;
	
	public Hiomakone(){
		akunVaraus = 100;
	}
	
	public void lataa() {
		akunVaraus = 100;
		System.out.println("Hiomakoneen akku ladattu.");
	}
	
	public void kayta() {
		if(akunVaraus < 10) {
			System.out.println("Hiomakoneen akku on tyhjä.");
		}
		else {
			akunVaraus -= 10;
			System.out.println("*hiomakoneen ääniä*");
		}
	}

}
