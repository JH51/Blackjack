import java.util.Random;

public class Deck {

<<<<<<< HEAD

=======
Double d = (int)Math.random()*1000;
int i = (int) d;
    Random r = new Random(i);
>>>>>>> e2190ffc83108edd9d2d92c20c973d3913637819
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
	this.shuffle();
    }

    public void shuffle() {
	Card a;
	Card b;
 	for (int i = 0; i < deck.length; i += 1) {
	    int j = (int)(Math.random() * deck.length);
	    a = deck[i];
	    b = deck[j];
	    deck[i] = b;
	    deck[j] = a;
	}
    }

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

public Card[] getDeck() {
	return this.deck;
}

    public static void main(String[] args) {
	Deck a = new Deck();
	a.shuffle();
	System.out.println(a.count);
	for (int i = 0; i < a.deck.length; i += 1) {
	    System.out.println(a.deck[i].toString() + " " + i);
	}
	System.out.println(a.draw().toString());
    }

}
