import java.util.Random;

public class Vec2D {

    private final double x, y;

    public Vec2D(double maxX, double maxY) {
        x = Math.random() * maxX;
        y = Math.random() * maxY;

    }

    public Vec2D sub(Vec2D other) {
        return new Vec2D(x - other.x, y - other.y);
    }

    public double distance (Vec2D other) {
        return Math.sqrt(Math.pow(sub(other).x, 2) + Math.pow(sub(other).y, 2));
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

}
