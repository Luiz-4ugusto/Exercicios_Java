//Escreva um algoritmo para mostrar os valores de 1 até 10 usando for.


import java.util.Scanner;
public class EX20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        i=0 ;
        int valor =0;
        for (i = 0;i < 10; i++){
            valor +=1;
            System.out.println(valor);
        }



        sc.close();
}
    }