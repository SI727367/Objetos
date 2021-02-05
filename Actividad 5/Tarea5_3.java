import javax.swing.*;

public class Tarea5_3 {
    public static void main(String[] args) {
        double precio, IVA;
        do {
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio"));
                if(precio<=0)
                    throw new IllegalArgumentException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Input no detectado",
                        "ERROR INPUT",JOptionPane.ERROR_MESSAGE);
                continue;
            }catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,
                        "Numero menor a 0",
                        "ERROR VALOR", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }while(true);
        IVA = precio * 0.16;
        JOptionPane.showMessageDialog(null,
                "El Precio post impuestos es: "+precio+" + "+IVA+" = "+(precio+IVA),
                "ECONOMIA",JOptionPane.INFORMATION_MESSAGE);
    }


}
