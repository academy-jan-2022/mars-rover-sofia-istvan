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
		var newX = boundaries.wrapOnWidth(point.x() + 1);
		return new CartesianGrid(boundaries, new Point(newX, point.y()));
	}

	public int getX() {
		return point.x();
	}

	public CartesianGrid moveLeft() {
		var newX = boundaries.wrapOnWidth(point.x() - 1);
		return new CartesianGrid(boundaries,new Point(newX, point.y()));
	}

	public CartesianGrid moveTop() {
		var newY = boundaries.wrapOnHeight(point.y() + 1);
		return new CartesianGrid(boundaries, new Point(point.x(), newY));
	}

	public int getY() {
		return point.y();
	}

	public CartesianGrid moveBottom() {
		var newY = boundaries.wrapOnHeight(point.y() - 1);
		return new CartesianGrid(boundaries, new Point(point.x(), newY));
	}
}
