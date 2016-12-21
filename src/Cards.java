import java.util.HashMap;

public class Cards implements Comparable<Cards> {
	private final String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private HashMap<String,Integer> map=new HashMap<>();
	private final int sindex;
	private final int rindex;

	public Cards(int sindex, int rindex) {
		
		//set the index of arrays to argument
		this.sindex = sindex;
		this.rindex = rindex;
		for(int i=0;ranks.length>i;i++){
			map.put(ranks[i],i);
		}
	}

	public String getSuit() {
		return suits[this.sindex];
	}

	public String getRank() {
		return ranks[this.rindex];
	}

	@Override
	public int compareTo(Cards arg0) {
		
		//Checks if they are the same card 
		if (arg0.getSuit() == suits[sindex] && arg0.getRank() == ranks[rindex]) {
			return 0;
		} 
		if(map.get(arg0.getRank())>map.get(ranks[this.rindex])){
			return -1;
		}
		else{
			return 1;
		}
		
	}

}
