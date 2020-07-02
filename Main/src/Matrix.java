import java.util.ArrayList;

public class Matrix {


    private ArrayList<Vec2D> pointsInMatrix = new ArrayList<>();
    private double width;
    private double length;
    private int numberOfPoints;

    public Matrix(double width, double length, int numberOfPoints) {
        this.width = width;
        this.length = length;
        this.numberOfPoints = numberOfPoints;

        setRandomPoints();
    }

    public ArrayList<Vec2D> getPointsInMatrix() {
        return pointsInMatrix;
    }

    public void setRandomPoints() {
        for (int i = 0; i < numberOfPoints; i++) {
            pointsInMatrix.add(new Vec2D(width, length));
        }
    }


    public static void merge(ArrayList<Vec2D> pointsInMatrix) {
        if (pointsInMatrix.size() <= 1) {
            return;
        }

        int midPoint = pointsInMatrix.size() / 2;

        ArrayList<Vec2D> left = new ArrayList<Vec2D>();
        ArrayList<Vec2D> right = new ArrayList<Vec2D>();

        //configure loop
        for (int i = 0; i < midPoint; i++) {
            left.add(pointsInMatrix.remove(0));
        }

        //configure while
        while (pointsInMatrix.size() != 0) {
            right.add(pointsInMatrix.remove(0));
        }

        merge(left);
        merge(right);

        while (left.size() != 0 && right.size() != 0) {
            // compare both heads, add the lesser into the result and remove it from its list
            System.out.println(left.get(0).getX() + "||"+right.get(0).getX());
            if (left.get(0).getX() < right.get(0).getX()) {
                pointsInMatrix.add(left.remove(0));
            } else {
                pointsInMatrix.add(right.remove(0));
            }

            while (left.size() != 0) {
                pointsInMatrix.add(left.remove(0));
            }
            while (right.size() != 0) {
                pointsInMatrix.add(right.remove(0));
            }
        }
    }
}
