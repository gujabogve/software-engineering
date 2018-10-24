package interfacetest;

public class Line implements Drawable {
    private double ax, ay;
    private double bx, by;

    @Override
    public void draw() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void move(double dx, double dy) {

    }

    @Override
    public void moveAbsolute(double x, double y) {

    }

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public double getAy() {
        return ay;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public double getBx() {
        return bx;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public double getBy() {
        return by;
    }

    public void setBy(double by) {
        this.by = by;
    }
}
