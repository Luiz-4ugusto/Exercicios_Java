import java.util.Scanner;

public class EX28 {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int Coluna_i, Linha_j;
        int soma = 0;
        Scanner input = new Scanner(System.in);

        // Preenchendo a matriz
        for (Coluna_i = 0; Coluna_i < 3; Coluna_i++) {
            for (Linha_j = 0; Linha_j < 3; Linha_j++) {
                System.out.print("Digite o valor da linha " + Coluna_i + " e coluna " + Linha_j + ": ");
                A[Coluna_i][Linha_j] = input.nextInt();
            }
        }
        //====================================================================================================

        // Calcule e mostre a soma dos elementos da primeira coluna;
        for (Coluna_i = 0; Coluna_i < 3; Coluna_i++) {
            soma += A[Coluna_i][0];
        }
        System.out.println("A soma dos elementos da primeira coluna: " + A[0][0] + " " + A[1][0] + " " + A[2][0] + " é igual a " + soma);

        soma = 0;
        //====================================================================================================
        // Calcule e mostre a soma dos elementos da segunda coluna;
        for (Coluna_i = 0; Coluna_i < 3; Coluna_i++) {
            soma += A[Coluna_i][1];
        }
        System.out.println("A soma dos elementos da segunda coluna: " + A[0][1] + " " + A[1][1] + " " + A[2][1] + " é igual a " + soma);

        soma = 0;
        //====================================================================================================
        // Calcule e mostre a soma dos elementos da terceira coluna;
        for (Coluna_i = 0; Coluna_i < 3; Coluna_i++) {
            soma += A[Coluna_i][2];
        }
        System.out.println("A soma dos elementos da terceira coluna: " + A[0][2] + " " + A[1][2] + " " + A[2][2] + " é igual a " + soma);
        //====================================================================================================

        // Calcule e mostre a soma dos elementos da primeira linha;
        soma = 0;
        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            soma += A[0][Linha_j];
        }
        System.out.println("A soma dos elementos da primeira linha: " + A[0][0] + " " + A[0][1] + " " + A[0][2] + " é igual a " + soma);

        soma = 0;
        int Soma_media = 0;
        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            soma += A[0][Linha_j];
            Soma_media += A[0][Linha_j];
        }
        System.out.println("A soma dos elementos da primeira linha: " + A[0][0] + " " + A[0][1] + " " + A[0][2] + " é igual a " + soma);

        soma = 0;
        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            soma += A[1][Linha_j];
            Soma_media += A[1][Linha_j];
        }
        System.out.println("A soma dos elementos da segunda linha: " + A[1][0] + " " + A[1][1] + " " + A[1][2] + " é igual a " + soma);

        soma = 0;
        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            soma += A[2][Linha_j];
            Soma_media += A[2][Linha_j];
        }
        System.out.println("A soma dos elementos da terceira linha: " + A[2][0] + " " + A[2][1] + " " + A[2][2] + " é igual a " + soma);

        double media = Soma_media / 9.0;
        //====================================================================================================
        // Calcule e mostre a soma de todos os elementos da matriz;
        System.out.println("A soma de toda a matriz é " + Soma_media);
        //====================================================================================================

        // Calcule e mostre a média dos elementos da matriz;
        System.out.println("A média de toda a matriz é " + media);
        //====================================================================================================

        // Calcule e mostre os elementos que são maiores que a média;
        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            if (A[0][Linha_j] > 5) {
                System.out.println("Os elementos que são maiores que a média (5) são: " + A[0][Linha_j]);
            }
        }

        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            if (A[1][Linha_j] > 5) {
                System.out.println("Os elementos que são maiores que a média (5) são: " + A[1][Linha_j]);
            }
        }

        for (Linha_j = 0; Linha_j < 3; Linha_j++) {
            if (A[2][Linha_j] > 5) {
                System.out.println("Os elementos que são maiores que a média (5) são: " + A[2][Linha_j]);
            }
        }
        //====================================================================================================

        // Calcule e mostre o menor elemento da matriz e sua posição
        int menor = A[0][0];
        int linha = 0;
        int coluna = 0;
        for (Coluna_i = 0; Coluna_i < 3; Coluna_i++) {
            for (Linha_j = 0; Linha_j < 3; Linha_j++) {
                if (A[Linha_j][Coluna_i] < menor) {
                    menor = A[Linha_j][Coluna_i];
                    linha = Linha_j;
                    coluna = Coluna_i;
                }
            }
        }
        System.out.println("O menor elemento da matriz é " + menor + " na linha " + linha + " e coluna " + coluna);
        //====================================================================================================
        // Calcule e mostre o maior elemento da matriz e sua posição
        int maior = A[0][0];
        linha = 0;
        coluna = 0;
        for (Coluna_i = 0; Coluna_i < 3; Coluna_i++) {
            for (Linha_j = 0; Linha_j < 3; Linha_j++) {
                if (A[Linha_j][Coluna_i] > maior) {
                    maior = A[Linha_j][Coluna_i];
                    linha = Linha_j;
                    coluna = Coluna_i;
                }
            }
        }
        System.out.println("O maior elemento da matriz é " + maior + " na linha " + linha + " e coluna " + coluna);
        //====================================================================================================

        // Calcule e mostre a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = A[0][0] + A[1][1] + A[2][2];
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
        //====================================================================================================

        // Calcule e mostre a soma dos elementos da diagonal secundária
        int somaDiagonalSecundaria = A[0][2] + A[1][1] + A[2][0];
        System.out.println("A soma dos elementos da diagonal secundária é: " + somaDiagonalSecundaria);
    }
}
