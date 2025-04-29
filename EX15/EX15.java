//Solicitar nome e idade de uma pessoa.
//Se a pessoa possuir idade entre 15 e 25 anos, imprimir o nome e a
//mensagem: “ACEITA”.
//Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”. 
import javax.swing.JOptionPane;
import java.time.LocalDate;


public class EX15 {
    public static void main(String[] args) {
    int ano_atual, Nascimento, idade;
    String nome;
    nome = JOptionPane.showInputDialog("Digite seu nome:");
    ano_atual =  LocalDate.now().getYear();

    Nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite ano nascimento:"));
    idade = ano_atual - Nascimento;

    if (idade >= 15 && idade <=25){
        System.out.println("aceito " + nome);
    } else{
        
        System.out.println("negado");

    }
  
    }
}