public class RightTriangle {

    int kwadratA(Triangle triangle) {
        return triangle.getA() * triangle.getA();
    }

    int kwadratB(Triangle triangle) {
        return triangle.getB() * triangle.getB();
    }

    int kwadratC(Triangle triangle) {
        return triangle.getC() * triangle.getC();
    }

    public boolean isRightTriangle(Triangle triangle) {
        if (kwadratA(triangle) + kwadratB(triangle) == kwadratC(triangle)) {
            return true;

        } else {
            return false;
        }
    }
}
