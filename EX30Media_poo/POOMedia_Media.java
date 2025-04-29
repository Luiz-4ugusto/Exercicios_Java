
public class POOMedia_Media {
    private double N1;
    private double N2;
    private double N3;

    public POOMedia_Media() {
        this(0, 0, 0);
    }

    public POOMedia_Media(double N1, double N2, double N3) {
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;


    }

    public double getN1() {
        return N1;
    }

    public void setN1(double N1) {
        this.N1 = N1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double N2) {
        this.N2 = N2;
    }

    public double getN3() {
        return N3;
    }

    public void setN3(double N3) {
        this.N3 = N3;
    }

    public double getArea() {
        return ((getN1()+getN2()+getN3())/3);
    }
}
