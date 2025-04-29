//Implemente um algoritmo em JAVA que escreva a seguinte mensagem na tela,
//substituindo a profissão pela informada pelo usuário:
//"Tibúrcio é <profissão>"
//Solicite ao usuário que informe a profissão do Tibúrcio, apresente as seguintes
//opções:
//(JAVA) EXERCÍCIO 17
//Se informada opção diferente das apresentadas a profissão é DESEMPREGADO.

import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A;
        System.out.println("Digite a profissão de Tibúrcio: A, E, P, M, D");
        A= sc.nextLine();

        if (A.equalsIgnoreCase("A")) {
            System.out.println("Tibúrcio é advogado");
        } else if(A.equalsIgnoreCase("E")) {
            System.out.println("Tibúrcio é engenheiro");
        }else if(A.equalsIgnoreCase("P")) {
            System.out.println("Tibúrcio é programador");
        }else if(A.equalsIgnoreCase("M")) {
            System.out.println("Tibúrcio é médico");
        }else if(A.equalsIgnoreCase("D")) {
            System.out.println("Tibúrcio é designer");
        } else{
            System.out.println("DESEMPREGADO");

        }





        sc.close();
}
    }