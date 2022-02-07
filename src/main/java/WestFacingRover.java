public class WestFacingRover extends MarsRover {

	public WestFacingRover() {
		super(new CartesianGrid(), new Point());
	}

	protected WestFacingRover(CartesianGrid grid, Point position) {
		super(grid, position);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			return new WestFacingRover(grid, grid.moveLeft(position));
		}

		if (singleCommand.equals("R"))
			return new NorthFacingRover(grid, position);
		return new SouthFacingRover(grid, position);
	}

	@Override
	protected String getDirection() {
		return "W";
	}
}
