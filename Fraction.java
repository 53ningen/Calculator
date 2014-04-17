/**
 * Created by yuki_yanagi on 2014/04/17.
 */

/**
 * This class expresses fraction
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * getter and setter of numerator
     * @return numerator
     */
    public int numerator(){ return numerator; }
    public int numerator(int numerator){
        this.numerator = numerator;
        return numerator;
    }

    /**
     * getter and setter of denominator
     * @return
     */
    public int denominator(){ return denominator; }
    public int denominator(int denominator){
        this.denominator = denominator;
        return denominator;
    }

    /**
     * Constructor of this class
     * @param numerator
     * @param denominator
     */
    Fraction(int numerator, int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("denominator must be non-zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduction();
    }

    /**
     * toString method of this class
     * @return string expresses instance
     */
    @Override public String toString(){
        return String.format("%d/%d", numerator, denominator);
    }
    @Override public boolean equals(Object obj){
        return this.toString().equals(((Fraction)obj).toString());
    }

    //##############################################################
    //##############################################################
    //##############################################################

    /**
     * operation(+): addition between fractions
     * @param b
     * @return result of addition
     */
    public Fraction addition(Fraction b){
        int numerator = (this.numerator * b.denominator) + (b.numerator * this.denominator);
        int denominator = this.denominator * b.denominator;
        return new Fraction(numerator, denominator);
    }

    /**
     * operation(*): multiplication between fractions
     * @param b
     * @return result of multiplication
     */
    public Fraction multiplication(Fraction b){
        int numerator = this.numerator * b.numerator;
        int denominator = this.denominator * b.denominator;
        return new Fraction(numerator, denominator);
    }

    /**
     * operation(/): division between fractions
     * @param b
     * @return result of division
     */
    public Fraction division(Fraction b){
        if(b.numerator == 0)
            throw new IllegalArgumentException();

        return multiplication(this, new Fraction(b.denominator, b.numerator));
    }

    /**
     * operation(-): subtraction between fractions
     * @param b
     * @return result of subtraction
     */
    public Fraction subtraction(Fraction b){
        return addition(this, new Fraction(- b.numerator, b.denominator));
    }

    //##############################################################
    //#　start static operation methods
    //##############################################################

    /**
     * operation(+): addition between fractions
     * @param a
     * @param b
     * @return result of addition
     */
    public static Fraction addition(Fraction a, Fraction b){
        int numerator = (a.numerator * b.denominator) + (b.numerator * a.denominator);
        int denominator = a.denominator * b.denominator;
        return new Fraction(numerator, denominator);
    }

    /**
     * operation(*): multiplication between fractions
     * @param a
     * @param b
     * @return result of multiplication
     */
    public Fraction multiplication(Fraction a, Fraction b){
        int numerator = a.numerator * b.numerator;
        int denominator = a.denominator * b.denominator;
        return new Fraction(numerator, denominator);
    }

    /**
     * operation(/): division between fractions
     * @param a
     * @param b
     * @return result of division
     */
    public Fraction division(Fraction a, Fraction b){
        if(b.numerator == 0)
            throw new IllegalArgumentException();

        return multiplication(a, new Fraction(b.denominator, b.numerator));
    }

    /**
     * operation(-): subtraction between fractions
     * @param a
     * @param b
     * @return result of subtraction
     */
    public Fraction subtraction(Fraction a, Fraction b){
        return addition(a, new Fraction(- b.numerator, b.denominator));
    }

    //##############################################################
    //# end static operation methods
    //##############################################################

    /**
     * return decimal value of fraction
     * @return decimal value
     */
    public double getDecimal(){
        return (double)numerator / (double)denominator;
    }

    /**
     * reduction. cancellation.
     */
    private void reduction(){
        int gcd = getGCD(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    /**
     * get greatest common divisor by Eucledean algorithm
     * @param a
     * @param b
     * @return G.C.D
     */
    private int getGCD(int a, int b){
        if(b==0)
            return a;
        else
            return getGCD(b, a % b);
    }
}