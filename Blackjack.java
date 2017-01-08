public class Blackjack {

    Agent player;
    private Agent dealer;
    private Deck deck;

    public Blackjack() {
	deck = new Deck();
        player = new Agent();
	dealer = new Agent();
    }

    public static void main(String[] args) {
	Blackjack game = new Blackjack();
	game.player.draw();
	System.out.println(game.player.getValue());
    }

}
