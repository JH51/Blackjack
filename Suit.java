public class Suit {

    //private char suit;
    private String suit;
    private int value;

    /*
    public Suit(char suit) {
	this.suit = suit;
	switch (suit) {
	case '♦':
	    this.value = 1;
	    break;
	case '♣':
	    this.value = 2;
	    break;
	case '♥':
	    this.value = 3;
	    break;
	case '♠':
	    this.value = 4;
	    break;
	}
    }

    public Suit(int value) {
    this.value = value;
	switch (value) {
	case 1:
	    this.suit = '♦';
	    break;
	case 2:
	    this.suit = '♣';
	    break;
	case 3:
	    this.suit = '♥';
	    break;
	case 4:
	    this.suit = '♠';
	    break;
	}
    }
    */

    public Suit(int value) {
	this.value = value;
        switch (value) {
	case 1:
	    this.suit = "diamonds";
	    break;
	case 2:
	    this.suit = "clovers";
	    break;
	case 3:
	    this.suit = "hearts";
	    break;
	case 4:
	    this.suit = "spades";
	    break;
	}
    }

    public int compareTo(Suit other) {
	return this.value - other.value;
    }

    public String toString() {
	return this.suit + "";
    }

}
