public class EastFacingRover extends MarsRover {
	public EastFacingRover() {
		super(0, 0);
	}

	protected EastFacingRover(int x, int y) {
		super(x, y);
	}

	@Override
	protected MarsRover executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			x = increaseIndex(x);
			return this;
		}

		if(singleCommand.equals("R")){
			return new SouthFacingRover(x, y);
		}

		return new NorthFacingRover(x, y);
	}

	@Override
	protected String getDirection() {
		return "E";
	}
}
