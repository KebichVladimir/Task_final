package by.itacademy.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<String> card = new ArrayList<>();
    int sumValue = 0;


    public void addGame(String name, String card) {

    }

    public int countingValues() {
        if (card.contains("2")) {
            sumValue += 2;
        }
        if (card.contains("3")) {
            sumValue += 3;
        }
        if (card.contains("4")) {
            sumValue += 4;
        }
        if (card.contains("5")) {
            sumValue += 5;
        }
        if (card.contains("6")) {
            sumValue += 6;
        }
        if (card.contains("7")) {
            sumValue += 7;
        }
        if (card.contains("8")) {
            sumValue += 8;
        }
        if (card.contains("9")) {
            sumValue += 9;
        }
        if (card.contains("10")) {
            sumValue += 10;
        }
        if (card.contains("jack")) {
            sumValue += 10;
        }
        if (card.contains("lady")) {
            sumValue += 10;
        }
        if (card.contains("king")) {
            sumValue += 10;
        }
        if (card.contains("ace")) {
            if (sumValue < 11) {
                sumValue += 11;
            } else {
                sumValue += 1;
            }
        }
        return sumValue;
    }
}
