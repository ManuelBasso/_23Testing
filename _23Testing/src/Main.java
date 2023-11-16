import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.SequencedSet;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime date = createOffsetDateTime(dateString);

        //Formatta la data ottenendo 01 marzo 2023
        //Stampa sulla console
        System.out.println(formatDate(date));

    }

    public static OffsetDateTime createOffsetDateTime(String dateString) {
        return OffsetDateTime.parse(dateString);
    }

    public static String formatDate(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            String s = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
            return s;
        }
    }
}