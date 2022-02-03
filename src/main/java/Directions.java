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

	public Directions next() {
		Directions[] directions = values();
		int currentIndex = this.ordinal();

		return directions[(currentIndex + 1) % directions.length];
	}

}
