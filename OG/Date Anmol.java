public class Date{
    //Atributos
    private int day=1, month=1, year=1970;

    //Constructores
    public Date(){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public Date(int year, int month, int day){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    //Setters
    public void setDay(int day){
        if(day >= 1 && day <= 31) this.day = day;
    }

    public void setMonth(int month){
        if(month >= 1 && month <= 12) this.month = month;
    }

    public void setYear(int year){
        if(day >= 0 && day <= 9999) this.year = year;
    }

    //Getters
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public String getMonthName(){
        String mes = "";
        switch(month){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
        }
        return mes;
    }

    //Métodos Adicionales
    public boolean isValid(){
        if(month == 4 || month == 6 || month == 9 || month == 11 ){
            if(day > 30) return false;
        }
        else if(month == 2){
            if(day <=28) return true;
            if(day == 29 && (year%4 == 0 && year%100 != 0) || year%400 == 0){
                return true;
            }else return false;
        }return true;
    }

    public String toString(){
        return "Day:" + getDay() + " Month:" + getMonth() + " Year:" + getYear() + " Monthname:" + getMonthName();
    }

    public boolean equals(Object o){
        if(o instanceof Date){
            Date d = (Date)o;
            return this.getDay() == d.getDay() && this.getMonth() == d.getMonth() && this.getYear() == d.getYear();
        }else return false;
    }

    public Date clone(){
        return new Date(this.year, this.month, this.day);
    }
}