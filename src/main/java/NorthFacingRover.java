public class NorthFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if(singleCommand.equals("M")) {
			return this;
		}
		if (singleCommand.equals("R")) {
			return new EastFacingRover();
		}
		return new WestFacingRover();
	}

	@Override
	public String renderPosition() {
		return "0:1:N";
	}
}
