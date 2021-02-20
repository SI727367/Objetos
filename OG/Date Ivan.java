public class Date {
	public String stmonth;
	boolean flag=false;
	private int year=1970;
	private int month=1;
	private int day=1;
	public Date(){
		setDay(day);
		setMonth(month);
		setYear(year);

	}
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public void setDay(int day) {
		if(day>0 && day<=31) {
			this.day=day;
			isValid();
		}else
			day=1;
	}

	public void setMonth(int month) {
		if(month>0 && month<=12) {
			this.month=month;
		}else
			month=1;
	}

	public void setYear(int year) {
		if(year>0 && year<=9999) {
			this.year=year;
		}else
			year=1970;
	}
	public void isValid() {
		if((month==1 || month==3 ||  month==5 ||  month==7 ||  month==8 ||  month==10 ||  month==12) && day<=31) {
			flag=true;
		}
		if(( month==4 || month==6 ||  month==9 || month==11) && day<=30) {
			flag=true;
		}
		if( month==2 &&  day<=28) {
			flag=true;
		}
		else {
			if (day==29 &&(year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {

				flag=true;
			} 
		}
		if (flag==false){
			System.out.println("La fecha es invalida");
		}
	}

	public String toString() {
		switch (month)
		{
		case 1: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Enero ";
			break;
		case 2: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Febrero ";

			break;
		case 3: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Marzo ";
			break;
		case 4: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Abril ";		
			break;
		case 5: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Mayo ";
			break;
		case 6: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Junio ";
			break;
		case 7: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Julio ";
			break;
		case 8: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Agosto ";
			break;
		case 9: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Septiembre";
			break;
		case 10: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Octubre";
			break;
		case 11: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Novimebre ";
			break;
		case 12: 
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Diciembre ";
			break;
		default:
			stmonth="Day: "+day+" Month: "+ month +" year: "+year+" month name: Enero ";
			break;
		}
		return stmonth;


	}
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
//Actividad 9
	public boolean equals(Object obj){
		if(obj instanceof Date){
			Date de_q = (Date)obj;
			return this.getDay() == de_q.getDay() && 
			this.getMonth() ==  de_q.getMonth() && this.getYear() ==  de_q.getYear();
		}else 
			return false;
	}

	public Date clone(){
		return new Date(this.day, this.month, this.year);
	}

}





