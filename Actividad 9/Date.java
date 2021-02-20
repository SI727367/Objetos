public class Date implements Cloneable {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 1_970;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
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

    public boolean isValid() {
        switch (this.month) {
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

    public String MonthtoString() {
        switch (this.month){
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
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
}
