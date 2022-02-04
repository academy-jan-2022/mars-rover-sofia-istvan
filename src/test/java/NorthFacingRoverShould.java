import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

public class NorthFacingRoverShould {
	@Test void
	head_west_when_instructed_to_turn_left() {
		MarsRover2 rover = new NorthFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(WestFacingRover.class, newRover);
	}
}
