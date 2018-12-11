/**
 * The Rational class implements an application that 
 * displays Rational object and do series of modification
 * of an object and output.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-21
 */
public class Rational {
    /** 
     * This main method creates a new Rational object called temp1,
     * sets two instance variables that store numerator and 
     * denominator and displays the object.
     * It creates a new Rational object called temp2 with set arguments,
     * negate it, invert it and print a string that contains this object,
     * one after add method and one conversed to double type.
     */
    public static void main(String args[]) {
        Rational temp1 = new Rational();
        temp1.setNumerator(17);
        temp1.setDenominator(-12);
        temp1.printRational();
        Rational temp2 = new Rational(temp1.getDenominator(), 15);
        temp2.negate();
        temp2.invert();
        System.out.println(temp2 + " " + temp2.add(temp1) + " " + temp2.toDouble());
    }
    private int numerator;
    private int denominator;
    /** 
     * Setter for the numerator attribute and negating it through correct method.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.correct();
    }
    /** 
     * Getter for the numerator attribute, it returns value.
     */
    public int getNumerator() {
        return this.numerator;
    }
    /** 
     * Setter for the denominator attribute and negating it through correct method.
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
        this.correct();
    }
    /** 
     * Getter for the denominator attribute, it returns value.
     */
    public int getDenominator() {
        return this.denominator;
    }
    /** 
     * Constructor with no arguments, that sets numerator to 0 and denominator to 1.
     */
    public Rational() {
        this(0, 1);
    }
    /** 
     * Setter to modify instance variables.
     */
    public Rational(Rational that) {
        this(that.numerator, that.denominator);
    }
    /** 
     * Setter to modify instance variables.
     */
    public Rational(int numerator, int denominator) {
        this.set(numerator, denominator);
    }
    /** 
     * Setter to modify instance variables.
     */
    public void set(Rational that) {
        this.set(that.numerator, that.denominator);
    }
    /** 
     * Setter to modify instance variables and negating the result.
     */
    public void set(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.correct();
    }
    /** 
     * Prints numerator and denominator in a String.
     */
    public void printRational() {
        System.out.println(this.numerator + "/" + this.denominator);
    }
    /** 
     * Returns numerator and denominator in a String.
     */
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
    /** 
     * Reverses the sign of a rational number.
     */
    public void negate() {
        this.numerator = -this.numerator;
    }
    /** 
     * Inverts the number by swapping numerator and denominator.
     */
    public void invert() {
        this.numerator += this.denominator;
        this.denominator = this.numerator - this.denominator;
        this.numerator = this.numerator - this.denominator;
        this.correct();
    }
    /** 
     * Converts rational number to a double. It does not modify object.
     */
    public Double toDouble() {
        return (double)this.numerator / this.denominator;
    }
    /** 
     * Reduces a rational number to its lowest terms by finding the
     * greatest common divisor (gcd) of numerator and denominator
     * and divides through. It does not modify object. 
     */
    public Rational reduce() {
        int gcd = gcd();
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }
    /** 
     * Setter to modify instance variables.
     */
    public int gcd() {
        return gcd(this.numerator, this.denominator);
    }
    /** 
     * Obtains greatest common divisor for both numbers.
     */
    private int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } 
        else {
            return gcd(n, m % n);
        }
    }
    /** 
     * Takes a Rational number as an argument, adds it to this
     * and returns a new Rational object.
     */
    public Rational add(Rational that) {
        int newNumerator = this.numerator * that.denominator + 
            that.numerator * this.denominator;
        int newDenominator = this.denominator * that.denominator;
        Rational result = new Rational(newNumerator, newDenominator).reduce();
        result.correct();
        this.set(result);
        return result;
    }
    /** 
     * Negates the denominator whether it is negative or positive number.
     */
    private void correct() {
        if (this.denominator < 0) {
            this.negate();
            this.denominator = -this.denominator;
        }
    }
}
