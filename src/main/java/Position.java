public class Position {
	Directions direction;
	int xAxis = 0;
	int yAxis = 0;

	public Position() {
		this.direction = Directions.NORTH;
	}

	void move() {
		if (direction.getDirection().equals("E")) {
			xAxis = xAxis < 9 ? xAxis + 1 : 0;
		}
		if (direction.getDirection().equals("N")) {
			yAxis = yAxis < 9 ? yAxis + 1 : 0;
		}
	}

	public String getCurrentPosition(){
		return xAxis + ":" + yAxis + ":" + direction.getDirection();
	}
}