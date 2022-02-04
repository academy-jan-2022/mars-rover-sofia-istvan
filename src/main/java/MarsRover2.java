public abstract class MarsRover2 {
	protected int x = 0;
	protected int y = 0;

	public MarsRover2 execute(String command) {
		var current = this;
		for (String singleCommand: command.split("")) {
			current = current.executeSingle(singleCommand);
		}
		return current;
	}

	protected abstract MarsRover2 executeSingle(String singleCommand);

	public String renderPosition() {
		return x + ":" + y + ":" + getDirection();
	}

	protected abstract String getDirection();

	protected int increaseIndex(int currentValue) {
		if (currentValue == 9)
			return 0;
		return currentValue + 1;
	}
}
