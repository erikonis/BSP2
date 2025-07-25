import java.util.Date;

public record Log(Date date, String message) {
    
    public Log(String message) {
       this(new Date(), message);
    }
}
