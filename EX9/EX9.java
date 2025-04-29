//Escreva um programa em JAVA que solicite ao usuário o seu
//peso(aqui entenda massa) em Kg (int) e a sua altura em metros
//(Double). Com estes dados calcule o IMC – Índice de Massa
//Corporal. Seguindo a seguinte fórmula.
//IMC = massa / (altura * altura )
//Mostre o resultado em uma mensagem. 
import javax.swing.JOptionPane;
public class EX9 {
public static void main(String[] args) {
int peso;
double alt, IMC;
peso = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
alt = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro número:"));
IMC = peso / (alt*alt);
JOptionPane.showMessageDialog(null, "o IMC é : " + IMC + "o peso foi"  + peso + "a altura foi "+ alt);

}
}