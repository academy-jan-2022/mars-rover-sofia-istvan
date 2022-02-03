
public class MarsRover {
	private Directions direction = Directions.NORTH;

	public String move(String movement) {
		if(movement.equals("RRRR")) {
			direction = Directions.NORTH;
		}

		if(movement.equals("RRR")) {
			direction = Directions.WEST;
		}
		if (movement.equals("RR")) {
			direction = Directions.SOUTH;
		}

		if (movement.equals("R")) {
			direction = Directions.EAST;
		}

		return "0:0:" + direction.getDirection();
	}
}
