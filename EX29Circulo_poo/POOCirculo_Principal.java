
import javax.swing.JOptionPane;

public class POOCirculo_Principal {
    public static void main(String[] args) {
        POOCirculo_Circulo cir1 = new POOCirculo_Circulo();

        cir1.setRaio(Double.parseDouble(
            JOptionPane.showInputDialog("Digite a base:")));

        JOptionPane.showMessageDialog(null, "A área é: " + cir1.getArea());
    }
}
