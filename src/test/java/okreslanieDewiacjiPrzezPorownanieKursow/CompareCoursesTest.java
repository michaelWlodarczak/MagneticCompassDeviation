package okreslanieDewiacjiPrzezPorownanieKursow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CompareCoursesTest {

    @Test
    void insertDataDouble() {
        //Given
        double a;
        a = 3.14;
        //When
        double expectedDouble = 3.14;
        //Then
        Assertions.assertEquals(expectedDouble, a);
    }

    @Test
    void insertDataText() {
        //test ma za zadanie wykazać, ze uzytkownik podal wartosc liczbowa a nie tekst,
        //test nie przejdzie dla stringa
        //Given
        String b;
        b = "tekst urzytkownika";
        //When
        double expectedDouble = 3.14;
        //Then
        Assertions.assertEquals(expectedDouble, b);
    }

    @Test
    void calculateDeviationForCardinalCoursesOtherThanNorth() {
        //Given
        double TCe = TrueCourses.E.value;
        double CCe = 89;
        double d = 0.6;
        double DEVe;
        DEVe = TCe-CCe-d;
        //When
        double expectedValue = 0.4;
        //Then
        Assertions.assertEquals(expectedValue,DEVe);
    }


    @Test
    void calculateFactorA(){
        //Given
        double factorA;
        double DEVn, DEVne, DEVe, DEVse, DEVs, DEVsw, DEVw, DEVnw;
        DEVn = 1;
        DEVne = 2;
        DEVe = 3;
        DEVse = 4;
        DEVs = 5;
        DEVsw = 6;
        DEVw = 7;
        DEVnw = 8;
        factorA = (DEVn + DEVne + DEVe + DEVse + DEVs + DEVsw + DEVw + DEVnw) / 8;
        //When
        double expectedValue = 4.5;
        //Then
        Assertions.assertEquals(expectedValue,factorA);
    }

    @Test
    void calculateFactorB(){
        //Given
        double factorB;
        double DEVe, DEVw;
        DEVe = 3;
        DEVw = 7;
        factorB = (DEVe - DEVw)/2;
        //When
        double expectedValue = -2;
        //Then
        Assertions.assertEquals(expectedValue,factorB);
    }

    @Test
    void calculateFactorC(){
        //Given
        double factorC;
        double DEVn, DEVs;
        DEVn = 1;
        DEVs = 5;
        factorC = (DEVn - DEVs)/2;
        //When
        double expectedValue = -2;
        //Then
        Assertions.assertEquals(expectedValue,factorC);
    }

    @Test
    void calculateFactorD(){
        double factorD;
        double DEVne, DEVse, DEVsw, DEVnw;
        DEVne = 2;
        DEVse = 4;
        DEVsw = 6;
        DEVnw = 8;
        factorD = ((DEVne + DEVsw) - (DEVse + DEVnw)) / 4;
        //When
        double expectedValue = -1.0;
        //Then
        Assertions.assertEquals(expectedValue,factorD);
    }

    @Test
    void calculateFactorE(){
        //Given
        double factorE;
        double DEVn, DEVe, DEVs, DEVw;
        DEVn = 1;
        DEVe = 3;
        DEVs = 5;
        DEVw = 7;
        factorE = ((DEVn + DEVs) - (DEVe + DEVw)) / 4;
        //When
        double expectedValue = -1.0;
        //Then
        Assertions.assertEquals(expectedValue,factorE);
    }
}