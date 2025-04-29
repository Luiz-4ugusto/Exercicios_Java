//Escreva um programa em JAVA que solicite ao usuário um nome, armazene em
//uma variável e depois mostre o nome digitado em uma mensagem.
import javax.swing.JOptionPane;
public class Ex7 {
public static void main(String[] args) {
int numero;
numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
JOptionPane.showMessageDialog(null, "O valor da variável é : " + numero);

}
}