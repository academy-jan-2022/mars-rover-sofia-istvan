public class Point {
	private int xAxis = 0;
	private int yAxis = 0;

	public Point() {
	}

	public Point(int xAxis, int yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public int getX() {
		return xAxis;
	}

	public int getY() {
		return yAxis;
	}

	public void setX(int xAxis) {
		this.xAxis = xAxis;
	}

	public void setY(int yAxis) {
		this.yAxis = yAxis;
	}
}