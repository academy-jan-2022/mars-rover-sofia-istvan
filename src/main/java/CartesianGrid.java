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
		return new CartesianGrid(boundaries, new Point(point.getX() + 1, point.getY()));
	}

	public int getX() {
		return point.getX();
	}
}
