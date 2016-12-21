public class War {

	public static void main(String[] args) {
		
		
		DeckOfCards master=new DeckOfCards();
		DeckOfCards player1=new DeckOfCards();
		DeckOfCards player2=new DeckOfCards();
		
		
		//Initialize Card decks in players arr
		//Create master deck 
		master.createFullDeck();
		master.shuffle();
		
		
		//deal cards out to players 
		for(int i=master.sizeOfDeck();i>0;i=i-2){
				master.deal(player1);
				master.deal(player2);
			}
		for(int i=0;i<100;i++){
			player1.deal(master);
			player2.deal(master);
			//If cards are the same
			if(master.getCard(0).compareTo(master.getCard(1))==0){
				player1.deal(master);
				player1.deal(master);
				player1.deal(master);
				player2.deal(master);
				player2.deal(master);
				player2.deal(master);
				int x=0;
				for(int j=0;j<4;j++){
					x=x+master.getCard(j+2).compareTo(master.getCard(j+5));	
				}
				if(x>0){
					for(int m=master.sizeOfDeck();m>0;m--){
						master.deal(player1);
					}
				}else{
					for(int m=master.sizeOfDeck();m>0;m--){
						master.deal(player1);
					}
				}
				
				
			}
			//If player 1 has better card 
			if(master.getCard(0).compareTo(master.getCard(1))==1){
				master.deal(player1);
				master.deal(player1);
				
			}
			//If player 2 has better card 
			if(master.getCard(0).compareTo(master.getCard(1))==1){
				master.deal(player2);
				master.deal(player2);
			}
			System.out.println(player1.sizeOfDeck());
			System.out.println(player2.sizeOfDeck());
			System.out.println("~~~~~~~~~~~~~~~~~~");
			
			if(player1.sizeOfDeck()==0){
				System.out.println("Player2 wins");
				break;
			}
			if(player2.sizeOfDeck()==0){
				System.out.println("Player1 wins");
				break;
			}
		}
	
	}

}
