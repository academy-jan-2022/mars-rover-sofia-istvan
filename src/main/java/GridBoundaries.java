public record GridBoundaries(int width, int height) {
	public int wrapOnWidth(int x) {
		if (x < 0)
			return width - 1;
		if (x >= width)
			return 0;
		return x;
	}

	public int wrapOnHeight(int y) {
		if (y < 0)
			return height - 1;
		if (y >= height)
			return 0;
		return y;
	}
}
