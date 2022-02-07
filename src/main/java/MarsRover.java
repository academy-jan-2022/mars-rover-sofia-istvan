public abstract class MarsRover {
	protected int x;
	protected int y;

	protected MarsRover(int x, int y) {
		this.x = x;
		this.y = y;
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
		return x + ":" + y + ":" + getDirection();
	}

	protected abstract String getDirection();

	protected int increaseIndex(int currentValue) {
		if (currentValue == 9)
			return 0;
		return currentValue + 1;
	}

	protected int decreaseIndex(int currentValue) {
		if (currentValue == 0)
			return 9;
		return currentValue - 1;
	}
}
