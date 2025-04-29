import java.util.Scanner;

public class EX26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[20];
        int i =0;
        for (i = 0;i < 20; i++){
            System.out.print("Digite número ");
            numeros[i] = scanner.nextInt();
        }
        for (i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem crescente:");
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        scanner.close();

        }
}
