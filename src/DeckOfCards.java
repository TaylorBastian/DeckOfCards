import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
	private ArrayList<Cards> deck;

	public DeckOfCards() {
		deck = new ArrayList<>();

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 12; j++) {
				Cards x = new Cards(i, j);
				deck.add(x);

			}
		}
	}

	public Cards getCard(int index) {
			return deck.get(index);
	}
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public Cards deal(){
		Random rand = new Random();
		return deck.get(rand.nextInt(52));
	}

}
