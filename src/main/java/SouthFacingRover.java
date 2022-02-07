public class SouthFacingRover extends MarsRover {

	public SouthFacingRover() {
		super(new CartesianGrid(), new Point());
	}

	protected SouthFacingRover(CartesianGrid grid, Point position) {
		super(grid, position);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			return new SouthFacingRover(grid, grid.moveBottom(position));
		}

		if (singleCommand.equals("R")) {
			return new WestFacingRover(grid, position);
		}
		return new EastFacingRover(grid, position);
	}

	@Override
	protected String getDirection() {
		return "S";
	}
}
