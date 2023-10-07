import javax.swing.*;

public class FizzBuzz {
    public static void main(String[] args) {
        int nLimit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el límite de números a evaluar:"));

        for (int i = 0; i < nLimit; i++) {
            String message = "";
            if (i % 3 == 0) message += "Fizz";
            if (i % 5 == 0) message += "Buzz";
            System.out.println(i + ": " + message);
        }
    }
}