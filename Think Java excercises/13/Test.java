/**
 * The Test class implements an application that 
 * just tests sorting algorithms for decks of cards.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-23
 */
public class Test {
    /**
     * Checks that the deck is sorted.
     */
    public static void checkSorted(Deck deck) {
        Card[] cards = deck.getCards();
        for (int i = 0; i < cards.length - 1; i++) {
            if (cards[i].compareTo(cards[i + 1]) >= 0) {
                System.out.println("Card #" + i + " not sorted!");
            }
        }
    }
    /**
     * Demonstrates how to call the sorting methods.
     */
    public static void main(String[] args) {
        Deck deck;
        
        System.out.println("Testing selection...");
        deck = new Deck();
        deck.shuffle();
        deck.selectionSort();
        //deck.print();
        checkSorted(deck);
        
        System.out.println("Testing mergesort...");
        deck = new Deck();
        deck.shuffle();
        deck = deck.mergeSort();
        checkSorted(deck);
        
        System.out.println("Testing insertion...");
        deck = new Deck();
        deck.shuffle();
        deck.insertionSort();
        checkSorted(deck);
    }
}
