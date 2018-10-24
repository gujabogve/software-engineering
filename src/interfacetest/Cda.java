package interfacetest;

public class Cda {
    public static void main(String[] args) {
        Animator a = new Animator();
        Line l = new Line();
        a.animate(l);

        ShapeAnimator sa = new ShapeAnimator();
        Triangle t = new Triangle();
        sa.animate(t);

    }
}
