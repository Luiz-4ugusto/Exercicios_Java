//Faça um programa em JAVA que solicite 2 números inteiros e efetue
//a adição; caso o resultado seja maior que 10, apresentá-lo:
import java.util.Scanner;
public class EX10 {
    public static void main(String[] args) {
        int A, B, soma;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        A = sc.nextInt();
        System.out.print("Digite outro número:");
        B = sc.nextInt();
        soma= A + B;
        if (soma >10) {
            System.out.println("Maior que 10, resultado: " + soma);
        } else{
            System.out.println("Menor que 10, resultado: " + soma);

        }

        sc.close();
}
    }