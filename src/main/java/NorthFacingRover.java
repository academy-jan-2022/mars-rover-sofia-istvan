public class NorthFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			y = getNextIndex(y);
			return this;
		}
		if (singleCommand.equals("R")) {
			return new EastFacingRover();
		}
		return new WestFacingRover();
	}

	private int getNextIndex(int currentValue) {
		if (currentValue == 9)
			return 0;
		return currentValue + 1;
	}

	@Override
	protected String getDirection() {
		return "N";
	}
}
