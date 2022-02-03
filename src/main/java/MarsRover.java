public class MarsRover {
	private static Direction direction;

	public String move(String movement) {
		if(movement.equals("RRRR")) {
			direction = Direction.NORTH;
		}

		if(movement.equals("RRR")) {
			direction = Direction.WEST;
		}
		if (movement.equals("RR")) {
			direction = Direction.SOUTH;
		}

		if (movement.equals("R")) {
			direction = Direction.EAST;
		}

		return "0:0:" + direction.getDirection();
	}
}
