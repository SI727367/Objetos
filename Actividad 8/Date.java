public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1_970;
    }

    public Date(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day){
        if (day <= 31 && day > 0) {
            System.out.println("Dia invalido");
            return;
        }
        this.day = day;
    }

    public void setMonth(int month){
        if (month <= 12 && month > 0) {
            System.out.println("Mes invalido");
            return;
        }
        this.month = month;
    }

    public void setYear(int year){
        if (year <= 9999 && year > 0) {
            System.out.println("Año invalido");
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
                return this.day < 30;

            case 4:
            case 6:
            case 9:
            case 11:
                return this.day < 29;

            case 2:
                return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0 ? this.day < 30 : this.day < 29;
        }
        return false;
    }

}
