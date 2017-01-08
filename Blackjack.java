import java.util.Scanner;

public class Blackjack {

    private Agent player;
    private Agent dealer;
    private Deck deck;

    public Blackjack() {

  System.out.println("Welcome to Blackjack");


  deck = new Deck();
        player = new Agent();
	dealer = new Agent();
    }

    public static void main(String[] args) {
	Blackjack game = new Blackjack();

  Deck d = new Deck();
	d.shuffle();
  Scanner playerInput = new Scanner(System.in);


  while(game.player.getMoney() > 0){

System.out.println("Current funds" + game.player.getMoney() + "how much to bet?");

int bet = playerInput.nextInt();
if(bet > game.player.getMoney()){
  System.out.println("can't bet more than what you have");
  break;
}
//player gets two cards
  game.player.draw(d);
	game.player.draw(d);
  System.out.println("Your cards are:");
  System.out.println(game.player.getHand()[0].toString());
	System.out.println(game.player.getHand()[1].toString());
//dealer gets two cards
  game.dealer.draw(d);
  game.dealer.draw(d);
  System.out.println("The dealer shows");
  System.out.println(game.dealer.getHand()[0].toString());

//loop for action
  while(true){
    if(game.dealer.getHand()[0].getValue() + game.dealer.getHand()[1].getValue() == 21){
      System.out.println("Dealer has Blackjack");
      game.player.setMoney(game.player.getMoney() - bet);
    }
    System.out.println(game.dealer.getHand()[0].getValue() + game.dealer.getHand()[1].getValue());
    System.out.println(game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue() + " Is your current hand value " );

   break;
  }
 }
    }

}
