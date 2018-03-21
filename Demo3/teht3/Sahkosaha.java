package teht3;

public class Sahkosaha extends Tyokalu implements Ladattava {
	
	private int akunVaraus;
	
	public Sahkosaha(){
		akunVaraus = 100;
	}
	
	public void lataa() {
		akunVaraus = 100;
		System.out.println("Sahkosahan akku ladattu.");
	}
	
	public void kayta() {
		if(akunVaraus < 10) {
			System.out.println("Sahkosahan akku on tyhjä.");
		}
		else {
			akunVaraus -= 10;
			System.out.println("*sähkösahan ääniä*");
		}
	}
	
	
}
