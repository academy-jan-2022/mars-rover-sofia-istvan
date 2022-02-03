public class Position {
	Directions direction;
	int xAxis = 0;
	int yAxis = 0;

	public Position() {
		this.direction = Directions.NORTH;
	}

	void move() {
		if (direction.getDirection().equals("E")) {
			if (xAxis < 9) {
				xAxis++;
			} else {
				xAxis = 0;
			}
		} else {
			if (yAxis < 9) {
				yAxis++;
			} else {
				yAxis = 0;
			}
		}
	}

	public String getCurrentPosition(){
		return xAxis + ":" + yAxis + ":" + direction.getDirection();
	}
}