package Week06Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class deck {
    private List<card> cards;

    public deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                          "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                card card = new card(i + 2, names[i] + " of " + suit);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int j = random.nextInt(cards.size());
            card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}