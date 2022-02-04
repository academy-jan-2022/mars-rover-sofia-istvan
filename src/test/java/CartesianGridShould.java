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
	move_three_times_right_over_limits() {
		var grid = new CartesianGrid(new GridBoundaries(3, 10));
		var nextGrid = grid.moveRight().moveRight().moveRight();
		assertEquals(0, nextGrid.getX());
	}

	@Test void
	move_left_within_limits() {
		var grid = new CartesianGrid();
		var nextGrid = grid.moveRight().moveLeft();
		assertEquals(0, nextGrid.getX());
	}

	@Test void
	move_left_over_the_limits(){
		var grid = new CartesianGrid();
		var nextGrid = grid.moveLeft();
		assertEquals(9, nextGrid.getX());
	}

	@Test void
	move_three_times_left_over_limits() {
		var grid = new CartesianGrid(new GridBoundaries(3, 10));
		var nextGrid = grid.moveLeft().moveLeft().moveLeft();
		assertEquals(0, nextGrid.getX());
	}

	@Test void
	move_top_within_limits() {
		var grid = new CartesianGrid();
		var nextGrid = grid.moveTop();
		assertEquals(1, nextGrid.getY());
	}

	@Test void
	move_top_two_times_within_limits() {
		var grid = new CartesianGrid();
		var nextGrid = grid.moveTop().moveTop();
		assertEquals(2, nextGrid.getY());
	}

	@Test void
	move_top_over_limits() {
		var grid = new CartesianGrid(new GridBoundaries(10, 3));
		var nextGrid = grid.moveTop().moveTop().moveTop();
		assertEquals(0, nextGrid.getY());
	}

	@Test void
	move_bottom_within_limits() {
		var grid = new CartesianGrid();
		var nextGrid = grid.moveTop().moveBottom();
		assertEquals(0, nextGrid.getY());
	}
}
