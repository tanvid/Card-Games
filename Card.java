// Card object represents a card in a standard deck of playing cards, each card having
// a suit and a value. 

public class Card implements Comparable<Card> {

	public enum Suit {
		HEARTS, DIAMONDS, SPADES, CLUBS
	}
	
	public enum Rank { 
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), 
		NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13); 
		
		private int value; 
		
		private Rank(int value) {
			this.value = value; 
		}
		
		public int getRankValue() { 
			return this.value; 
		}
	}
	
	private Rank rank; 
	private Suit suit; 

	public Card(Rank rank, Suit suit) {
		this.suit = suit; 
		this.rank = rank; 
	}
	
	public Suit getSuit() {
		return suit; 
	}
	
	public Rank getRank() {
		return rank; 
	}
	
	public int getValue() { 
		return rank.getRankValue(); 
	}
	
	// compares cards based on suit and rank
	public boolean equals(Card other) { 
		return other.getSuit() == this.getSuit() && other.getRank() == this.getRank(); 
	}
	
	// returns negative number if this is less than other
	// 		positive number if this is greater than other
	// 		and 0 if they are equal
	public int compareTo(Card other) {
		return this.getValue() - other.getValue(); 
	}

	public String toString() { 
		return getRank() + " OF " + getSuit(); 
	}

}