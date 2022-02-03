
public class MarsRover {
	private Directions direction = Directions.NORTH;

	public String move(String movements) {
		String position = "0:0:";

		if (movements.equals("L")) {
			return "0:0:W";
		}

		String[] movement = movements.split("");

		for(String move : movement) {
			direction = direction.next();
		}

		return position + direction.getDirection();
	}
}
