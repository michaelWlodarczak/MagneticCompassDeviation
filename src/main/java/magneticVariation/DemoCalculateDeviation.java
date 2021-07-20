package magneticVariation;

public class DemoCalculateDeviation {
    public static void main(String[] args) {
        double TCN = 0;
        double d;
        double CCN;
        double Cerr = 0;
        double DEVn = 0;
        //PATTERN:
        //Cerr = TCN - CCN
        //DEVn = Cerr - d
        //DEVn = (TCN-CCN)-d
        d = -0.5;
        CCN = 50;

        if (CCN > 0 && CCN <=180) {
            Cerr = (0 - CCN);
            DEVn = TCN-CCN-d;
        } else if (CCN >180 && CCN <=360){
            Cerr = (360 - CCN);
            DEVn = 360-CCN-d;
        }

        System.out.println("Compass error = " + Cerr +
                "\nDeviation = " + DEVn);
    }
}
