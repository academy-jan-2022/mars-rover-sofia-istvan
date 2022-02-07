public class WestFacingRover extends MarsRover {

	public WestFacingRover() {
		super(0, 0);
	}

	protected WestFacingRover(int x, int y) {
		super(x, y);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			x = decreaseIndex(x);
			return this;
		}

		if (singleCommand.equals("R"))
			return new NorthFacingRover(x, y);
		return new SouthFacingRover(x, y);
	}

	@Override
	protected String getDirection() {
		return "W";
	}
}
