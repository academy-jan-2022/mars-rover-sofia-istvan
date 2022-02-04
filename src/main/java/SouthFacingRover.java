public class SouthFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if (singleCommand.equals("R")) {
			return new WestFacingRover();
		}
		return new EastFacingRover();
	}

	@Override
	public String renderPosition() {
		return null;
	}
}
