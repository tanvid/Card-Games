// Deck object represents a deck of standard pack of cards 
// with 52 cards, 4 suits. Each suit contains card numbers 
// 1-10, Jack, Queen, King, and Ace

import java.util.*;

public class Deck {
	private Random r; 
	private Card[] deck; 
	private int size; 
	private static final int NUM_CARDS = 52; 

	public Deck() {
		r = new Random(); 
		deck = new Card[NUM_CARDS];
		createDeck(); 
		size = NUM_CARDS; 
	}
	
	private void createDeck() { 
		int i = 0; 
		for (Card.Suit currSuit : Card.Suit.values()) { 
			for (Card.Rank currRank : Card.Rank.values()) { 
				deck[i] = new Card(currRank, currSuit); 
				i++; 
			}
		}
	}
	
	// restores current deck to a full unshuffled deck
	public void resetDeck() { 
		createDeck(); 
		size = NUM_CARDS; 
	}
	
	// "randomly" shuffles the deck of cards
	public void shuffle() {
		Card temp; 
		for (int i = 0; i < 10000; i++) { 
			int rand1 = r.nextInt(NUM_CARDS); 
			int rand2 = r.nextInt(NUM_CARDS); 
			temp = deck[rand1]; 
			deck[rand1] = deck[rand2]; 
			deck[rand2] = temp; 
		}
	}
	
	
	// throws IllegalArgumentException if deck is empty 
	// returns and removes top card in "deck"
	public Card drawCard() { 
		if (isEmpty()) { 
			throw new IllegalArgumentException("deck is empty"); 
		}
		size--; 
		Card temp = deck[size]; 
		deck[size] = null; 
		return temp;
	}
		
	
	// returns the size of the "deck"
	public int size() { 
		return size; 
	}
	
	// returns true if the "deck" is empty
	public boolean isEmpty() { 
		return size == 0; 
	}
	
	// returns text representation of deck as a bracketed and comma-separated list
	// top of "deck" is left and bottom of "deck" is right
	public String toString() { 
		return Arrays.toString(deck); 
	}
}
