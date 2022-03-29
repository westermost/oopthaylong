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

    // TODO Không xài tới thì viết làm gì
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

    // TODO Không chạy được.
    //    java.lang.NullPointerException
    //    at oopthaylong.Tuan2.Nhi.Fraction.inputFraction(Fraction.java:46)
    //    at oopthaylong.Tuan2.Nhi.Demo.main(Demo.java:7)
    public void inputFraction() {
        try {
            System.out.println("Input numerator:");
            this.num = Integer.parseInt(System.console().readLine());
            System.out.println("Input denominator:");
            this.denom = Integer.parseInt(System.console().readLine());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public String outputFraction() {
        return this.num + "/" + this.denom;
    }

    // TODO fuction tìm Ước chung lớn nhất đâu?

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
        // TODO sau kh6ng gán giá trị khi khởi tạo luôn?
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

    // TODO quy tắc đặt tên?
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
