import java.util.Random;

public class Deck {

    private Random r = new Random();
    private Card[] deck;

    public Deck() {
	deck = new Card[52];
	Suit Diamond = new Suit("Diamond");
	Suit Clover = new Suit("Clover");
	Suit Heart = new Suit("Heart");
	Suit Spade = new Suit("Spade");
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

    public static void main(String[] args) {
	Deck a = new Deck();
	a.shuffle();
	for (int i = 0; i < a.deck.length; i += 1) {
	    System.out.println(a.deck[i].toString());
	}
    }

}
