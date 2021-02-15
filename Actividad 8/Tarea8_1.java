public class Tarea8_1 {
    public static void main(String[] args) {
        Date d1 = new Date();   // d1 será un objeto que tendrá la fecha 1/01/1970
        Date d2 = new Date(2020, 9, 10); // d2 será un objeto que tendrá la fecha 10/09/2020
        Date d3 = new Date(2020, 13, 25); // d3 será un objeto que tendrá la fecha 25/01/2020 ya que al poner un número de mes inválido, dejará el mes 1 que es el que se le asigna por omisión.
        Date d4 = new Date(2021, 2, 29); // d4 será un objeto que tendrá la fecha 29/02/2020.
        if(!d4.isValid())
            System.out.println("La fecha es inválida"); // En este caso si se deberá de mostrar este
        // mensaje ya que el 29 de Febrero es válida en un año bisiesto y el año 2021 no lo es.
    }
}

