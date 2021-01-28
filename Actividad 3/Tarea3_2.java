import javax.swing.JOptionPane;

public class Tarea3_2 {
    public static void main(String[] args) {
        String Nombres = JOptionPane.showInputDialog("Escribe tu Nombre(s)");
        String ApellidoP = JOptionPane.showInputDialog("Escribe tu Apellido Paterno");
        String ApellidoM = JOptionPane.showInputDialog("Escribe tu Apeliido Materno");
        JOptionPane.showMessageDialog(null,String.format(
                "Tu nombre completo es %s %s %s",
                Nombres,ApellidoP,ApellidoM),
                "Nombre",JOptionPane.INFORMATION_MESSAGE);
        System.out.printf(
                "Tu nombre completo es %s %s %s",
                Nombres,ApellidoP,ApellidoM);
    }
}
