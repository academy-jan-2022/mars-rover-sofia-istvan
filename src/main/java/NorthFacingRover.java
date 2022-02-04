public class NorthFacingRover implements MarsRover2 {
	@Override
	public MarsRover2 execute(String command) {
		if (command.equals("R"))
			return new EastFacingRover();
		return new WestFacingRover();
	}
}
