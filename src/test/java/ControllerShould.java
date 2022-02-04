import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerShould {
    @Test
    void
    return_east_facing_position(){
       var controller = new Controller(new CartesianGrid());
       var result = controller.execute("R");

       assertEquals("0:0:E", result);
    }

    @Test
    void
    return_south_facing_position(){
        var controller = new Controller(new CartesianGrid());
        var result = controller.execute("RRRL");

        assertEquals("0:0:S", result);
    }
}
