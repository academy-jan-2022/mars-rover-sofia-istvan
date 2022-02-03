
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
				if(direction.getDirection().equals("E")) {
					if (xAxis < 9) {
						xAxis++;
					} else {
						xAxis = 0;
					}
				}
				else {
					if (yAxis < 9) {
						yAxis++;
					} else {
						yAxis = 0;
					}
				}
			}
		}

		return xAxis + ":" + yAxis + ":" + direction.getDirection();
	}
}
