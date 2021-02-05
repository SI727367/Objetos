import javax.swing.*;

public class Tarea5_1 {
    public static void main(String[] args) {
        String password = "MalexesPana";
        String Input_U = "";
        int k = 0;
        do {
            Input_U = JOptionPane.showInputDialog("Ingresa la contraseña");
            if (Input_U == null)
                break;
            if (!Input_U.equals(""))
                k++;
        } while (!Input_U.equals(password));
        JOptionPane.showMessageDialog(null,
                "Contrase;a quebrada en " + k + " intentos",
                "Acceso Conseguido", JOptionPane.INFORMATION_MESSAGE);
    }
}