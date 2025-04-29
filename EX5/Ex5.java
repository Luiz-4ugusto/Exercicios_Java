//Faça um programa em JAVA, declarando
//uma variável do tipo inteiro (int), atribua um
//valor qualquer a esta variável, depois
//mostre o valor desta variável em uma
//mensagem.
import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        A = sc.nextInt();
        System.out.print(A);

        sc.close();
}
    }