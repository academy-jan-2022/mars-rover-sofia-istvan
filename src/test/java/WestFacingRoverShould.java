import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

public class WestFacingRoverShould {
	@Test void
	head_south_when_instructed_to_turn_left() {
		MarsRover2 rover = new WestFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(SouthFacingRover.class, newRover);
	}

	@Test void
	head_north_when_instructed_to_turn_right(){
		MarsRover2 rover = new WestFacingRover();
		var newRover = rover.execute("R");
		assertInstanceOf(NorthFacingRover.class, newRover);
	}
}
