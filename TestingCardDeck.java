
// Sample test code for Card and Deck methods

public class TestingCardDeck {

	public static void main(String[] args) {
		// CARD TESTING
		Card card1 = new Card(Card.Rank.EIGHT, Card.Suit.HEARTS); 
		System.out.println(card1.getSuit());
		System.out.println(card1.getValue());
		System.out.println(card1);
		System.out.println(); 
		// getSuit(), getValue(), toString() work
		
		
		// DECK TESTING
		Deck deck = new Deck(); 
		System.out.println(deck); 
		System.out.println(deck.size()); 
		for (int i = 0; i < 3; i++) {
			deck.shuffle();
			System.out.println(deck);	
		}
		// shuffle works
		Card drawnCard = deck.drawCard(); 
		System.out.println(deck.size()); 
		System.out.println(drawnCard); // "resizing" and drawing card works
		for (int i = 0; i < 8; i++) {
			deck.drawCard(); 
		}
		System.out.println("size: " + deck.size() + ", "+ deck);
		deck.resetDeck(); 
		System.out.println("size: " + deck.size() + ", "+ deck);
		while(!deck.isEmpty()) { 
			deck.drawCard(); 
		}
		// deck.drawCard(); // IAE works when deck is empty
	}
}
