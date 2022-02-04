public class Controller {
    private MarsRover2 rover = new NorthFacingRover();
    private CartesianGrid pointer;

    public Controller(CartesianGrid grid) {
        this.pointer = grid;
    }

    public String execute(String command) {

        for (String singleCommand : command.split("")) {
            if (singleCommand.equals("M")) {
                pointer = switch (rover.getDirection()) {
                    case "N" -> pointer.moveTop();
                    case "S" -> pointer.moveBottom();
                    case "E" -> pointer.moveRight();
                    default -> pointer.moveLeft();
                };
            } else {
                rover = rover.execute(singleCommand);
            }
        }

        return pointer.getX() + ":" + pointer.getY() + ":" + rover.getDirection();
    }
}
