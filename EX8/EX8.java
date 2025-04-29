//Escreva um programa em JAVA que solicite ao usuário um nome, armazene em
//uma variável e depois mostre o nome digitado em uma mensagem.
import javax.swing.JOptionPane;
public class EX8 {
public static void main(String[] args) {
int numero, numero2,soma;
numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número:"));
soma = numero+numero2;
JOptionPane.showMessageDialog(null, "A soma é : " + soma + "os valores foram"  +numero + " "+ numero2);

}
}