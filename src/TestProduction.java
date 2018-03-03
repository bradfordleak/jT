import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestProduction {

    //String message = "Adding rehearsal to calendar";
    String message = "Rehearsal Added";
    Production myproduction = new Production("brad",350,80);

    @Test
    public void testaddRehearsal() {
        assertEquals(message,myproduction.addRehearsal());
    }
}
