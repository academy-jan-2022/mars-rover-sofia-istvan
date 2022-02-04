public interface Rover {
    Direction getDirection();
    Rover turnLeft();
    Rover turnRight();
    Position move(Position position);
}
