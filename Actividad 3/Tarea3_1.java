import javax.swing.JOptionPane;

public class Tarea3_1 {
    public static void main(String[] args) {
        float n1,n2;
        n1=Float.parseFloat(JOptionPane.showInputDialog(
                "Dame el primer numero en decimal, puede contener fraccionario"));
        n2=Float.parseFloat(JOptionPane.showInputDialog(
                "Dame el psegundo numero en decimal, puede contener fraccionario"));
        JOptionPane.showMessageDialog(null,String.format(
                "La suma es %f\nLa resta es %f\nLa multiplicación es %f\nLa división es %f\n",
                (n1+n2),(n1-n2),(n1*n2),(n1/n2)),
                "Resultado",JOptionPane.INFORMATION_MESSAGE);

        System.out.printf("La suma es %f\n", (n1+n2));
        System.out.printf("La resta es %f\n", (n1-n2));
        System.out.printf("La multiplicación es es %f\n",(n1*n2));
        System.out.printf("La división es %f\n",(n1/n2));
    }
}

