public class WestFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if (singleCommand.equals("R"))
			return new NorthFacingRover();
		return new SouthFacingRover();
	}

	@Override
	public String renderPosition() {
		return null;
	}
}
