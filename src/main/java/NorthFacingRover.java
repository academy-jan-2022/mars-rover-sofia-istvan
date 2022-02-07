public class NorthFacingRover extends MarsRover {
	public NorthFacingRover() {
		super(0, 0);
	}

	protected NorthFacingRover(int x, int y) {
		super(x, y);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			y = increaseIndex(y);
			return this;
		}
		if (singleCommand.equals("R")) {
			return new EastFacingRover(x, y);
		}
		return new WestFacingRover(x, y);
	}

	@Override
	protected String getDirection() {
		return "N";
	}
}
