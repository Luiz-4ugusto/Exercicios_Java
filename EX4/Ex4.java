//Faça um programa em JAVA declarando uma variável
//chamada nome, e siga os seguintes passos:
//1 - Atribua o valor João a esta variável
//2 - Mostre o valor da variável nome em uma
//mensagem
//3 - Mude o valor da variável nome para outro valor
//qualquer
//4 - Mostre o valor da variável nome em uma
//mensagem seguindo o seguinte modelo:

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.print("qual seu nome? ");
        nome = sc.nextLine();
        System.out.println(nome);
        System.out.print("qual seu nome? ");
        nome = sc.nextLine();
        System.out.println(nome);
        sc.close();


    }
}
