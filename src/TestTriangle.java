public class TestTriangle {
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        Triangle trojkat1 = new Triangle(3, 2, 5);

        boolean trojkatProstokatny = rightTriangle.isRightTriangle(trojkat1);
        System.out.println(trojkatProstokatny);

    }
}
