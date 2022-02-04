public class WestRover implements Rover{
    @Override
    public Direction getDirection() {
        return Direction.WEST;
    }

    @Override
    public Rover turnLeft() {
        return new SouthRover();
    }

    @Override
    public Rover turnRight() {
        return new NorthRover();
    }

    @Override
    public Position move(Position position) {
        return null;
    }
}
