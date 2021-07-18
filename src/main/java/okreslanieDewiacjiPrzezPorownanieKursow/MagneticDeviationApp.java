package okreslanieDewiacjiPrzezPorownanieKursow;

public class MagneticDeviationApp {
    public static void main(String[] args) {
        CompareCourses compareCourses = new CompareCourses();
        compareCourses.introduction();
        compareCourses.insertVariation();
        compareCourses.insertCompassCourses();
        compareCourses.calculateDeviationForCardinalCourses();
        compareCourses.displayDeviationForCardinalCourses();

        compareCourses.calculateFactorA();
        compareCourses.calculateFactorB();
        compareCourses.calculateFactorC();
        compareCourses.calculateFactorD();
        compareCourses.calculateFactorE();

        compareCourses.displayFactors();


    }
}
