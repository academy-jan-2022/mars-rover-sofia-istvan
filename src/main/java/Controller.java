public class Controller {
    private MarsRover2 rover = new NorthFacingRover();
    private CartesianGrid grid;

    public Controller(CartesianGrid grid) {
        this.grid = grid;
    }

    public String execute(String command) {
        return rover.execute(command).renderPosition();

    }
}
