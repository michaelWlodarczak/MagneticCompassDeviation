package okreslanieDewiacjiPrzezPorownanieKursow;

public enum TrueCourses {
    N(0), //TODO - TAK NA PRAWDE MUSZE ZAMIENIC TO NA STOPNIE (chyba?!)
    NE(45),
    E(90),
    SE(125),
    S(180),
    SW(225),
    W(270),
    NW(315);

    double value;

    TrueCourses(double value) {
        this.value = value;
    }


}




