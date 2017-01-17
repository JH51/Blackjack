package mainPackage;

public class Suit {

    private String suit;
    private int value;

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
