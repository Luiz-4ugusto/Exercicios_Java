//, projete um algoritmo para determinar se uma pessoa pode votar ou não.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.print("qual sua idade? ");
        idade = sc.nextInt();
        if (idade >=18) {
            System.out.print("pode votar");
            
        } else {
            System.out.print("idade insuficiente");
        }
        sc.close();


    }
}
