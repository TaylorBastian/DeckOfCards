
public class Cards implements Comparable<Cards> {
	private String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private final int sindex;
	private final int rindex;

	public Cards(int sindex, int rindex) {
		
		//set the index of arrays to argument
		this.sindex = sindex;
		this.rindex = rindex;
	}

	public String getSuits() {
		return suits[this.sindex];
	}

	public String getRanks() {
		return ranks[this.rindex];
	}

	@Override
	public int compareTo(Cards arg0) {
		
		//Checks if they are the same card 
		if (arg0.getSuits() == suits[sindex] && arg0.getRanks() == ranks[rindex]) {
			return 0;
		} else {
			return 1;
		}
	}

}
