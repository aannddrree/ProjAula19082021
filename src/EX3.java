import javax.swing.*;

public class EX3 {
    public static void main(String[] args) {

        // Ax^2 + Bx + C = 0 => OK
        // D = B^2 - (4 * A * C) => OK
        // x1 = -B + SQRT(D)/2*A
        // x2 = -B - SQRT(D)/2*A

        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "A")
            .replace(",", ".")
        );
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "B")
                .replace(",", ".")
        );
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "C")
                .replace(",", ".")
        );

        double d = Math.pow(b,2) - (4*a*c);
        double x1 = (-b + Math.sqrt(d))/(2*a);
        double x2 = (-b - Math.sqrt(d))/(2*a);
        String msg = "";

        if (a == 0){
            msg = "Essa não é uma equação do 2 grau";
        } else if (d == 0){
            msg = "Existe um única raiz real ";
        }else {
            msg = "A: " + a + "B: " + b + "C: " + c + "\nValor de D: " + d + "\nValor de X1: " + x1 + "\nValor de X2: " + x2;
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}
