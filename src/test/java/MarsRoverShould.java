import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

	@Test void
	return_00E_when_turning_right_once(){
		var game = new MarsRover();
		var result = game.move("R");

		assertEquals("0:0:E", result);
	}

	@Test void
	return_00S_when_turning_right_twice(){
		var game = new MarsRover();
		var result = game.move("RR");

		assertEquals("0:0:S", result);
	}

	@Test void
	return_00W_when_turning_right_three_times(){
		var game = new MarsRover();
		var result = game.move("RRR");

		assertEquals("0:0:W", result);
	}

	@Test void
	return_00N_when_turning_right_four_times(){
		var game = new MarsRover();
		var result = game.move("RRRR");

		assertEquals("0:0:N", result);
	}


}
