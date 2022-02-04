public class SouthFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {

		return new EastFacingRover();
	}

	@Override
	public String renderPosition() {
		return null;
	}
}
