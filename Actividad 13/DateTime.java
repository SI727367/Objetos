import java.util.Calendar;
import java.util.Objects;

public class DateTime extends Date {

    private int hours;
    private int minutes;
    private int seconds;

    public DateTime() {
        setYear(cal.get(Calendar.YEAR));
        setMonth(cal.get(Calendar.MONTH));
        setDay(cal.get(Calendar.DAY_OF_MONTH));
        setHours(cal.get(Calendar.HOUR_OF_DAY));
        setMinutes(cal.get(Calendar.MINUTE));
        setSeconds(cal.get(Calendar.SECOND));
    }

    public DateTime(int year, int month, int day, int hours, int minutes, int seconds) {
        super(year, month, day);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public DateTime(int hours, int minutes, int seconds) {
        setYear(cal.get(Calendar.YEAR));
        setMonth(cal.get(Calendar.MONTH));
        setDay(cal.get(Calendar.DAY_OF_MONTH));
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public DateTime(Date d){
        setYear(d.getYear());
        setMonth(d.getMonth());
        setDay(d.getDay());
        setHours(cal.get(Calendar.HOUR_OF_DAY));
        setMinutes(cal.get(Calendar.MINUTE));
        setSeconds(cal.get(Calendar.SECOND));
    }

    public void setHours(int hours) {
        if (hours > 24 || hours <= -1) {
            this.hours = 0;
            return;
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60 || minutes <= -1) {
            this.minutes = 0;
            return;
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60 || seconds <= -1) {
            this.seconds = 0;
            return;
        }
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public void next(){
        if (this.getSeconds() == 59){
            this.setSeconds(0);
            if (this.getMinutes() == 59){
                this.setMinutes(0);
                if (this.getHours() == 23){
                    this.setHours(0);
                    this.nextDay();
                }
                else{this.setHours(getHours()+1);}
            }
            else {this.setMinutes(getMinutes()+1);}
        }
        else{this.setSeconds(getSeconds()+1);}
    }

    public static Date toDate(DateTime o) { return new Date(o.getYear(),o.getMonth(),o.getDay()); }

    @Override
    public String toString() {
        return "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds;
    }

    public boolean equals(Object o) {
        if (o instanceof DateTime) {
            DateTime r = (DateTime) o;
            return r.getDay() == this.getDay() &&
                    r.getMonth() == this.getMonth() &&
                    r.getYear() == this.getYear() &&
                    r.getHours() == this.getHours() &&
                    r.getMinutes() == this.getMinutes() &&
                    r.getSeconds() == this.getSeconds();
        } else
            return false;
    }
}
