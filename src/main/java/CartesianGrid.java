public class CartesianGrid {
	private final GridBoundaries boundaries;
	private final Point roverPosition;

	public CartesianGrid() {
		this(new GridBoundaries(10, 10));
	}

	public CartesianGrid(GridBoundaries boundaries) {
		this(boundaries, new Point());
	}

	private CartesianGrid(GridBoundaries boundaries, Point roverPosition) {
		this.boundaries = boundaries;
		this.roverPosition = roverPosition;
	}

	public CartesianGrid moveRight() {
		var newX = boundaries.wrapOnWidth(roverPosition.x() + 1);
		return new CartesianGrid(boundaries, new Point(newX, roverPosition.y()));
	}

	public int getX() {
		return roverPosition.x();
	}

	public CartesianGrid moveLeft() {
		var newX = boundaries.wrapOnWidth(roverPosition.x() - 1);
		return new CartesianGrid(boundaries,new Point(newX, roverPosition.y()));
	}

	public CartesianGrid moveTop() {
		var newY = boundaries.wrapOnHeight(roverPosition.y() + 1);
		return new CartesianGrid(boundaries, new Point(roverPosition.x(), newY));
	}

	public int getY() {
		return roverPosition.y();
	}

	public CartesianGrid moveBottom() {
		var newY = boundaries.wrapOnHeight(roverPosition.y() - 1);
		return new CartesianGrid(boundaries, new Point(roverPosition.x(), newY));
	}

	public Point moveRight(Point point) {
		return new Point(
				boundaries.wrapOnWidth(point.x() + 1),
				point.y()
		);
	}
}
