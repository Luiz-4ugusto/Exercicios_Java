import javax.swing.JOptionPane;

public class POOMedia_Principal {
    public static void main(String[] args) {
        POOMedia_Media MEd1 = new POOMedia_Media();

        MEd1.setN1(Double.parseDouble(
            JOptionPane.showInputDialog("Digite n1:")));
        MEd1.setN2(Double.parseDouble(
            JOptionPane.showInputDialog("Digite n2:")));
        MEd1.setN3(Double.parseDouble(
            JOptionPane.showInputDialog("Digite n3:")));
    
        JOptionPane.showMessageDialog(null, "A MEdia de 3 digitos é: " + MEd1.getArea());
    }
}
