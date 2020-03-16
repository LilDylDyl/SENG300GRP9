import java.util.Date;

public class Appointment{
    private Date date;
    private Account doctor;
    private Account patient;
    
    

    public Date getDate(){
        Date dateCopy = new Date(1900 + date.getYear(), date.getMonth() + 1, date.getDay(), date.getTime());

        return dateCopy;
    }

    public static void main(String[] args){

    }
}