//Calcule a média aritmética de 3 valores
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        double A,B,C,Media;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        A = sc.nextDouble();
        System.out.print("Digite um número:");
        B = sc.nextDouble();
        System.out.print("Digite um número:");
        C = sc.nextDouble();
        Media = A+B+C;
        Media = Media / 3;
        System.out.print(Media);
        sc.close();
}
    }