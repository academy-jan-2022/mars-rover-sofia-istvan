public class WestFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if (singleCommand.equals("M")) {
			if (x == 0) {
				x = 9;
			} else {
				x = x - 1;
			}
			return this;
		}

		if (singleCommand.equals("R"))
			return new NorthFacingRover();
		return new SouthFacingRover();
	}

	@Override
	protected String getDirection() {
		return "W";
	}
}
