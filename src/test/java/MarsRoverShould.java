import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

	@ParameterizedTest
	@CsvSource({"R, 0:0:E",
			  "RR, 0:0:S",
			  "RRR, 0:0:W",
			  "RRRR, 0:0:N"})
	void turn_right(String command, String expected) {
		var game = new MarsRover();
		var result = game.move(command);

		assertEquals(expected, result);
	}

	@ParameterizedTest
	@CsvSource({"L, 0:0:W",
			  "LL, 0:0:S",
			  "LLL, 0:0:E",
			  "LLLL, 0:0:N"})
	void turn_left(String command, String expected) {
		var game = new MarsRover();
		var result = game.move(command);

		assertEquals(expected, result);
	}

	@Test void
	turn_multiple_directions(){
		var game = new MarsRover();
		var result = game.move("LLRRR");

		assertEquals("0:0:E", result);
	}

	@Test void
	move_one_step_north_from_starting_position(){
		var game = new MarsRover();
		var result = game.move("M");

		assertEquals("1:0:N", result);
	}


}
