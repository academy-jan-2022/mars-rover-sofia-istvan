public class SouthFacingRover extends MarsRover {

	public SouthFacingRover() {
		super(new CartesianGrid());
	}

	protected SouthFacingRover(CartesianGrid grid) {
		super(grid);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			return new SouthFacingRover(grid.moveBottom());
		}

		if (singleCommand.equals("R")) {
			return new WestFacingRover(grid);
		}
		return new EastFacingRover(grid);
	}

	@Override
	protected String getDirection() {
		return "S";
	}
}
