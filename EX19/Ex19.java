//Solicite ao usuário que escreva uma frase e o número de vezes que a mesma
//deve ser mostrada. Implemente o algoritmo usando for.

import java.util.Scanner;

public class Ex19 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase;
    System.out.print("digite uma frase: ");
    frase = sc.nextLine();
    System.out.print("digite um num: ");
    int num = sc.nextInt();
    int i = 0;
    for (i = 0;i < num; i++){
        System.out.print(frase);
    }       
    sc.close();

    }
}
