package collection.compare.test;

public class Card implements Comparable<Card> {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank == anotherCard.rank) {
            return this.suit.compareTo(anotherCard.suit);
        }

        return Integer.compare(this.rank, anotherCard.rank);
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
