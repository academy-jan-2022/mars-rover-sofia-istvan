public class CartesianGrid {
    private final int width;
    private final int height;
    private final Point point;

    public CartesianGrid(int width, int height) {
        this.width = width;
        this.height = height;
        this.point = new Point();

    }


    private CartesianGrid(int width, int height,Point point) {
        this.width = width;
        this.height = height;
        this.point = point;
    }

    public CartesianGrid moveRight() {
        return new CartesianGrid(width, height,new Point(point.getX() + 1, point.getY()));
    }

    public int getX() {
        return 1;
    }
}
