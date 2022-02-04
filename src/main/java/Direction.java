public enum Direction {
	NORTH("N"),
	EAST("E"),
	SOUTH("S"),
	WEST("W");

	private final String direction;

	Direction(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}

	public Direction rotateRight() {
		Direction[] directions = values();
		int currentIndex = this.ordinal();
		int nextIndex = (currentIndex + 1) % directions.length;

		return directions[nextIndex];
	}

	public Direction rotateLeft() {
		Direction[] directions = values();
		int currentIndex = this.ordinal();
		int previousIndex = ((currentIndex - 1) + directions.length) % directions.length;

		return directions[previousIndex];
	}

}
