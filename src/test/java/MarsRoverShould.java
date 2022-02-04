import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

	private CartesianGrid grid;
	private Controller controller;

	@BeforeEach
	void setUp() {
		grid = new CartesianGrid();
		rover = new NorthFacingRover();
		controller = new Controller(grid);
	}

	@ParameterizedTest
	@CsvSource({"R, 0:0:E",
			  "RR, 0:0:S",
			  "RRR, 0:0:W",
			  "RRRR, 0:0:N"})
	void turn_right(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}


	@ParameterizedTest
	@CsvSource({"L, 0:0:W",
			  "LL, 0:0:S",
			  "LLL, 0:0:E",
			  "LLLL, 0:0:N"})
	void turn_left(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}

	@Test void
	turn_multiple_directions(){
		var result = controller.execute("LLRRR");

		assertEquals("0:0:E", result);
	}

	@ParameterizedTest
	@CsvSource({"M, 0:1:N",
			"MM, 0:2:N",
			"MMM, 0:3:N",
			"MMMMMMMMMM, 0:0:N"})
	void move_north(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}

	@ParameterizedTest
	@CsvSource({"RM, 1:0:E",
			"RMMMMMMMMMM, 0:0:E",})
	void turn_right_and_move_east(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}

	@ParameterizedTest
	@CsvSource({"LM, 9:0:W",
			"LMMMMMMMMMM, 0:0:W",})
	void turn_left_and_move_west(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}

	@ParameterizedTest
	@CsvSource({"LLM, 0:9:S",
			  "LLMMMMMMMMMM, 0:0:S"})
	void turn_left_twice__and_move_south(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}

	@ParameterizedTest
	@CsvSource({"MMRMMLM, 2:3:N",
			  "MMMMMMMMMM, 0:0:N"})
	void final_test_to_satisfy_business_requirements(String command, String expected) {
		var result = controller.execute(command);

		assertEquals(expected, result);
	}

}
