import java.io.PrintStream;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){
        this.year = 1_970;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year,int month,int day ){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setDay(int day){
        if (day > 31 || day <= 0) {
            this.day = 1;
            return;
        }
        this.day = day;
    }

    public void setMonth(int month){
        if (month > 12 || month <= 0) {
            this.month = 1;
            return;
        }
        this.month = month;
    }

    public void setYear(int year){
        if (year > 9999 || year <= 0) {
            this.year = 1_970;
            return;
        }
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    public boolean isValid(){
        switch (this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return this.day < 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return this.day < 30;

            case 2:
                return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0 ? this.day < 30 : this.day < 29;
        }
        return false;
    }



    @Override
    public String toString() {
        String month_s = null;
        switch (this.month) {

            case 1:
                month_s = "Enero";
                break;
            case 2:
                month_s = "Febrero";
                break;
            case 3:
                month_s = "Marzo";
                break;
            case 4:
                month_s = "Abril";
                break;
            case 5:
                month_s = "Mayo";
                break;
            case 6:
                month_s = "Junio";
                break;
            case 7:
                month_s = "Julio";
                break;
            case 8:
                month_s = "Agosto";
                break;
            case 9:
                month_s = "Septiembre";
                break;
            case 10:
                month_s = "Octubre";
                break;
            case 11:
                month_s = "Noviembre";
                break;
            case 12:
                month_s = "Diciembre";
                break;
        }
        return "" + this.day + " de " + month_s + " del " + this.year;
    }
}
