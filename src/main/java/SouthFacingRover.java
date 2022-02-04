public class SouthFacingRover extends MarsRover2 {

	public SouthFacingRover() {
		super(0, 0);
	}

	protected SouthFacingRover(int x, int y) {
		super(x, y);
	}

	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			y = decreaseIndex(y);
			return this;
		}

		if (singleCommand.equals("R")) {
			return new WestFacingRover(x, y);
		}
		return new EastFacingRover(x, y);
	}

	@Override
	protected String getDirection() {
		return "S";
	}
}
