public class Suit {

    private String suit;
    private int value;

    public Suit(String suit) {
	switch (suit) {
	case "Diamond":
	    this.suit = suit;
	    this.value = 1;
	    break;
	case "Clover":
	    this.suit = suit;
	    this.value = 2;
	    break;
	case "Heart":
	    this.suit = suit;
	    this.value = 3;
	    break;
	case "Spade":
	    this.suit = suit;
	    this.value = 4;
	    break;
	}
    }

    public Suit(int value) {
	switch (value) {
	case 1:
	    this.value = value;
	    this.suit = "Diamond";
	    break;
	case 2:
	    this.value = value;
	    this.suit = "Clover";
	    break;
	case 3:
	    this.value = value;
	    this.suit = "Heart";
	    break;
	case 4:
	    this.value = value;
	    this.suit = "Spade";
	    break;
	}
    }

    public int compareTo(Suit other) {
	return this.value - other.value;
    }

    public String toString() {
	return this.suit;
    }

}
