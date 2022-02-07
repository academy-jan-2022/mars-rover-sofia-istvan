public abstract class MarsRover {
	protected final CartesianGrid grid;

	protected MarsRover(CartesianGrid grid) {
		this.grid = grid;
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
		return grid.getX() + ":" + grid.getY() + ":" + getDirection();
	}

	protected abstract String getDirection();
}
