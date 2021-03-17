public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = 0;
        if (width >= 0) {
            this.width = width;
        }
        this.height = 0;
        if (height >= 0) {
            this.height = height;
        }

    }

    public double computeArea() {
        return width * height;
    }
    
    public void setWidth(double width) {
        this.width = 0;
        if (width >= 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        this.height = 0;
        if (height >= 0) {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
