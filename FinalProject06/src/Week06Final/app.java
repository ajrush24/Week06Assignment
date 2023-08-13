package Week06Final;

public class app {
	
    public static void main(String[] args) {
        deck deck = new deck();
        deck.shuffle();

        player player1 = new player("Player 1");
        player player2 = new player("Player 2");

        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            card card1 = player1.flip();
            card card2 = player2.flip();

            System.out.println("Turn " + (i + 1) + ":");
            System.out.println(player1.getName() + " draws: " + card1.getName());
            System.out.println(player2.getName() + " draws: " + card2.getName());

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this turn.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this turn. " );
            } else {
                System.out.println("It's a draw!");
            }

            System.out.println();
        }

        System.out.println("Final Score:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the winner!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " is the winner!");
        } else {
            System.out.println("It's a draw!"); 
        }
    }
}