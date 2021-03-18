public class Actividad14 {
    public static void main(String[] args) throws CloneNotSupportedException {
        DateTime d1 = new DateTime();
        DateTime d2 = new DateTime(0,26,3);
        DateTime d3 = new DateTime(2017,12,31,23,59,59);
        DateTime d4 = (DateTime) d3.clone();
        d4.next();
        Date d5 = new Date(2017,12,31);
        DateTime d6 = (DateTime) d3.clone();
        d6.nextDay();

        System.out.println(d2.equals(d2.clone()));
        System.out.println(d3.equals(d5));
        System.out.println(d5.equals(d3));
        System.out.println(d5.equals((Date)d3));
    }
}
