public class NorthFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			if (y == 9) {
				y = 0;
			} else {
				y++;
			}
			return this;
		}
		if (singleCommand.equals("R")) {
			return new EastFacingRover();
		}
		return new WestFacingRover();
	}

	@Override
	protected String getDirection() {
		return "N";
	}
}
