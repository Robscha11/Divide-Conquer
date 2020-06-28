import java.util.ArrayList;

public class Matrix {

    private ArrayList<Vec2D> pointsInMatrix= new ArrayList<>();
    private double width;
    private double length;
    private int numberOfPoints;

    public Matrix (double width, double length, int numberOfPoints) {
        this.width = width;
        this.length = length;
        this.numberOfPoints = numberOfPoints;

        setRandomPoints();

        for(Vec2D random: pointsInMatrix) {
            System.out.println(random.getX());
            System.out.println(random.getY());
        }
        System.out.println(pointsInMatrix.size());

    }

    public void setRandomPoints () {
        for (int i = 0; i < numberOfPoints; i++) {
            pointsInMatrix.add(new Vec2D(width,length));
        }
    }
}
