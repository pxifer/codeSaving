public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area(double width, double height) {
        return width*height;
    }

    @Override
    public double circum(double width, double height) {
        return 2*(width+height);
    }
}
