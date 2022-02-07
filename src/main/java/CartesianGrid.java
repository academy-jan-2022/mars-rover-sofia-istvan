public class CartesianGrid {
	private final GridBoundaries boundaries;

	public CartesianGrid() {
		this(new GridBoundaries(10, 10));
	}

	public CartesianGrid(GridBoundaries boundaries) {
		this.boundaries = boundaries;
	}

	public Point moveRight(Point point) {
		return new Point(
				boundaries.wrapOnWidth(point.x() + 1),
				point.y()
		);
	}

	public Point moveLeft(Point point) {
		return new Point(
				boundaries.wrapOnWidth(point.x() - 1),
				point.y()
		);
	}

	public Point moveTop(Point point) {
		return new Point(
				point.x(),
				boundaries.wrapOnHeight(point.y() + 1)
		);
	}

	public Point moveBottom(Point point) {
		return new Point(
				point.x(),
				boundaries.wrapOnHeight(point.y() - 1)
		);
	}
}
