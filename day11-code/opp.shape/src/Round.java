public class Round extends Shape{
    private double r;
    private double t;

    public Round() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public Round(double r, double t) {
        this.r = r;
        this.t = t;
    }

    @Override
    public double area(double r,double t) {
        return t*r*r;
    }

    @Override
    public double circum(double r,double t) {
        return 2*t*r;
    }
}
