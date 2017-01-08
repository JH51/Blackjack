public class Agent {

    Card[] hand;
    int count;
    int value;

    public Agent() {
	this.hand = new Card[52];
	this.count = 0;
	this.value = 0;
    }

    public int getCount() {
	return this.count;
    }

    public int getValue() {
	value = 0;
	for (int i = 0; i < this.count; i += 1) {
	    value += hand[i].getValue();
	}
	return this.value;
    }

    public Card[] getHand() {
	return this.hand;
    }

    public void draw(Deck deck) {
        hand[count] = deck.draw();
	count += 1;
    }

    public static void main(String[] args) {
	Deck d = new Deck();
	Agent a = new Agent();
	a.draw(d);
	System.out.println(a.getValue());
    }
   
}
