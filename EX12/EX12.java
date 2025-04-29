//Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
//o número maior e mostrar na tela, ou se forem iguais, mostrar uma
//mensagem indicando esta informação.

import java.util.Scanner;
public class EX12 {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        A = sc.nextInt();
        System.out.print("Digite um número:");
        B = sc.nextInt();
        if (A>B) {
            System.out.println("A " + A + " maior que B " + B);
        } else if (A==B){
            System.out.println("iguais");

        } else{
            System.out.println("A " + A + " é menor que B " + B);

        }

        sc.close();
}
    }