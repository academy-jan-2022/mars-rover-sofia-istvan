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
		var newX = boundaries.wrapOnWidth(point.getX() + 1);
		return new CartesianGrid(boundaries, new Point(newX, point.getY()));
	}

	public int getX() {
		return point.getX();
	}

	public CartesianGrid moveLeft() {
		var newX = boundaries.wrapOnWidth(point.getX() - 1);
		return new CartesianGrid(boundaries,new Point(newX, point.getY()));
	}

	public CartesianGrid moveTop() {
		return new CartesianGrid(boundaries, new Point(point.getX(), point.getY() + 1));
	}

	public int getY() {
		return point.getY();
	}
}
