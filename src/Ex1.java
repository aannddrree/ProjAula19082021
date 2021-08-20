import javax.swing.*;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String nome;
        int idade;
        double salario;

        nome = JOptionPane.showInputDialog(null,"Qual é o seu nome?");

        System.out.println("Qtd. de caracteres: " + nome.length());

    }
}
