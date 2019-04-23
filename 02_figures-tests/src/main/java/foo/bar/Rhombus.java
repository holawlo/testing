package foo.bar;

public class Rhombus {

    private int a;
    private int h;

    public Rhombus(int a) {
        this.a = a;
    }

    public Rhombus(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int circumference() {
        return 4*a;
    }

    public int area() {
        return a * h;
    }
}
