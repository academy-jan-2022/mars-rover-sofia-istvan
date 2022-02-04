public class SouthRover implements Rover{
    @Override
    public Direction getDirection() {
        return Direction.SOUTH;
    }

    @Override
    public Rover turnLeft() {
        return new WestRover();
    }

    @Override
    public Rover turnRight() {
        return new EastRover();
    }

    @Override
    public Position move(Position position) {
        return null;
    }
}
