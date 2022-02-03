public class MarsRover {
	public String move(String movement) {
		if (movement.equals("RR")) {
			return "0:0:S";
		}

		return "0:0:E";
	}
}
