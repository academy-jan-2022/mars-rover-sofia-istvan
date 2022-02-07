public class EastFacingRover extends MarsRover {
	public EastFacingRover() {
		super(new CartesianGrid(), new Point());
	}

	protected EastFacingRover(CartesianGrid grid, Point point) {
		super(grid, point);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			return new EastFacingRover(grid, grid.moveRight(position));
		}

		if(singleCommand.equals("R")){
			return new SouthFacingRover(grid, position);
		}

		return new NorthFacingRover(grid, position);
	}

	@Override
	protected String getDirection() {
		return "E";
	}
}
