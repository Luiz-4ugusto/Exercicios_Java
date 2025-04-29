import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica cor1 = new FiguraGeometrica();
        Triangulo tri1 = new Triangulo();
        Circulo cir1 = new Circulo();

        cir1.leitura();
        cir1.imprimir();  
        JOptionPane.showMessageDialog(null, "Área do circulo: " + cir1.getArea());
        JOptionPane.showMessageDialog(null, cir1.paraString());

        tri1.leitura();
        tri1.imprimir();  
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + tri1.getArea());
        
        JOptionPane.showMessageDialog(null, tri1.paraString());

             
               
    }
}
