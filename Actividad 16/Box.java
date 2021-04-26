
public class Box extends Shape3D{

    protected double width;
    protected double length;
    protected double height;
    protected double volume;
    protected double area;

    public Box(int x, int y, int z, double width, double length, double height) {
        super(x, y, z);
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 1;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length < 0) {
            this.length = 1;
        }
        this.length = length;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height= 1;
        }
        this.height = height;
    }

    @Override
    public void setDimensionsV() {
        this.volume = width*length*height;
    }

    @Override
    public void setDimensionsA() {
        this.area = 2*width*length+2*width*height+2*height*width;
    }

    @Override
    public double getDimensionsV() {
        return this.volume;
    }

    @Override
    public double getDimensionsA() {
        return this.area;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
