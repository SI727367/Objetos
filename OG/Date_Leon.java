public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 1970;
	private final Integer diaInic;
	private final Integer mesInic;
	private final Integer año;
	
	//MESES
	private final int ENERO=1; private final int FEBRERO=2; private final int MARZO=3; private final int ABRIL=4;
	private final int MAYO=5; private final int JUNIO=6; private final int JULIO=7; private final int AGOSTO=8;
	private final int SEPTIEMBRE=9; private final int OCTUBRE=10; private final int NOVIEMBRE=11; private final int DICIEMBRE=12;
	//DIAS DE SEMANA
	private final int DOMIGO=0; private final int LUNES=1; private final int MARTES=2; private final int MIERCOLES=3;
	private final int JUEVES=4; private final int VIERNES=5; private final int SABADO=6;
	
	public Date() {	
		diaInic=null;
		mesInic=null;
		año=null;
			
	}
	public Date (int year, int month , int day ) {
		setYear(year);
		setMonth(month);
		setDay(day);
		
		if ((day != 1 || month !=1 || year!=1970) && isValid()) {
			diaInic=day;
			mesInic=month;
			año=year;}
		else {
			diaInic=null;
			mesInic=null;
			año=null;}
			
		
		
	}
	public Integer getdia() {
		return diaInic;
	}
	public Integer getmes() {
		return mesInic;
	}
	public Integer getaño() {
		return añoñoInic;
	}
	
	public void setDay(int day) {
		if (day>=1 && day<=31)
			this.day=day;	
	}
	public void setMonth(int month) {
		if (month>=1 && month<=12) 
			this.month=month;
	}
	public void setYear(int year) {
		if (year>=0 && year<=9999)
			this.year=year;
	}

	private boolean isLeap() {
		return(year%4==0 && year%100!=0 || year%400==0);
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;}
	
	
	public boolean isValid() {
		boolean valido = true;
		if (month == 4 ||month == 6 || month == 9 || month == 11 ){
			if (day >=1 && day <=30) 
				return valido;
			
			}
		else if (month == 1 ||month == 3 || month == 5 || month == 7||	month == 8 ||month == 10 || month == 12) {
			if (day >=1 && day <=31)
				return valido;
			
		}
		else if (month == 2) {
			if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) { 
				if (day >=1 && day <=29)
					return valido;}
				
			else if (day >=1 && day <=28)
				return valido;
				
			
			
	}
		return false;
}
	
	public String toString() {
		String mes = month+"";
		switch (mes) {
		case "1": mes = "Enero"; break;
		case "2": mes = "Febrero";break;
		case "3": mes = "Marzo";break;
		case "4": mes = "Abril";break;
		case "5": mes = "Mayo";break;
		case "6": mes = "Junio";break;
		case "7": mes = "Julio";break;
		case "8": mes = "Agosto";break;
		case "9": mes = "Septiembre";break;
		case "10": mes = "Octubre";break;
		case "11": mes = "Noviembre";break;
		case "12": mes = "Diciembre";break;
		}
	return("day: "+day  +", month: " +month +", year: " +year
			+", monthname:" +mes);
	}
	public boolean equals(Object o) {
		if(o instanceof Date) {
			Date d=(Date) o;
			return this.getDay()==d.getDay() &&
					this.getMonth()==d.getMonth() &&
					this.getYear()==d.getYear();			
		}
		else
			return false;
	}
	public Date clone() {
		return new Date(this.year, this.month, this.day);
	}
	public void nextDay() {
		//day++;
		// Revisar si no est�s pasando al siguiente
		// mes.
		if ((month == 1 ||month == 3 || month == 5 || month == 7||	month == 8 ||month == 10) && day == 31) {
			day = 1;
			month++;
		} else if ((month == 4 ||month == 6 || month == 9 || month == 11) && day == 30 ) {
			day = 1;
			month++;
		} else if (month == 2 && isLeap() && day == 29) {
			day = 1;
			month++;
		} else if (month == 2 && !isLeap() && day == 28) {
			day = 1;
			month++;
		// Tambi�n revisar si no est�s pasando al siguiente
		// d�a del a�o
		}else if (month == 12 && day == 31) {
			day = 1;
			month=1;
			year++;
		}else day++;
	}
	public void dayBefore() {
		//day--;
				// Revisar si no est�s pasando al siguiente
				// mes.
		if ( (month == 5 || month == 7|| month == 8 ||month == 10) && day ==1) {
			day = 30;
			month--;		
		}else if ((month == 2 ||month == 4 ||month == 6 || month == 9 || month == 11) && day == 1 ) {
			day = 31;
			month--;
		}else if (month == 3 && isLeap() && day == 1) {
			day = 29;
			month--;
		} else if (month == 3 && !isLeap() && day == 1) {
			day = 28;
			month--;}
		// Tambi�n revisar si no est�s pasando al siguiente
		// d�a del a�o
		else if (month == 1 && day == 1) {
			day=31;
			month = 12;
			year--;
		}
		else day--;
	}
	
	
	public int dow() {
		int cent=year/100;
		// 19,23 = 0
		// 20,24 = 6
		// 21,25 = 4
		// 22,26 = 2
		int base=2*(3-cent%4);
		int suma=base+year%100+(year%100)/4;
		//         6      20     5
		
		// Desplazamiento del mes
		// Enero = 0 (31%28) = 3
		// Febrero = 3 + (28%28) = 0
		// Marzo = 3 + (31%28) = 6
		// Abril = 6 + (30%28) = 8 - 7 = 1
		// Mayo = 1 + (31%28) = 4
		// Junio = 4 + (30%28) = 6
		// Julio = 6 + (31%28) = 9 - 7 = 2
		// Agosto = 2 + (31%28) = 5
		// Septiembre = 5 + (30%28) = 7-7 = 0
		// Octubre = 0 +(31%28) = 3
		// Noviembre = 3 + (30%28) = 5
		// Diciembre = 5
		if(month==5)
			suma+=1;
		else if(month==8)
			suma+=2;
		else if(month==2 || month==3 || month==11)
			suma+=3;
		else if(month==6)
			suma+=4;
		else if(month==9 || month==12)
			suma+=5;
		else if(month==4 || month==7)
			suma+=6;

		suma+=day;
		if(isLeap() && month<3)
			suma--;
		return(suma%7);
	}
}