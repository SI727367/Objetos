import javax.swing.*;
import java.util.stream.IntStream;

public class Tarea6_4 {
    public static void main(String[] args) {
        int N_Calificaciones= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones"));
        float[] Calificaiones = new float[N_Calificaciones];
        float Media = 0;

        for (int i = 0; i < N_Calificaciones; i++) {
            Calificaiones[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
            Media += Calificaiones[i];
        }
        Media /= (float)N_Calificaciones;
        IntStream.range(0, N_Calificaciones).forEach(i -> System.out.printf("%.2f ", Calificaiones[i]));
        System.out.printf("\nLa mediana es: %.2f",Media);
        JOptionPane.showMessageDialog(null,
                "El promomedio de los alumos es "+ Media,
                   "Mediana", JOptionPane.INFORMATION_MESSAGE);


    }
}
