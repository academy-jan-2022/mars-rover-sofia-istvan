import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

public class WestFacingRoverShould {
	@Test void
	head_south_when_instructed_to_turn_left() {
		MarsRover rover = new WestFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(SouthFacingRover.class, newRover);
	}

	@Test void
	head_north_when_instructed_to_turn_right(){
		MarsRover rover = new WestFacingRover();
		var newRover = rover.execute("R");
		assertInstanceOf(NorthFacingRover.class, newRover);
	}

	@Test void
	wrap_around(){
		MarsRover rover = new WestFacingRover();
		var result = rover.execute("M").renderPosition();
		assertEquals("9:0:W", result);
	}

	@Test void
	keeps_coordinates_all_along() {
		MarsRover rover = new WestFacingRover();
		var result = rover.execute("MLR").renderPosition();
		assertEquals("9:0:W", result);
	}
}
