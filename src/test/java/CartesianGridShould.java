import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartesianGridShould {
	private CartesianGrid defaultGrid;

	@BeforeEach
	void beforeEach() {
		defaultGrid = new CartesianGrid();
	}

	@Test void
	move_right_within_limits() {
		var result = defaultGrid.moveRight(new Point());
		assertEquals(new Point(1, 0), result);
	}

	@Test void
	move_over_the_limits() {
		var grid = new CartesianGrid(new GridBoundaries(2, 2));
		var result = grid.moveRight(new Point(1,0));
		assertEquals(new Point(), result);
	}

	@Test void
	move_left_within_limits() {
		var result = defaultGrid.moveLeft(new Point(5, 5));
		assertEquals(new Point(4, 5), result);
	}

	@Test void
	move_left_over_limits() {
		var grid = new CartesianGrid(new GridBoundaries(6, 7));
		var result = grid.moveLeft(new Point(0, 5));
		assertEquals(new Point(5, 5), result);
	}

	@Test void
	move_top_within_limits() {
		var result = defaultGrid.moveTop(new Point());
		assertEquals(new Point(0, 1), result);
	}

	@Test void
	move_top_over_limits() {
		var result = defaultGrid.moveTop(new Point(0, 9));
		assertEquals(new Point(), result);
	}

	@Test void
	move_bottom_within_limits() {
		var nextGrid = defaultGrid.moveTop().moveBottom();
		assertEquals(0, nextGrid.getY());
	}

	@Test void
	move_bottom_over_limits() {
		var nextGrid = defaultGrid.moveBottom();
		assertEquals(9, nextGrid.getY());
	}

}
