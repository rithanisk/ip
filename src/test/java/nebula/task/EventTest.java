package nebula.task;  //same package as the class being tested

import nebula.exception.NebulaException;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EventTest {
    @Test
    public void createEvent_success() {
        assertEquals(new Event("birthday party", "2024-09-12 12:30", "2024-09-12 04:30").toString(),
                "[E] [ ] birthday party (from: September 12, 2024 12:30 to: September 12, 2024 04:30)");

        assertEquals(new Event("math lecture", "2024-10-12", "2024-10-12").toString(),
                "[E] [ ] math lecture (from: October 12, 2024 00:00 to: October 12, 2024 00:00)");
    }
}
