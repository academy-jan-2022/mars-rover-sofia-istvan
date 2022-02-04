public class EastFacingRover extends MarsRover2 {
	@Override
	protected MarsRover2 executeSingle(String singleCommand) {
		if(singleCommand.equals("R")){
			return new SouthFacingRover();
		}

		return new NorthFacingRover();
	}

	@Override
	public String renderPosition() {
		return "0:0:E";
	}
}
