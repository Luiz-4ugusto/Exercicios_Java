//Escreva um algoritmo que mostre todos os números pares entre 13 e 23
//usando do..while.

public class EX24 {
    public static void main(String[] args) {
        int i=13;

        while (i<=23) {
            if (i %2==0){
                System.out.println(i);
            } else {
                System.out.println(i + "não par");
            }
            i++;
        }


}

    }