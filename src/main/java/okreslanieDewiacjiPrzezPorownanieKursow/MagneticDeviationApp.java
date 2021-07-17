package okreslanieDewiacjiPrzezPorownanieKursow;

public class MagneticDeviationApp {
    public static void main(String[] args) {
        CompareCourses compareCourses = new CompareCourses();
        //compareCourses.introduction();
        compareCourses.insertVariation();
        compareCourses.insertCompasCourses();
        compareCourses.calculateDeviationForCardinalCourses();
        compareCourses.displayDeviationForCardinalCourses();

    }
}
