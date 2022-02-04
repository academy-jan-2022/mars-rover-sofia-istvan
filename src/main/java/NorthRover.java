public class NorthRover implements Rover{
    @Override
    public Direction getDirection() {
        return Direction.NORTH;
    }

    @Override
    public Rover turnRight() {
        return new EastRover();
    }

    @Override
    public Rover turnLeft() {
        return new WestRover();
    }

    @Override
    public Position move(Position position) {
        return null;
    }
}
