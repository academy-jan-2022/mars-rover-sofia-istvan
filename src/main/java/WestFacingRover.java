public class WestFacingRover extends MarsRover2 {

	public WestFacingRover() {
		super(0, 0);
	}

	protected WestFacingRover(int x, int y) {
		super(x, y);
	}

	@Override
	protected MarsRover2 execute(String singleCommand) {
		if (singleCommand.equals("R"))
			return new NorthFacingRover(x, y);
		return new SouthFacingRover(x, y);
	}

	@Override
	protected String getDirection() {
		return "W";
	}
}
