import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

public class SouthFacingRoverShould {
	@Test void
	head_east_when_instructed_to_turn_left() {
		MarsRover2 rover = new SouthFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(EastFacingRover.class, newRover);
	}

	@Test void
	head_west_when_instructed_to_turn_right(){
		MarsRover2 rover = new SouthFacingRover();
		var newRover = rover.execute("R");
		assertInstanceOf(WestFacingRover.class, newRover);
	}

	@Test void
	wrap_when_moving_south_from_start_of_grid(){
		MarsRover2 rover = new SouthFacingRover();
		var newRover = rover.execute("M");
		assertEquals("0:9:S", newRover.renderPosition());
	}
}
