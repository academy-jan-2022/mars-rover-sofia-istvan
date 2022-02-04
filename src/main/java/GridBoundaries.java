public class GridBoundaries {
	private final int width;
	private final int height;

	public GridBoundaries(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int wrapOnWidth(int x) {
		if (x < 0)
			return width - 1;
		if (x >= width)
			return 0;
		return x;
	}

	public int wrapOnHeight(int y) {
		 if(y >= height)
			 return 0;
		 return y;

	}
}
