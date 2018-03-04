//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import  org.junit.jupiter.*;
//import org.junit.*;
//import static org.junit.jupiter.*;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





public class TestProduction {

    //String message = "Adding rehearsal to calendar";
    String message = "Rehearsal Added";
    Production myproduction = new Production("brad",350,80);

    @Test
    public void testaddRehearsal() {
        assertEquals(message,myproduction.addRehearsal());
    }
}
