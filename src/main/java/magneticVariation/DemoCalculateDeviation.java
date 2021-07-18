package magneticVariation;

public class DemoCalculateDeviation {
    public static void main(String[] args) {
        double TCN = 0;
        double d;
        double CCN;
        double Cerr;
        double DEVn;
        //PATTERN:
        //Cerr = TCN - CCN
        //DEVn = Cerr - d
        //DEVn = (TCN-CCN)-d
        d = -0.9;
        CCN = 357;

        if (CCN > 0 && CCN <=180) {
            Cerr = (0 - CCN);
        } else if (CCN >180 && CCN <=360){
            Cerr = (360 - CCN);
        }



        //TODO - DOKONCZYC! BO BEZ TEGO ANI RUSZ ;/
    }
}
