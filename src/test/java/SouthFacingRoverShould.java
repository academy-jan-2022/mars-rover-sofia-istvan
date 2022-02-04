import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

public class SouthFacingRoverShould {
	@Test void
	head_east_when_instructed_to_turn_left() {
		MarsRover2 rover = new SouthFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(EastFacingRover.class, newRover);
	}
}
