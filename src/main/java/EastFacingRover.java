public class EastFacingRover extends MarsRover {
	public EastFacingRover() {
		super(new CartesianGrid());
	}

	protected EastFacingRover(CartesianGrid grid) {
		super(grid);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			return new EastFacingRover(grid.moveRight());
		}

		if(singleCommand.equals("R")){
			return new SouthFacingRover(grid);
		}

		return new NorthFacingRover(grid);
	}

	@Override
	protected String getDirection() {
		return "E";
	}
}
