import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.cards.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand compared) {
        return this.cards.stream().mapToInt(card -> card.getValue()).reduce(0, (previousSum, value) -> previousSum + value)
            - compared.cards.stream().mapToInt(card -> card.getValue()).reduce(0, (previousSum, value) -> previousSum + value);
    }

    public void sortBySuit() {
        BySuitInValueOrder bySuitInValueOrder = new BySuitInValueOrder();
        Collections.sort(this.cards, bySuitInValueOrder);
    }
}
