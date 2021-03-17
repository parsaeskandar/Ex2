public class Square implements Shape {
    private double height;

    public Square(double height) {
        this.height = height > 0 ? height : 0;
    }
    
    public double computeArea() {
        return this.height * this.height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }
    
}
