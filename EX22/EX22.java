
//Escreva um algoritmo para calcular e mostrar a média aritmética dos números
//inteiros entre 1 e 1000 usando while.
public class EX22 {
    public static void main(String[] args) {
        int i;
        i=1;
        int soma =0;
        int divisor =0;
        while (i<1001) {
            soma +=i;
            divisor +=1;
            i++;
        }
        double resultado= (double) soma/divisor;
        System.out.println(resultado);
}
    }