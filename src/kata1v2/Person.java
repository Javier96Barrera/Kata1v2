package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final Calendar birthdate;
    private final String name;
    private static final long MILLISECONDS_PER_YEAR = (long)(1000*60*60*24*365.25);
    
    public Calendar getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public Person(Calendar birthdate, String name) {
        this.birthdate = birthdate;
        this.name = name;
    }
    
    public int getAge(){
        Calendar today;
        today = GregorianCalendar.getInstance();
        
        return (int)(milliSecondsToYear(today.getTimeInMillis()-birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear (long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
}
