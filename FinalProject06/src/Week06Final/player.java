package Week06Final;

import java.util.ArrayList;
import java.util.List;

public class player {
    private List<card> hand;
    private int score;
    public String name;

    public player(String name) {
        this.name = name;
        hand = new ArrayList<>();
        score = 0;
    }

    public void describe() {
        System.out.println(name + " hand:");
        for (card card : hand) {
            card.describe();
        }
    }

    public card flip() {
        if (hand.isEmpty()) {
            return null;
        }
        return hand.remove(0);
    }

    public void draw(deck deck) {
        card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

	public String getName() {
		return name;
		
	}
}
