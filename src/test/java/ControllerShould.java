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

    @Test
    void
    wrap_to_initial_position(){
        var boundaries = new GridBoundaries(2, 2);
        var controller = new Controller(new CartesianGrid(boundaries));
        var result = controller.execute("MM");

        assertEquals("0:0:N", result);
    }
}
