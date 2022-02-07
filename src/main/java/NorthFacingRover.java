public class NorthFacingRover extends MarsRover {
	public NorthFacingRover() {
		super(new CartesianGrid());
	}

	protected NorthFacingRover(CartesianGrid grid) {
		super(grid);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			return new NorthFacingRover(grid.moveTop());
		}
		if (singleCommand.equals("R")) {
			return new EastFacingRover(grid);
		}
		return new WestFacingRover(grid);
	}

	@Override
	protected String getDirection() {
		return "N";
	}
}
