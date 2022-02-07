import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class NorthFacingRoverShould {
	@Test void
	head_west_when_instructed_to_turn_left() {
		MarsRover rover = new NorthFacingRover();
		var newRover = rover.execute("L");
		assertInstanceOf(WestFacingRover.class, newRover);
	}

	@Test void
	head_east_when_instructed_to_turn_right(){
		MarsRover rover = new NorthFacingRover();
		var newRover = rover.execute("R");
		assertInstanceOf(EastFacingRover.class, newRover);
	}

	@Test void
	still_head_north_when_instructed_to_move() {
		MarsRover rover = new NorthFacingRover();
		var newRover = rover.execute("M");
		assertInstanceOf(NorthFacingRover.class, newRover);
	}

	@Test void
	execute_several_commands() {
		MarsRover rover = new NorthFacingRover();
		var newRover = rover.execute("RL");
		assertInstanceOf(NorthFacingRover.class, newRover);
	}

	@Test void
	moves_north_when_asked_to() {
		MarsRover rover = new NorthFacingRover();
		String output = rover.execute("M").renderPosition();
		assertEquals("0:1:N", output);
	}

	@Test void
	moves_two_spaces_north_when_asked_to() {
		MarsRover rover = new NorthFacingRover();
		String output = rover.execute("MM").renderPosition();
		assertEquals("0:2:N", output);
	}

	@Test void
	wrap_around(){
		MarsRover rover = new NorthFacingRover();
		String output = rover.execute("MMMMMMMMMM").renderPosition();
		assertEquals("0:0:N", output);
	}

}
