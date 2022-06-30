package truong.e1000.doublylinkedlistmanagement.model;

public class Fraction {
    private int numberator;
    private int denominator;
    
    public Fraction (int numberator, int denominator) {
        this.setNumberator(numberator);
        this.setDenominator(denominator);
    }

    public int getNumberator() {
        return numberator;
    }

    public void setNumberator(int numberator) {
        this.numberator = numberator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public String toString () {
        return String.format("%d/%d", numberator, denominator);
    }
}
