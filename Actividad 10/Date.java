public class Date implements Cloneable {
    private int year;
    private int month;
    private int day;
    private int validsetDay_Month = 0;      // 0 para 30 //1 para 31 //2 para Febrero //3 loop Enero

    private final int DIAINIC;
    private final int MESINIC;
    private final int AÑOINIC;

    private final byte ENERO = 1;
    private final byte FEBRERO = 2;
    private final byte MARZO = 3;
    private final byte ABRIL = 4;
    private final byte MAYO = 5;
    private final byte JUNIO = 6;
    private final byte JULIO = 7;
    private final byte AGOSTO = 8;
    private final byte SEPTIEMBRE = 9;
    private final byte OCTUBRE = 10;
    private final byte NOVIEMBRE = 11;
    private final byte DICIEMBRE = 12;
    private final byte LUNES = 1;
    private final byte MARTES = 2;
    private final byte MIERCOLES = 3;
    private final byte JUEVES = 4;
    private final byte VIERNES = 5;
    private final byte SABADO = 6;
    private final byte DOMINGO = 0;

    public Date() {
        this.year = 1_970;
        this.month = 1;
        this.day = 1;
        DIAINIC = 1;
        MESINIC = 1;
        AÑOINIC = 1_970;
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

    public boolean isValid() { //Doble uso para checkeo de dias en un mes
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                validsetDay_Month = 1; //Dias 31
                return this.day < 31;
            case 4:
            case 6:
            case 9:
            case 11:
                validsetDay_Month = 0; //Dias 20
                return this.day < 30;
            case 2:
                validsetDay_Month = 2; //Febrero
                return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0 ? this.day < 30 : this.day < 29;
        }
        validsetDay_Month = 3; //Loop
        return false;
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
        this.setDay(getDay()+1);
        if (!this.isValid()){
            this.setDay(1);
            this.setMonth(getMonth()+1);
            if (!this.isValid()){
                this.setMonth(1);
                this.setYear(getYear()+1);
            }
        }
    }

    public void prevDay() {
        if (this.getDay() == 1){
            this.setMonth(getMonth()-1);
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
}