package oopthaylong.Tuan2.Nhi;

public class Fraction {
    private int num;
    private int denom;
    
    public Fraction() {
        this.num = 0;
        this.denom = 1;
    }
    
    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public Fraction(Fraction other) {
        this.num = other.num;
        this.denom = other.denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    public void inputFraction() {
        System.out.println("Input numerator:");
        this.num = Integer.parseInt(System.console().readLine());
        System.out.println("Input denominator:");
        this.denom = Integer.parseInt(System.console().readLine());
    }

    public String outputFraction() {
        return this.num + "/" + this.denom;
    }

    //GDC = greatest common divisor
    public int findGDC() {
        int r = 0;
        int num = this.num;
        int denom = this.denom;
        while (denom != 0) {
            r = num % denom;
            num = denom;
            denom = r;
        }
        return num;
    }

    public String reduceFraction() {
        int d;
        d = findGDC();
        this.num /= d;
        this.denom /= d;
        return this.outputFraction();
    }
    
    public String sumFraction(Fraction other) {
        Fraction result = new Fraction();
        result.num = this.num * other.denom + this.denom * other.num;
        result.denom = this.denom * other.denom;
        result.reduceFraction();
        return result.outputFraction();
    }

    public String subfraction(Fraction other) {
        Fraction result = new Fraction();
        result.num = this.num * other.denom - this.denom * other.num;
        result.denom = this.denom * other.denom;
        result.reduceFraction();
        return result.outputFraction();
    }


    public String mulFraction(Fraction other) {
        Fraction result = new Fraction();
        result.num = this.num * other.num;
        result.denom = this.denom * other.denom;
        result.reduceFraction();
        return result.outputFraction();
    }

    public String divFraction(Fraction other) {
        Fraction result = new Fraction();
        result.num = this.num * other.denom;
        result.denom = this.denom * other.num;
        result.reduceFraction();
        return result.outputFraction();
    }
}
