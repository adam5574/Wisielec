
import java.io.IOException;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws IOException {
		Scanner skan = new Scanner(System.in);

		System.out.println("Witam w grze Wisielec!");
		System.out.println("1. Rozpocznij grę");
		System.out.println("2. Dodaj słowo i kategorię");
		System.out.println("3. Wyświetl wynik");
	
		int number = skan.nextInt();

		switch (number) {

		case 1:
			System.out.println("Podaj nick");
			String nick = skan.next();
			Game game=new Game();
			
			System.out.println("Kategoria hasła to: " + game.showCategory());
			
			break;
		case 2:
			
			System.out.println("Podaj słowo");

			String word = skan.next();

			System.out.println("Podaj kategorię");

			String category = skan.next();
			
			Words wd=new Words();
			wd.save(word,category);
			break;
		}

	}
}