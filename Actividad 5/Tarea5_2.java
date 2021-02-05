import javax.swing.*;

public class Tarea5_2 {
    public static void main(String[] args) {
        int iteraciones = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las iteraciones"));
        double pi = 0;
        double denominador = 1;

        for (int x = 0; x < iteraciones; x++) {

            if (x % 2 == 0) {
                pi += (1 / denominador);
            } else {
                pi -= (1 / denominador);
            }
            denominador += 2;
        }
        pi *= 4;
        JOptionPane.showMessageDialog(null,
                "El valor de pi con "+iteraciones+" iteraciones es\nπ =" + pi,
                "Pie de queso",JOptionPane.INFORMATION_MESSAGE);
    }
}
