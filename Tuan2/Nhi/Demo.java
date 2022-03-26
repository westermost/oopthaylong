package oopthaylong.Tuan2.Nhi;

public class Demo {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction();
        fraction2.inputFraction();
        System.out.println("Output of fraction 1: " + fraction1.outputFraction()); 
        System.out.println("Output of fraction 2: " + fraction2.outputFraction()); 
        System.out.println("GCD of fraction 1: " + fraction1.findGDC());
        System.out.println("Fraction1 after being reduced: " + fraction1.reduceFraction());
        System.out.println("Fraction2 after being reduced: " + fraction2.reduceFraction());
        System.out.println(fraction1.outputFraction() + " + " + fraction2.outputFraction() + ": " + fraction1.sumFraction(fraction2));
        System.out.println(fraction1.outputFraction() + " - " + fraction2.outputFraction() + ": " + fraction1.subfraction(fraction2));
        System.out.println(fraction1.outputFraction() + " * " + fraction2.outputFraction() + ": " + fraction1.mulFraction(fraction2));
        System.out.println(fraction1.outputFraction() + " / " + fraction2.outputFraction() + ": " + fraction1.divFraction(fraction2));
    }
}
