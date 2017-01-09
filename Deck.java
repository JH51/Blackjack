import java.util.Random;

public class Deck {

<<<<<<< HEAD
    private Random r = new Random();
=======
    Random r = new Random();
>>>>>>> ca064e0bf99343ade9187ce0aa5623e9533bd308
    private Card[] deck;
    private int count = 0;

    public Deck() {
<<<<<<< HEAD
	deck = new Card[52];
	Suit Diamond = new Suit("Diamond");
	Suit Clover = new Suit("Clover");
	Suit Heart = new Suit("Heart");
	Suit Spade = new Suit("Spade");
=======
	count = 52;
	deck = new Card[count];
	Suit Diamond = new Suit(1);
	Suit Clover = new Suit(2);
	Suit Heart = new Suit(3);
	Suit Spade = new Suit(4);
>>>>>>> ca064e0bf99343ade9187ce0aa5623e9533bd308
	char[] names = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};
	int i = 0;
	for (char c : names) {
	    deck[i] = new Card(c, Diamond);
	    i += 1;
	    deck[i] = new Card(c, Clover);
	    i += 1;
	    deck[i] = new Card(c, Heart);
	    i += 1;
	    deck[i] = new Card(c, Spade);
	    i += 1;
	}
<<<<<<< HEAD

	/*
	int counter = 0;
	for (char c = '0'; c <= '9'; c += 1) {
	    deck[counter] = new Card(c, Diamond);
	    deck[counter + 1] = new Card(c, Clover);
	    deck[counter + 2] = new Card(c, Heart);
	    deck[counter + 3] = new Card(c, Spade);
	    counter += 4;
	}
	char[] royals = {'A', 'J', 'Q', 'K'};
	for (int i = 0; i < royals.length; i += 1) {
	    deck[counter] = new Card(royals[i], Diamond);
	    deck[counter + 1] = new Card(royals[i], Clover);
	    deck[counter + 2] = new Card(royals[i], Heart);
	    deck[counter + 3] = new Card(royals[i], Spade);
	    counter += 4;
	    }
	*/

=======
	this.shuffle();
>>>>>>> ca064e0bf99343ade9187ce0aa5623e9533bd308
    }

    public void shuffle() {
	Card a;
	Card b;
 	for (int i = 0; i < deck.length; i += 1) {
	    int j = r.nextInt(deck.length);
	    a = deck[i];
	    b = deck[j];
	    deck[i] = b;
	    deck[j] = a;
	}
    }
<<<<<<< HEAD
=======

    public Card draw() {
	int index = 52 - count;
	this.count -= 1;
	Card card = this.deck[index];
	this.deck[index] = null;
	return card;
    }

    public int length() {
	return count;
    }
>>>>>>> ca064e0bf99343ade9187ce0aa5623e9533bd308

    public static void main(String[] args) {
	Deck a = new Deck();
	a.shuffle();
<<<<<<< HEAD
=======
	System.out.println(a.count);
>>>>>>> ca064e0bf99343ade9187ce0aa5623e9533bd308
	for (int i = 0; i < a.deck.length; i += 1) {
	    System.out.println(a.deck[i].toString() + " " + i);
	}
	System.out.println(a.draw().toString());
    }

}
