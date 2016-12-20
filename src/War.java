import java.util.Scanner;

public class War {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Players?");
		int x=sc.nextInt();
		sc.close();
		
		
		DeckOfCards master=new DeckOfCards();
		DeckOfCards[] players=new DeckOfCards[x];
		
		
		//Initialize Card decks in players array 
		for(int i=0; i<players.length;i++){
			players[i]=new DeckOfCards();
		}
		
		//Create master deck 
		master.createFullDeck();
		master.shuffle();
		
		
		//deal cards out to players 
		for(int i=master.sizeOfDeck();i>0;i--){
			for(int j=0; j<players.length;j++){
				if(master.sizeOfDeck()>0){
				master.deal(players[j]);
				}
			}
		}
	
	}

}
