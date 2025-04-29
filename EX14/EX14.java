//Solicitar o ano de nascimento de uma pessoa e o ano atual. Verifique
//se o ano de nascimento é válido, ou seja, se o ano de nascimento é
//menor que o ano atual, então mostre a idade desta pessoa.

import javax.swing.JOptionPane;
import java.time.LocalDate;


public class EX14 {
    public static void main(String[] args) {
    int ano_atual, Nascimento, idade;
    ano_atual =  LocalDate.now().getYear();

    Nascimento = Integer.parseInt(JOptionPane.showInputDialog("digite seu ano de nascimento"));
    idade = ano_atual - Nascimento;

    if (Nascimento > ano_atual){
        System.out.println("Erro");
    } else{
        
        System.out.println(idade);

    }
  
    }
}