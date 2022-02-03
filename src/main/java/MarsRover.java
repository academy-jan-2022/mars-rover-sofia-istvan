
public class MarsRover {
	private Directions direction = Directions.NORTH;
	private int xAxis = 0;
	private int yAxis = 0;

	public String move(String movements) {
		String[] movement = movements.split("");

		for(String move : movement) {
			if(move.equals("R")) {
				direction = direction.rotateRight();
			}
			if(move.equals("L")) {
				direction = direction.rotateLeft();
			}
			if(move.equals("M")) {
				yAxis++;
			}
		}

		return xAxis + ":" + yAxis + ":" + direction.getDirection();
	}
}
