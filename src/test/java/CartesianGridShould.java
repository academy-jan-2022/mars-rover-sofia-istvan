import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CartesianGridShould {
	@Test void
	move_right_within_limits() {
		var grid = new CartesianGrid();
		var nextGrid = grid.moveRight();
		assertEquals(1, nextGrid.getX());
	}

	@Test void
	move_two_times_right_within_limits() {
		var grid = new CartesianGrid();
		var nextGrid = grid.moveRight().moveRight();
		assertEquals(2, nextGrid.getX());
	}

	@Test void
	move_three_times_over_limits() {
		var grid = new CartesianGrid(new GridBoundaries(3, 10));
		var nextGrid = grid.moveRight().moveRight().moveRight();
		assertEquals(0, nextGrid.getX());
	}
}
