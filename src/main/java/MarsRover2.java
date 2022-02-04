public abstract class MarsRover2 {
	protected int x;
	protected int y;

	protected MarsRover2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected abstract MarsRover2 execute(String singleCommand);

	protected abstract String getDirection();

}
