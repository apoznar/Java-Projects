/**
 * The Tile class implements an application that 
 * represents Scrabble tiles.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-21 
 */
public class Tile {
    /** 
     * This main method creates aTile object through testTile method with given
     * parameters and print it, then sets its value to 20 by a value setter
     * and prints it and then prints it once again without setter.
     * At the end it prints boolean value of comparing both values and tile letter.
     */
    public static void main(String args[]) {
        Tile aTile = testTile();
        aTile.setValue(20);
        printTile(aTile);
        System.out.println(aTile.equals(testTile()) + " " + aTile.getLetter());
    }
    private char letter;
    private int value;
    /** 
     * This constructor takes parameters named letter and value
     * and initializes the instance variables.
     */
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    /** 
     * Takes a Tile object as a parameter and displays the instance
     * variables in a reader-friendly format.
     */
    public static void printTile(Tile tile) {
        System.out.println("A tile with " + tile.letter + " and " + tile.value);
    }
    /** 
     * Creates a Tile object with a letter Z and the value of 10, and then
     * uses printTile method to display the state of the object.
     */
    public static Tile testTile() {
        Tile tile = new Tile('Z', 10);
        printTile(tile);
        return tile;
    }
    /** 
     * Implements toString method.
     */
    public String toString() {
        return "A tile with " + this.letter + " and " + this.value;
    }
    /** 
     * Implements equals method.
     */
    public boolean equals(Tile that) {
        return this.letter == that.letter && this.value == that.value;
    }
    /** 
     * Getter for the letter attribute.
     */
    public char getLetter() {
        return this.letter;
    }
    /** 
     * Setter for the letter attribute. 
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    /** 
     * Getter for the value attribute.
     */
    public int getValue() {
        return this.value;
    }
    /** 
     * Setter for the value attribute. 
     */
    public void setValue(int value) {
        this.value = value;
    }
}
