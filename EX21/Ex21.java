//Escreva um algoritmo que mostre todos os números pares entre 33 e 57 usando for


import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 33;i < 57; i++){
            if (i%2==0){
                System.out.println(i);
            } else{
                System.out.println(i + " não é par");
}

        }
        sc.close();
}
    }
    //Escreva um algoritmo para mostrar os valores de 1 até 10 usando for.



