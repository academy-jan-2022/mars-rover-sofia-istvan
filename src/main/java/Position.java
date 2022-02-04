public class Position {
	final Point point = new Point();
	Direction direction;

	public Position() {
		this.direction = Direction.NORTH;
	}

	void move() {
		if (direction.getDirection().equals("E")) {
			point.setX(point.getX() < 9 ? point.getX() + 1 : 0);
		}
		if (direction.getDirection().equals("W")) {
			point.setX(point.getX() == 0 ? 9 : point.getX() - 1);
		}
		if (direction.getDirection().equals("N")) {
			point.setY(point.getY() < 9 ? point.getY() + 1 : 0);
		}
		if (direction.getDirection().equals("S")) {
			point.setY(point.getY() == 0 ? 9 : point.getY() - 1);
		}
	}

	public String getCurrentPosition(){
		return point.getX() + ":" + point.getY() + ":" + direction.getDirection();
	}
}