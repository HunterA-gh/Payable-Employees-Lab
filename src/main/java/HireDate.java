import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HireDate {
    LocalDate date;


    public HireDate(){
        date = LocalDate.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = this.date.format(formattedDate);
        return date;
    }
}
