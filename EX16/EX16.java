//Implemente uma calculadora,
//primeiro peça 2 números ao usuário (um de cada vez)
//e apresente as seguintes opções:
//adição
//subtração
//Mostre o resultado após a operação.

import javax.swing.JOptionPane;

public class EX16 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite num1:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite num2:")); 
        System.out.print("Bem-vindo à calculadora genérica! \n");
        System.out.print("Caso queira realizar a soma digite 1, caso queira realizar uma subtração digite 2, caso queira realizar uma multiplicação digite 3 e digite 4 para uma divisão: \n");

        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação:")); 

        if (operacao == 1) {
            int total = num1 + num2;
            System.out.println(total);

        } else if (operacao == 2) {
            int total = num1 - num2;
            System.out.println(total);
        } else if (operacao == 3) {
            int total = num1 * num2;
            System.out.println(total);
        } else if (operacao == 4) {
            if (num2 != 0) { 
                int total = num1 / num2;
                System.out.println(total);
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
            }
        }

    }
}