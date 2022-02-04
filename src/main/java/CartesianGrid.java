public class CartesianGrid {
	private final GridBoundaries boundaries;
	private final Point point;

	public CartesianGrid() {
		this(new GridBoundaries(10, 10));
	}

	public CartesianGrid(GridBoundaries boundaries) {
		this(boundaries, new Point());
	}

	private CartesianGrid(GridBoundaries boundaries, Point point) {
		this.boundaries = boundaries;
		this.point = point;
	}

	public CartesianGrid moveRight() {
		var newX = point.getX() + 1;
		if (!boundaries.isWithinWidth(newX))
			newX = 0;
		return new CartesianGrid(boundaries, new Point(newX, point.getY()));
	}

	public int getX() {
		return point.getX();
	}
}
