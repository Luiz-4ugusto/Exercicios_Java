import javax.swing.*;
public class Restaurante extends Empresa {
    private String comida;
    private int preco;
    public Restaurante(){
        super("", "", "", 0, 0);
        this.comida = "";
        this.preco =0;

    }
    
    public Restaurante(String nome, String cidade, String estado, String comida, int preco) {
        super(nome, cidade, estado, 0, 0);
        this.comida = comida;
        this.preco = preco;
    }
    public String getcomida() {
        return comida;
    }
    public void setcomida(String comida) {
        this.comida = comida;
    }
    public int getpreco() {
        return preco;
    }
    public void setpreco(int preco) {
        this.preco = preco;
    }
    public void leitura() {
        super.leitura();
        setcomida(JOptionPane.showInputDialog("Digite a comida"));
        setpreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o preco do produto")));
    }
    public void imprimir() {
        super.imprimir();
            JOptionPane.showMessageDialog(null,"A comida é " + getcomida());
            JOptionPane.showMessageDialog(null,"O preco é " + getpreco());
        }
    public String paraString(){
        return (super.paraString() + " / a comida é " + getcomida() + " /o preço é" + preco );
    } 
}