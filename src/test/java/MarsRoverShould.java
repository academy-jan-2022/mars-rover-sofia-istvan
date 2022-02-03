import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

	@Test void
	return_00E_when_entering_one_R(){
		var game = new MarsRover();
		var result = game.move("R");

		assertEquals("0:0:E", result);
	}
}
