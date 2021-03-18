import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = new GregorianCalendar(2020, Calendar.SEPTEMBER, 23);

        System.out.println(d1.get(Calendar.DAY_OF_MONTH) + "-" + d1.get(Calendar.MONTH) + "-" + d1.get(Calendar.YEAR));
        System.out.println(d2.get(Calendar.DAY_OF_MONTH) + "-" + d2.get(Calendar.MONTH) + "-" + d2.get(Calendar.YEAR));

        System.out.println(d1.before(d2) ? d1.get(Calendar.DAY_OF_MONTH) + "-" + d1.get(Calendar.MONTH) + "-" + d1.get(Calendar.YEAR) + " es la mas antigua" : d2.get(Calendar.DAY_OF_MONTH) + "-" + d2.get(Calendar.MONTH) + "-" + d2.get(Calendar.YEAR) + " es la mas antigua");

        d1.add(Calendar.WEEK_OF_MONTH, 2);
        d1.add(Calendar.YEAR, -4);

        System.out.println(d1.get(Calendar.DAY_OF_MONTH) + "-" + d1.get(Calendar.MONTH) + "-" + d1.get(Calendar.YEAR));
        Calendar dt1 = new GregorianCalendar(d2.get(Calendar.YEAR), d2.get(Calendar.MONTH), d2.get(Calendar.DAY_OF_MONTH), d1.get(Calendar.HOUR_OF_DAY), d1.get(Calendar.MINUTE), d1.get(Calendar.SECOND));

        System.out.println(dt1.get(Calendar.YEAR) + "-" + dt1.get(Calendar.MONTH) + "-" + dt1.get(Calendar.DAY_OF_MONTH) + "\t" +
                dt1.get(Calendar.HOUR_OF_DAY) + ":" + dt1.get(Calendar.MINUTE) + ":" + dt1.get(Calendar.SECOND));
    }
}
