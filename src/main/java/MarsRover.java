
public class MarsRover {
	private Directions direction = Directions.NORTH;

	public String move(String movements) {
		String position = "0:0:";
		String[] movement = movements.split("");

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
