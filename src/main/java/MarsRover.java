public class MarsRover {
	public String move(String movement) {
		if(movement.equals("RRR")) {
			return "0:0:W";
		}
		if (movement.equals("RR")) {
			return "0:0:S";
		}

		return "0:0:E";
	}
}
