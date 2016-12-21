import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class DeckOfCards {
	private LinkedList<Cards> deck;

	DeckOfCards() {
		deck = new LinkedList<>();

	}

	public void createFullDeck() {
		deck.clear();
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

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Cards deal(DeckOfCards arg) {
		Random rand = new Random();
		int random = rand.nextInt(deck.size());
		Cards x = deck.get(random);

		if (arg != null) {
			arg.addCard(x);
		}
		deck.remove(random);
		return x;
	}

	public void addCard(Cards args) {
		deck.add(args);
	}

	public void removeCard(int index) {
		deck.remove(index);
	}

	public int sizeOfDeck() {
		return deck.size();
	}

	public void printDeck() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i).getRank() + " of " + deck.get(i).getSuit());
		}
	}

}
