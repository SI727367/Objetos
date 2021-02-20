import javax.swing.*;

public class Tarea9_1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date d1 = new Date();   // d1 será un objeto que tendrá la fecha 1/01/1970
        Date d2 = new Date(2020, 9, 10); // d2 será un objeto que tendrá la fecha 10/09/2020
        Date d3 = new Date(2020, 13, 25); // d3 será un objeto que tendrá la fecha 25/01/2020 ya que al poner un número de mes inválido, dejará el mes 1 que es el que se le asigna por omisión.
        Date d4 = new Date(2021, 2, 29); // d4 será un objeto que tendrá la fecha 29/02/2020.
        if(!d4.isValid())
            System.out.println("La fecha es inválida"); // En este caso si se deberá de mostrar este
        // mensaje ya que el 29 de Febrero es válida en un año bisiesto y el año 2021 no lo es.

        System.out.println(d2.toString());
        System.out.println(d4.isValid());

        Date d5 = (Date) d4.clone();
        System.out.println(d5.toString());

        if(d5.equals(d4)){
            System.out.println("Iguales");
        }

        d3 = new Date(1980, 5, 30);
        System.gc();
        JOptionPane.showInputDialog("Pausa");

        d3 = null;
        System.gc();
        


    }
}

