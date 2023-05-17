public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3, 5);
        System.out.println("Początkowa pozycja: " + point.toString());

        point.moveUp();
        point.moveLeft();
        System.out.println("Nowa pozycja: " + point.toString());

        point.moveDown();
        point.moveRight();
        System.out.println("Końcowa pozycja: " + point.toString());
    }
}
