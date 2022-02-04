public class EastFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		return new NorthFacingRover();
	}
}
