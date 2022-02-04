import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

public class EastFacingRoverShould {
	@Test void
	head_north_when_instructed_to_turn_left() {
		MarsRover2 rover = new EastFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(NorthFacingRover.class, newRover);
	}

	@Test void
	head_south_when_instructed_to_turn_right() {
		MarsRover2 rover = new EastFacingRover();
		var newRover = rover.execute("R");
		assertInstanceOf(SouthFacingRover.class, newRover);
	}

}
