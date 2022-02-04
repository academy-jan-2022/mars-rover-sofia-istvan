public class GridBoundaries {
	private final int width;
	private final int height;

	public GridBoundaries(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean isWithinWidth(int newX) {
		return newX > 0 && newX < width;
	}
}
