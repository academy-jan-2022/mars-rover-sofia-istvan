public class NorthFacingRover extends MarsRover {
	public NorthFacingRover() {
		super(new CartesianGrid(), new Point());
	}

	protected NorthFacingRover(CartesianGrid grid, Point position) {
		super(grid, position);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			return new NorthFacingRover(grid, grid.moveTop(position));
		}
		if (singleCommand.equals("R")) {
			return new EastFacingRover(grid, position);
		}
		return new WestFacingRover(grid, position);
	}

	@Override
	protected String getDirection() {
		return "N";
	}
}
