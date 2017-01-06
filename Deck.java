import java.util.Random;

public class Deck {

    private Random r = new Random();
    private Card[] deck;
    private int count = 0;

    public Deck() {
	count = 52;
	deck = new Card[count];
	Suit Diamond = new Suit(1);
	Suit Clover = new Suit(2);
	Suit Heart = new Suit(3);
	Suit Spade = new Suit(4);
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

    /*
    public static void remove() {
	count -= 1;
	this.deck[count] = 
    */

    public static void main(String[] args) {
	Deck a = new Deck();
	a.shuffle();
	for (int i = 0; i < a.deck.length; i += 1) {
	    System.out.println(a.deck[i].toString());
	}
    }

}
