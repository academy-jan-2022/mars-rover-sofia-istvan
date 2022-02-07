public class WestFacingRover extends MarsRover {

	public WestFacingRover() {
		super(new CartesianGrid());
	}

	protected WestFacingRover(CartesianGrid grid) {
		super(grid);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			return new WestFacingRover(grid.moveLeft());
		}

		if (singleCommand.equals("R"))
			return new NorthFacingRover(grid);
		return new SouthFacingRover(grid);
	}

	@Override
	protected String getDirection() {
		return "W";
	}
}
