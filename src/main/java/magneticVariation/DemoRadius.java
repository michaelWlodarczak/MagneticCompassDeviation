package magneticVariation;

public class DemoRadius {
    public static void main(String[] args) {
        double a = 180;
        double PI = Math.PI;
        double result;
        result = a/PI;
        System.out.println(result);

        double x = 180;
        x = Math.toRadians(x);
        System.out.println(x);
        //System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
        double y = 180;
        y = Math.toRadians(y);
        System.out.println(y);

        double n = 0;
        n = Math.toRadians(n);
        System.out.println("N = " + n);
        double ne = 45;
        ne = Math.toRadians(ne);
        System.out.println("NE = " + ne);
        double e = Math.toRadians(90);
        System.out.println("E = " + e);
        double se = Math.toRadians(135);
        System.out.println("SE = " + se);
        double s = Math.toRadians(180);
        System.out.println("S = " + s);
        double sw = Math.toRadians(225);
        System.out.println("SW = " + sw);
        double w = Math.toRadians(270);
        System.out.println("W = " + w);
        double nw = Math.toRadians(315);
        System.out.println("NW = " + nw);
        double n2 = Math.toRadians(360);
        System.out.println("N = " + n2);


    }
}