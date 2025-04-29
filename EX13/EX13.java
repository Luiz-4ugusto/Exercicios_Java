//A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
//estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
//salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
//valor da prestação e informar se o empréstimo pode ou não ser concedido.

import java.util.Scanner;
public class EX13 {
    public static void main(String[] args) {
        double Sal_bruto, Valor_prestacao, trinta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sal_bruto:");
        Sal_bruto = sc.nextDouble();
        System.out.print("Valor_prestacao:");
        Valor_prestacao = sc.nextDouble();
        trinta = Valor_prestacao *0.3;
        if (trinta>Sal_bruto) {
            System.out.println("ultrapassou de 30%");
            
        } else{
            System.out.println("não ultrapassou de 30%");

        }
        sc.close();
}
    }