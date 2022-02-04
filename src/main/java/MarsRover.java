
public class MarsRover {
	private final Position position;

	public MarsRover() {
		position = new Position();
	}

	public String getPosition(String movements) {
		String[] movement = movements.split("");

		for(String move : movement) {
			if(move.equals("R")) {
				position.direction = position.direction.rotateRight();
			}
			if(move.equals("L")) {
				position.direction = position.direction.rotateLeft();
			}
			if(move.equals("M")) {
				position.move();
			}
		}

		return position.getCurrentPosition();
	}

}
