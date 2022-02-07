public abstract class MarsRover {
	protected final CartesianGrid grid;
	protected final Point position;

	protected MarsRover(CartesianGrid grid, Point position) {
		this.grid = grid;
		this.position = position;
	}

	public MarsRover execute(String command) {
		var current = this;
		for (String singleCommand: command.split("")) {
			current = current.executeSingle(singleCommand);
		}
		return current;
	}

	protected abstract MarsRover executeSingle(String singleCommand);

	public String renderPosition() {
		return position.x() + ":" + position.y() + ":" + getDirection();
	}

	protected abstract String getDirection();
}
