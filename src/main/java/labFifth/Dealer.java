package labFifth;

public class Dealer extends Hand {

    @Override
    void decide(GameDeck filledDeck) {
        while (!checkOverflow(17)) {
            takeCard(filledDeck);
        }
    }
}
