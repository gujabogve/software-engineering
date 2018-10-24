package interfacetest;

public class Animator {
    public void animate(Drawable d) {
        d.delete();
        d.moveAbsolute(0, 0);
        d.draw();
        d.move(0, 25.6);
        d.move(34.7, 0);
    }
}
