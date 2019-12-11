import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Words {

	

	private String filePath() {

		String path = "words_list.txt";
		return path;
	}

	public String randomWord() {

		String filePath = filePath();
		BufferedReader fileReader = null;
		int howmanyline = 0;
		String rword = null;

		try {
			String strCurrentLine;
			fileReader = new BufferedReader(new FileReader(filePath));

			while ((strCurrentLine = fileReader.readLine()) != null) {

				howmanyline++;

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

		try {
			String strCurrentLine = null;
			fileReader = new BufferedReader(new FileReader(filePath));
			Random r = new Random();
			int randomnumber = r.nextInt(5) + 1;
	
			for (int i = 0; i < randomnumber; i++) {
				strCurrentLine = fileReader.readLine();

			}
			rword = strCurrentLine;

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

		return rword;

	}

	public boolean checkIfExiste(String word) {
		String filePath = filePath();
		BufferedReader fileReader = null;

		try {
			String strCurrentLine;
			fileReader = new BufferedReader(new FileReader(filePath));

			while ((strCurrentLine = fileReader.readLine()) != null) {

				String[] tokens = strCurrentLine.split(" ");

				String wordfromlist = tokens[0];

				if (wordfromlist.equals(word)) {
					return false;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

		return true;
	}

	public void save(String word, String category) {

		if (checkIfExiste(word)) {
			BufferedWriter writer = null;
			String filePath = filePath();
			try {

				writer = new BufferedWriter(new FileWriter(filePath, true));
				writer.append('\n');
				writer.append(word + " " + category);

				System.out.println("Nowe słowo zostało dodane do listy");

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (writer != null) {
						writer.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}

		} else {
			System.out.println("Słowo istnieje w bazie");
		}

	}
}