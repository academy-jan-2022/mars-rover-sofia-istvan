public class NorthFacingRover extends MarsRover2 {
	public NorthFacingRover() {
		super(0, 0);
	}

	protected NorthFacingRover(int x, int y) {
		super(x, y);
	}

	@Override
	protected MarsRover2 execute(String singleCommand) {
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
