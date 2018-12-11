import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * The CardTable class implements an application that 
 * 
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-22
 */
public class CardTable extends Canvas {
    /**
     * Declares multidimensional array with images of cards and sizes of cards.
     */
    private Image[][] images;
    private int cardWidth, cardHeight;
    /** 
     * This main method makes the frame by using JFrame, adds Cardtable object
     * and shows the frame.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String cardset = "cardset-oxymoron";
        Canvas canvas = new CardTable(cardset);
        frame.getContentPane().add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * Creates a table of cards with defined background color and creates
     * a 2D array of card images.
     */
    public CardTable(String cardset) {
        setBackground(new Color(0x088A4B));
        images = new Image[14][4];
        String suits = "cdhs";
        for (int suit = 0; suit <= 3; suit++) {
            char c = suits.charAt(suit);
            for (int rank = 1; rank <= 13; rank++) {
                String s = String.format("%s/%02d%c.gif",
                                         cardset, rank, c);
                images[rank][suit] = new ImageIcon(s).getImage();
            }
        }
        /**
         * Gets the width and height of the cards and set the 
         * size of the frame accordingly. Also sets temporalily size of a table.
         */
        cardWidth = images[1][1].getWidth(null);
        cardHeight = images[1][1].getHeight(null);
        setTableSize(14, 4);
    }
    /**
     * Sets the table size through x and y variables.
     */
    public void setTableSize(double x, double y) {
        setSize((int) (x * cardWidth),
                (int) (y * cardHeight));
    }
    /**
     * Draws a card at the given coordinates.
     */
    public void drawCard(Graphics g, int rank, int suit, double x, double y) {
        Image image = images[rank][suit];
        g.drawImage(image,
                    (int) (x * cardWidth),
                    (int) (y * cardHeight),
                    null);
    }
    /**
     * Special method invoked when the Frame needs to be drawn.
     */
    public void paint(Graphics g) {
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 0; suit <= 3; suit++) {
                double x = rank - 1 + suit / 5.0;
                double y = suit / 2.0;
                drawCard(g, rank, suit, x, y);
            }
        }
    }
}
