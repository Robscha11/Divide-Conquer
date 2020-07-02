public class Main {

    public static void main(String[] args) {

        Matrix setUpMatrix = new Matrix(6,5,4);
        for (Vec2D vec2D : setUpMatrix.getPointsInMatrix()) {
            System.out.println(vec2D.getX());
        }
        Matrix.merge(setUpMatrix.getPointsInMatrix());

        System.out.println("-----------------------------");

        for (Vec2D vec2D : setUpMatrix.getPointsInMatrix()) {
            System.out.println(vec2D.getX());
        }

    }


}
