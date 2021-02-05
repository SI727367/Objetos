import javax.swing.*;
import java.util.Locale;

public class Tarea4_2 {
    public static void main(String[] args) {

        String Meses = JOptionPane.showInputDialog("Ingresa el mes").toLowerCase(Locale.ROOT);
        int Año = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año"));

        switch (Meses) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                JOptionPane.showMessageDialog(null,
                        "El mes tiene 31 dias",
                        "Meses", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                JOptionPane.showMessageDialog(null,
                        "El mes tiene 30 dias",
                        "Meses", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "febrero":
                if ((Año % 4 == 0 && Año % 100 != 0) || Año % 400 == 0) {
                    JOptionPane.showMessageDialog(null,
                            "El mes tiene 29 dias",
                            "Biciesto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "El mes tiene 28 dias",
                            "No Biciesto", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "No es un mes correcto",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }


    }
}
