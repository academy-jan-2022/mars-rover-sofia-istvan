
public class MarsRover {
	private Directions direction = Directions.NORTH;

	public String move(String movements) {
		String position = "0:0:";

//		if (movements.equals("L")) {
//			return "0:0:W";
//		}
//
//		if (movements.equals("LLLL")) {
//			return "0:0:N";
//		}

		String[] movement = movements.split("");

		for(String move : movement) {
			if(move.equals("R"))
				direction = direction.rotateRight();
			if(move.equals("L"))
				direction = direction.rotateLeft();
		}

		return position + direction.getDirection();
	}
}
