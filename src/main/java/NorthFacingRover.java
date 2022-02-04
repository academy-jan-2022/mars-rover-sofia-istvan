public class NorthFacingRover implements MarsRover2 {
	@Override
	public MarsRover2 execute(String command) {
		return new WestFacingRover();
	}
}
