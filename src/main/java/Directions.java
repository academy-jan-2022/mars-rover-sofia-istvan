public enum Directions {
	NORTH("N"),
	EAST("E"),
	SOUTH("S"),
	WEST("W");

	private final String direction;

	Directions(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}

	public Directions rotateRight() {
		Directions[] directions = values();
		int currentIndex = this.ordinal();

		return directions[(currentIndex + 1) % directions.length];
	}

	public Directions rotateLeft() {
		Directions[] directions = values();
		int currentIndex = this.ordinal();
		int previousIndex = ((currentIndex - 1) + directions.length) % directions.length;
		return directions[previousIndex];
	}

}
