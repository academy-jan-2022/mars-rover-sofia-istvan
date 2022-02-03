public enum Direction {
	NORTH("N"),
	EAST("E"),
	SOUTH("S"),
	WEST("W");

	private final String direction;

	Direction(String direction) {
		this.direction = direction;
	}

	public String getDirection(){
		return direction;
	}


}
