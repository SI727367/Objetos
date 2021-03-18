public class TestDateTime{
    public static void main(String[] args) {
        DateTime d1 = new DateTime();
        DateTime d1c = new DateTime();
        DateTime d2 = new DateTime(2021,12,31,23,59,59);
        DateTime d2a = new DateTime(2020,2,28,23,59,59);
        Date d3 = new Date(1456,6,12);
        DateTime d4 = new DateTime(d3);
        DateTime d5 = new DateTime(23,15,42);

        System.out.println("Fecha actual: " + d1);
        System.out.println("Fecha input: " + d2);
        System.out.println("Date normal: " + d3);
        System.out.println("Recibinedo Date: " + d4);
        System.out.println("Recibiendo Time: " + d5);

        System.out.println("\nTest Año Nuevo" + d2);
        d2.next();
        System.out.println("Año despues: " + d2);

        System.out.println("\nTest Febrero: " + d2a);
        d2a.next();
        System.out.println("Año despues: " + d2a);

        System.out.println("\n" + d1.equals(d1c));
        System.out.println(d1.equals(d2));

        d3 = DateTime.toDate(d2);
        System.out.println("\nIncovando a toDate " + d3);
    }

}
