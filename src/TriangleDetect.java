
public class TriangleDetect {
    public static String detectTriangle(double a, double b , double c) {
        if (isATriangle(a, b , c)) {
            return Constants.NOT_A_TRIANGLE;
        }
            if (isRight(a, b, c) || isRight(b, a, c) || isRight(c, a, b)) {
                return Constants.RIGHT;
            }
            if (isEquilateral(a, b, c)) {
                return Constants.EQUILATERAL;
            }
            if (isIsosceles(a, b, c)) {
                return Constants.ISOSCELES;
            }
            return Constants.SCALENE;
    }

    private static boolean isATriangle(double a, double b, double c) {
        return a >0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b;
    }

    private static boolean isRight(double a, double b, double c) {
        return Math.pow(a, 2) == Math.pow(b,2) + Math.pow(c, 2);
    }

    private static boolean isIsosceles(double a, double b, double c) {
        return (a == b) || (b == c) || (a == c);
    }

    private static boolean isEquilateral(double a, double b, double c) {
        return (a == b) && (b == c);
    }

}
