//Faça um programa em JAVA que solicite 1 número inteiro, verificar
//se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que
//negativa:

import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        A = sc.nextInt();
        if (A%2==0) {
            System.out.println("Divisivel por 2");
        } else{
            System.out.println("não Divisivel por 2");

        }

        sc.close();
}
    }