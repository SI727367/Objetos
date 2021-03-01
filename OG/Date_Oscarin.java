public class Date {
    private int day;
    private int month;
    private int year;


    private final int DIAINIC;
    private final int MESINIC;
    private final int AÑOINIC;

    //Constantes para los meses
    private final int ENERO = 1;
    private final int FEBRERO = 2;
    private final int MARZO = 3;
    private final int ABRIL = 4;
    private final int MAYO = 5;
    private final int JUNIO = 6;
    private final int JULIO = 7;
    private final int AGOSTO = 8;
    private final int SEPTIEMBRE= 9;
    private final int OCTUBRE = 10;
    private final int NOVIEMBRE = 11;
    private final int DICIEMBRE = 12;

    //Constantes para los dias
    private final int DOMINGO = 0;
    private final int LUNES = 1;
    private final int MARTES = 2;
    private final int MIERCOLES = 3;
    private final int JUEVES = 4;
    private final int VIERNES = 5;
    private final int SABADO = 6;


    public Date(){
        setDay(1);
        setMonth(1);
        setYear(1970);

        DIAINIC = 1;
        MESINIC = 1;
        AÑOINIC = 1970;

    }
    public Date(int year, int month, int day){
        setDay(day);
        setMonth(month);
        setYear(year);

        DIAINIC = this.day;
        MESINIC = this.month;
        AÑOINIC = this.year;
    }
    public void setDay(int day){
        if(day >=1 && day<=31)
            this.day = day;
        else
            this.day = 1;
    }
    public void setMonth(int month){
        if(month >=1 && month<=12)
            this.month = month;
        else
            this.month = 1;
    }
    public void setYear(int year){
        if(year >=0 && year<=9999)
            this.year = year;
        else
            this.year = 1970;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public boolean isValid(){
        if(this.day <1) return false; //Eto pah que jale, es bastante obvio
        switch(this.getMonth()){
            case (4):
            case (6):
            case (9):
            case (11):
                if(day <= 30){
                    return true;
                }
                break;
            case(2):
                if (this.getYear() % 4 == 0 && this.getYear() % 100 != 0 && this.getDay() <=29){
                    return true;
                } else if (this.getYear() % 400 == 0 && this.getDay() <=29){
                    return true;
                } else if(this.getDay() <=28){    //Wey es <= tenias 28, el 28 tiene sentimientos sabes?
                    return true;
                }
                break;
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                if(day <= 31){
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }
    public String toString(){
        String mes = "";
        switch (month){
            case(1):
                mes = "Enero";
                break;
            case(2):
                mes = "Febrero";
                break;
            case(3):
                mes = "Marzo";
                break;
            case(4):
                mes = "Abril";
                break;
            case(5):
                mes = "Mayo";
                break;
            case(6):
                mes = "Junio";
                break;
            case(7):
                mes = "Julio";
                break;
            case(8):
                mes = "Agosto";
                break;
            case(9):
                mes = "Septiembre";
                break;
            case(10):
                mes = "Octubre";
                break;
            case(11):
                mes = "Noviembre";
                break;
            case(12):
                mes = "Diciembre";
                break;
            default:
                break;
        }
        if (!isValid())
            return("Error de fecha");
        return ( "day: " + this.getDay() + ", month: " + month + ", year: " + this.getYear() + ", monthname: " + mes);
    }
    public boolean equals(Object o){
        if(o instanceof Date) {
            Date r=(Date) o;
            return r.getDay()==this.getDay() && r.getMonth()==this.getMonth() && r.getYear() == this.getYear();
        }
        else
            return false;
    }
    public Date clone() {
        return new Date(this.day,this.month,this.year);
    }
    public void nextDay(){
        this.day++; //Si te va valer verga los getters y setters que te valgan vergq bien
        if(!isValid()){
            this.day = 1;
            this.month +=1;
            if(!isValid()){
                this.month = 1;
                this.year +=1;
            }
        }
    }

    public void dayBefore(){
        this.day--; //Si te va valer verga los getters y setters que te valgan vergq bien Parte 2
        if(!isValid()){
            this.day = 31;
            this.month -=1;
            if(this.month == 0){
                this.month = 12; //Looooooooooooooooooooooooooooooooooooooooop a Diciembre, te falto esta linea
                this.year -=1;
                return;
            }
            while(!isValid()){
                this.day -=1;
            }
        }
    }

}

