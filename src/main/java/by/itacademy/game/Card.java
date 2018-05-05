package by.itacademy.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
    List<String> card = new ArrayList<>();
    List<String> suit = new ArrayList<>();
    int cardNamber;
    int suitNamber;
    String currentCard;

    public List<String> getCard() {
        card.add("2");
        card.add("3");
        card.add("4");
        card.add("5");
        card.add("6");
        card.add("7");
        card.add("8");
        card.add("9");
        card.add("10");
        card.add("jack");
        card.add("lady");
        card.add("king");
        card.add("ace");
        return card;
    }

    public List<String> getSuit() {
        suit.add("diamonds");
        suit.add("hearts");
        suit.add("spades");
        suit.add("clubs");
        return suit;
    }

    public String getRandomCard() {
        Random random = new Random();
        cardNamber = random.nextInt(13);
        suitNamber = random.nextInt(4);
        currentCard = getCard().get(cardNamber)+" "+getSuit().get(suitNamber);
        return currentCard;
    }
}
