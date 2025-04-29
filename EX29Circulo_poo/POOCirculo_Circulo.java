
public class POOCirculo_Circulo {
    private double Raio;

    public POOCirculo_Circulo() {
        this(0);
    }

    public POOCirculo_Circulo(double Raio) {
        this.Raio = Raio;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double Raio) {
        this.Raio = Raio;
    }

    public double getArea() {
        return (getRaio()*getRaio()*3.14);
    }
}
