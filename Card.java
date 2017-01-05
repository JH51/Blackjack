public class Card {

    private char name;
    private int value;
    private Suit suit;

    public Card(char name, Suit suit) {
	this.suit = suit;
	if (name == 'A') {
	    this.name = name;
	    this.value = 1;
	}
	if (name >= '2' && name <= '9') {
	    this.name = name;
	    this.value = name - '0';
	}
	if (name == '0' || name == 'J' || name == 'Q' || name == 'K') {
	    this.name = name;
	    this.value = 10;
	}
    }

    public Card(int value, Suit suit) {
	this.value = value;
	this.suit = suit;
    }

    public int getValue() {
	return this.value;
    }

    public Suit getSuit() {
	return this.suit;
    }

    public String toString() {
	return this.name + " " + this.value + " " + this.suit.toString();
    }

}
