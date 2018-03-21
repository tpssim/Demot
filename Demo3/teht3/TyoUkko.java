package teht3;

public class TyoUkko {

	public static void main(String[] args) {
		
		Tyokalupakki pakki = new Tyokalupakki();
		
		pakki.lisaaPakkiin(new Hiomakone());
		pakki.lisaaPakkiin(new Kirves());
		pakki.lisaaPakkiin(new Puukko());
		pakki.lisaaPakkiin(new Sahkosaha());
		pakki.lisaaPakkiin(new Vasara());
		
		pakki.kayta(Kirves.class);
		pakki.kayta(Sahkosaha.class);
		
		pakki.lataaLadattavat();
		pakki.teroitaTeroitettavat();
		
	}
}
