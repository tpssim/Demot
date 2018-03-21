package teht4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TiedostoLukija {

	// Metodi kirjoittaa valitussa polussa olevaan tiedostoon numerot v‰lill‰ 0Öm‰‰r‰ omille riveilleen.
	public static void kirjoitaNumerot(int maara, String polku) {
		try{
			FileWriter writer = new FileWriter(polku);
			for(int i = 0; i < maara + 1; i++) {
				writer.write(i + "");
				writer.write(System.lineSeparator());
			}
			writer.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Kirjoitus ep‰onnistui");
		}
	}
	
	// Metodi lukee numerot annetusta tiedostopolusta ja palauttaa niiden summan.
	public static int lueNumerot(String polku) {
		File file = new File(polku);
		try {
			Scanner scanner = new Scanner(file);
			int tulos = 0;
			while(scanner.hasNextLine()) {
				int i = Integer.parseInt(scanner.nextLine());
				tulos += i;
			}
			scanner.close();
			return tulos;
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Luku ep‰onnistui");
			return 0;
		}
	}
}
