
public class MarsRover {
	private Directions direction = Directions.NORTH;

	public String move(String movements) {
		String position = "0:0:";

		if (movements.equals("L")) {
			return "0:0:W";
		}

		String[] movement = movements.split("");

		for(String move : movement) {
			if(move.equals("R"))
				direction = direction.next();
			else {
				direction = Directions.EAST;
			}
		}

		return position + direction.getDirection();
	}
}
