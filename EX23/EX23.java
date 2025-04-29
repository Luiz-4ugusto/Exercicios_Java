
//Escreva um algoritmo para calcular e mostrar a média aritmética dos números
//inteiros entre 1 e 1000 usando while.
import java.util.Scanner;

public class EX23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("qual o primeiro num");
        int A = sc.nextInt();
        System.out.print("qual o primeiro num");
        int B = sc.nextInt();
        int soma =0;

        while (A<=B) {
            soma +=A;

            A++;
        }
        System.out.print(soma);

        sc.close();

}

    }