public class Blackjack {

    private Agent player;
    private Agent dealer;
    private Deck deck;

    public Blackjack() {
	deck = new Deck();
        player = new Agent();
	dealer = new Agent();
    }

    public static void main(String[] args) {
	Blackjack game = new Blackjack();
	Deck d = new Deck();
	d.shuffle();
	game.player.draw(d);
	game.player.draw(d);
	System.out.println(game.player.getHand()[0].toString());
	System.out.println(game.player.getHand()[1].toString());
	game.dealer.draw(d);
	System.out.println(game.dealer.getHand()[0].toString());
	System.out.println(game.player.getHand()[1].toString());
    }

}
