import javax.swing.*;

public class Ex2 {

    public static void main(String[] args) {

        // IMC
        // Peso / Altura * Altura

        //  < 18,5 - Abaixo do peso
        //  > 18,5 < 24,9 - Peso ideal
        //  > 25 < 29,9 - excesso de peso
        //  > 30 < 34,9 - obesidade classe 1
        //  > 35 < 39,9 - obesidade classe 2
        //  > 40 - obesidade classe 3

        //Recebimento dos valores:

        //System.out.println(String.format("%.2f", 30.545454));

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: ")
                .replace(",",".")
        );

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: ")
                .replace(",",".")
        );

        double imc = peso / Math.pow(altura,2);
        String msg = "";

        if (imc <= 18.5){
            msg = "Abaixo do peso";
        }else if (imc > 18.5 && imc <= 24.9 ){
            msg = "Peso Ideal";
        }else if (imc >= 25 && imc <= 29.9){
            msg = "Excesso de peso";
        }else if (imc >= 30 && imc <= 34.9){
            msg = "Obesidade classe 1";
        }else if (imc >=35 && imc <= 39.9){
            msg = "Obesidade classe 2";
        }else if (imc >= 40){
            msg = "Obesidade classe 3";
        }

        msg = msg + " (" + String.format("%.2f", imc) + ")";

        JOptionPane.showMessageDialog(null, msg);
    }
}
