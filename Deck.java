import Random

public class Deck {

    private Card[] deck;

    public Deck() {
	deck = new Card[52];
	Suit Diamond = new Suit("Diamond");
	Suit Clover = new Suit("Clover");
	Suit Heart = new Suit("Heart");
	Suit Spade = new Suit("Spade");
	int counter = 0;
	for (char c = '0'; c <= '9'; c += 1) {
	    deck[counter] = new Card(c, Diamond);
	    deck[counter + 1] = new Card(c, Clover);
	    deck[counter + 2] = new Card(c, Heart);
	    deck[counter + 3] = new Card(c, Spade);
	    counter += 4;
	}
	char[] royals = {'J', 'Q', 'K'};
	for (int i = 0; i < royals.length; i += 1) {
	    deck[counter] = new Card(royals[i], Diamond);
	    deck[counter + 1] = new Card(royals[i], Clover);
	    deck[counter + 2] = new Card(royals[i], Heart);
	    deck[counter + 3] = new Card(royals[i], Spade);
	    counter += 4;
	}
    }

    public void shuffle() {
	int a;
	int b;
	for (int i = deck.length; i < data.length; i += 1) {
	    a = deck[i];
	    b = deck(r.nextInt

    public static void main(String[] args) {
	Deck a = new Deck();
	for (int i = 0; i < a.deck.length; i += 1) {
	    System.out.println(a.deck[i].toString());
	}
    }

}
