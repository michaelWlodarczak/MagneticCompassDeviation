package okreslanieDewiacjiPrzezPorownanieKursow;

public interface Methods {
    public void introduction();
    public void insertVariation();
    public void insertCompassCourses();
    public void calculateDeviationForCardinalCourses();
    public void displayDeviationForCardinalCourses();

    public void calculateFactorA();
    public void calculateFactorB();
    public void calculateFactorC();
    public void calculateFactorD();
    public void calculateFactorE();
    /*TODO - PYTANIE? Czy jesli w klasie implementujacej metody przed nazwa metody jest
    slowo kluczowe final, to w interfejsie juz nie musi byc?  */
    public void displayFactors();

//    public void calculateDeviationForHeadingEveryTenDegrees();
//    public void displayDeviationForHeadingEveryTenDegrees();

}
