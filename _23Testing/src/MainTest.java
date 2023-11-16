import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

class MainTest {
    private final Main testing = new Main();

    @Test
    void formatDate_withIso() {
        String result = testing.formatDate(OffsetDateTime.parse("2023-04-01T13:00:00Z"));
        assertEquals("01 aprile 2023", result);
    }

    @Test
    void formatDate_Null() {
        String result = testing.formatDate(null);
        assertNull(null, result);
    }
}