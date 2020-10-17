package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.wyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public enum TshirtSize {
    S(48, 71, 42),M(52, 74, 44);

    TshirtSize(int width, int length, int sleeve) {
        this.width = width;
        this.length = length;
        this.sleeve = sleeve;
    }

    public int getWidth() {
        return width;
    }

    private int width;
    private int length;
    private int sleeve;


    public int getLength() {
        return length;
    }

    public int getSleeve() {
        return sleeve;
    }

    @Override
    public String toString() {
        return "TshirtSize{" +
                "width=" + width +
                ", length=" + length +
                ", sleeve=" + sleeve +
                '}';
    }
}
