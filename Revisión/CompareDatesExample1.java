import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CompareDatesExample1
{
    public static void main(String[] args) throws ParseException
    {
//object of SimpleDateFormat class
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//dates to be compare
        Date date1 = sdf.parse("2020-07-20");
        Date date2 = sdf.parse("2020-06-18");
//prints dates
        System.out.println("Date 1: " + sdf.format(date1));
        System.out.println("Date 2: " + sdf.format(date2));
//comparing dates
        if(date1.compareTo(date2) > 0)
        {
            System.out.println("Date 1 comes after Date 2");
        }
        else if(date1.compareTo(date2) < 0)
        {
            System.out.println("Date 1 comes before Date 2");
        }
        else if(date1.compareTo(date2) == 0)
        {
            System.out.println("Both dates are equal");
        }
    }
}