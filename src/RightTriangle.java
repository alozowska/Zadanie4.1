public class RightTriangle {

    int kwadrat(int number) {
        return number * number;
    }


    public boolean isRightTriangle(Triangle triangle) {
        if (kwadrat(triangle.getA()) + kwadrat(triangle.getB()) == kwadrat(triangle.getC())) {
            return true;

        } else {
            return false;
        }
    }
}
