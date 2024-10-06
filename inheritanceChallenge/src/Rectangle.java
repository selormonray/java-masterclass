public class Rectangle {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
