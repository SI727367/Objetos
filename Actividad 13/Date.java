import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Date implements Cloneable {
    Calendar cal = Calendar.getInstance();

    protected int year;
    protected int month;
    protected int day;
    protected int validsetDay_Month = 0;      // 0 para 30 //1 para 31 //2 para Febrero //3 loop Enero
    protected static int instances = 0;

    private final int DIAINIC;
    private final int MESINIC;
    private final int AÑOINIC;

    public static final int ENERO = 1;
    public static final int FEBRERO = 2;
    public static final int MARZO = 3;
    public static final int ABRIL = 4;
    public static final int MAYO = 5;
    public static final int JUNIO = 6;
    public static final int JULIO = 7;
    public static final int AGOSTO = 8;
    public static final int SEPTIEMBRE = 9;
    public static final int OCTUBRE = 10;
    public static final int NOVIEMBRE = 11;
    public static final int DICIEMBRE = 12;
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 0;

    public Date() {
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH);;
        this.day = cal.get(Calendar.DAY_OF_MONTH);;
        DIAINIC = 1;
        MESINIC = 0;
        AÑOINIC = 1_970;
        instances++;
    }

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
        DIAINIC = day;
        MESINIC = month;
        AÑOINIC = year;
    }

    public void setDay(int day) {
        if (day > 31 || day <= 0) {
            this.day = 1;
            return;
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month > 12 || month <= 0) {
            this.month = 1;
            return;
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year > 9999 || year <= 0) {
            this.year = 1_970;
            return;
        }
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public static int getInstances(){ return instances; }

    public boolean isValid() { //Doble uso para checkeo de dias en un mes
        switch (this.month) {
            case ENERO:
            case MARZO:
            case MAYO:
            case JULIO:
            case AGOSTO:
            case OCTUBRE:
            case DICIEMBRE:
                validsetDay_Month = 1; //Dias 31
                return this.day < 31;
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                validsetDay_Month = 0; //Dias 20
                return this.day < 30;
            case FEBRERO:
                validsetDay_Month = 2; //Febrero
                return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0 ? this.day < 30 : this.day < 29;
        }
        validsetDay_Month = 3; //Loop
        return false;
    }

    public static boolean isValid(int year, int month, int day){
        switch (month) {
            case ENERO:
            case MARZO:
            case MAYO:
            case JULIO:
            case AGOSTO:
            case OCTUBRE:
            case DICIEMBRE:
                return day < 31;
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                return day < 30;
            case FEBRERO:
                return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? day < 30 : day < 29;
        }
        return false;
    }

    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public String MonthtoString() {
        switch (this.month){
            case ENERO:
                return "Enero";
            case FEBRERO:
                return "Febrero";
            case MARZO:
                return "Marzo";
            case ABRIL:
                return "Abril";
            case MAYO:
                return "Mayo";
            case JUNIO:
                return "Junio";
            case JULIO:
                return "Julio";
            case AGOSTO:
                return "Agosto";
            case SEPTIEMBRE:
                return "Septiembre";
            case OCTUBRE:
                return "Octubre";
            case NOVIEMBRE:
                return "Noviembre";
            case DICIEMBRE:
                return "Diciembre";
            default:
                return "OutofRange";
        }
    }

    @Override
    public String toString() {
        return "day=" + day + ", month=" + month + ", year=" + year + ", monthname=" + MonthtoString();
    }

    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date r = (Date) o;
            return r.getDay() == this.getDay() &&
                    r.getMonth() == this.getMonth() &&
                    r.getYear() == this.getYear();
        } else
            return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Se destruye: "+ this.toString());
        super.finalize();
    }

    public void nextDay() {
        this.day += 1;
        if (!this.isValid()){
            this.setDay(1);
            this.month += 1;
            if (!this.isValid()){
                this.setMonth(1);
                this.year +=1;
            }
        }
    }

    public void prevDay() {
        if (this.getDay() == 1){
            this.month -= 1;
            this.isValid();
            switch(validsetDay_Month){
                case 0:
                    this.setDay(30);
                    break;
                case 1:
                    this.setDay(31);
                    break;
                case 2:
                    this.setDay(29);
                    if (!this.isValid()){
                        this.setDay(28);
                    }
                    break;
                case 3:
                    this.setMonth(12);
                    this.setDay(31);
                    this.setYear(getYear()-1);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + validsetDay_Month);
            }
        }
        else{this.setDay(getDay()-1);}
    }

    public static int dayOfWeek(int year, int month, int day){
        if(!isValid(year, month, day))
            return -1;

        int[] N = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month - 1 < 3)
            year -= 1;
        return (year + year/4 - year/100 + year/400 + N[month - 2] + day) % 7;
    }
}