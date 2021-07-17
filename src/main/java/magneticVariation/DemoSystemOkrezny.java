package magneticVariation;

public class DemoSystemOkrezny {
    double zero = 0;
    double trzystaSzescdziesiat = 360;
    double a;
    double b;
    double finalResult;

    public DemoSystemOkrezny(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void dodawanieStopni() {
        if (a + b <= 360) {
            finalResult = a + b;
        } else {
            finalResult = (a + b) - 360;
        }
        System.out.println(finalResult);
    }
    public void odejmowanieStopni(){
        if (b - a >= 0) {
            finalResult = b - a;
        } else {
            finalResult = 360 + (b - a);
        }
        System.out.println(finalResult);
    }

    public static void main(String[] args) {
        DemoSystemOkrezny demoSystemOkrezny = new DemoSystemOkrezny(50,40);
        demoSystemOkrezny.dodawanieStopni();
        demoSystemOkrezny.odejmowanieStopni();
    }
}
