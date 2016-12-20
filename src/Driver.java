
public class Driver {

	public static void main(String[] args) {
		DeckOfCards dealer=new DeckOfCards();
		DeckOfCards player1=new DeckOfCards();
		DeckOfCards player2=new DeckOfCards();
		dealer.createFullDeck();
		dealer.shuffle();
		
		for(int i=0;7>i;i++){
			dealer.deal(player1);
			dealer.deal(player2);
		}
		
		player1.printDeck();
		System.out.println();
		System.out.println();
		player2.printDeck();
		System.out.println();
		System.out.println();
		System.out.println(player1.sizeOfDeck());
		System.out.println(player2.sizeOfDeck());
		
		System.out.println(dealer.sizeOfDeck());

	}

}
