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
    void calculateDeviationForCardinalCourses() {
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
}