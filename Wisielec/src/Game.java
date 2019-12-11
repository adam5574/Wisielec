
public class Game extends Words {
	private String randword;
	private Player player;
	
	public Game() {
		  this.randword = randomWord() ;
		  }
	
	
	public String showCategory() {
		String[] tokens = randword.split(" ");

		String category = tokens[1];
		
		return category;
	}
	
	
	public void startGame() {
		
		
		
		
	}
}
