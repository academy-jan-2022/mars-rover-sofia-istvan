public enum Directions {
	NORTH("N"),
	EAST("E"),
	SOUTH("S"),
	WEST("W");

	private final String direction;

	Directions(String direction) {
		this.direction = direction;
	}

	public String getDirection(){
		return direction;
	}


}
