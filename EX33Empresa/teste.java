import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        Restaurante teste1 = new Restaurante();
        teste1.leitura();
        teste1.imprimir();
        JOptionPane.showMessageDialog(null, teste1.paraString());

    }
}
