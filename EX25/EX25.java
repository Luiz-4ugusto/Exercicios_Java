import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nomes[] = new int[20];
        int i;
        int soma =0;
        for (i = 0;i < 20; i++){
            System.out.print("Digite número ");
            nomes[i] = scanner.nextInt();
            soma +=nomes[i];

        }
        double resultado = (double) soma/20;
        System.out.println(resultado);
        scanner.close();

        }
}
