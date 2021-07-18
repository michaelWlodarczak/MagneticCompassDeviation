package magneticVariation;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoInsertVariationIfWrongValueRunAgain {
    public static void main(String[] args) {
        DemoInsertVariationIfWrongValueRunAgain demoInsertVariationIfWrongValueRunAgain = new DemoInsertVariationIfWrongValueRunAgain();
        demoInsertVariationIfWrongValueRunAgain.insertVariation();
    }

    public double insertVariation() {
        while (true) {
            System.out.println("Insert value of variation: ");
            Scanner sc = new Scanner(System.in);
            double d = sc.nextDouble();

        }
    }
}

// System.out.println("Wrong input. Insert correct value");




