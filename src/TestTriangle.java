public class TestTriangle {
    public static void main(String[] args) {
        RightTriangle rightTriangle=new RightTriangle();
        Triangle trojkat1=new Triangle();
        trojkat1.setA(3);
        trojkat1.setB(4);
        trojkat1.setC(5);
        rightTriangle.kwadratA(trojkat1);
        rightTriangle.kwadratB(trojkat1);
        rightTriangle.kwadratC(trojkat1);
        boolean trojkatProstokatny=rightTriangle.isRightTriangle(trojkat1);
        System.out.println(trojkatProstokatny);





    }
}
