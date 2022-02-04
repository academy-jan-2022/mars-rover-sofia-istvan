public class EastFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			x = 1;
			return this;
		}

		if(singleCommand.equals("R")){
			return new SouthFacingRover();
		}

		return new NorthFacingRover();
	}

	@Override
	protected String getDirection() {
		return "E";
	}
}
