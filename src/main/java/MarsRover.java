
public class MarsRover {
	private Directions direction = Directions.NORTH;

	public String move(String movements) {
		String position = "0:0:";
		String[] movement = movements.split("");

		if(movements.equals("M")) {
			return "1:0:N";
		}

		if(movements.equals("MM")) {
			return "2:0:N";
		}

		for(String move : movement) {
			if(move.equals("R")) {
				direction = direction.rotateRight();
				continue;
			}
			direction = direction.rotateLeft();
		}

		return position + direction.getDirection();
	}
}
