public abstract class MarsRover2 {
	public MarsRover2 execute(String command) {
		var current = this;
		for (String singleCommand: command.split("")) {
			current = current.executeSingle(singleCommand);
		}
		return current;
	}

	protected abstract MarsRover2 executeSingle(String singleCommand);
}
