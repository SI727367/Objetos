import javax.swing.JOptionPane;

public class Tarea4_1 {
    public static void main(String[] args) {
        float Velocidad = Float.parseFloat(JOptionPane.showInputDialog("Velocidad promedio (km/h)"));
        float Distancia = Float.parseFloat(JOptionPane.showInputDialog("Distancia faltante (km)"));
        float TempRestante = Float.parseFloat(JOptionPane.showInputDialog("Tiempo Restante (hrs)"));

        float Tiempo = Distancia/Velocidad;

        if(TempRestante >= Tiempo){
            JOptionPane.showMessageDialog(null,
                    "Llegará a tiempo",
                    "Buenas noticias",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "No llegará a tiempo",
                    "Malas noticias",JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
