import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class Cylinder extends Shape3D {

    protected double radio;
    protected double length;
    protected double volume;
    protected double area;

    public Cylinder(int x, int y, int z, double radio, double length) {
        super(x, y, z);
        setRadio(radio);
        setLength(length);
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            this.radio = 1;
        }
        this.radio = radio;
    }
     public void setLength(double length) {
         if (length < 0) {
             this.length = 1;
         }
         this.length = 1;
     }

    @Override
    public void setDimensionsV() {
        this.volume = PI*pow(radio,2)*length;
    }

    @Override
    public void setDimensionsA() {
        this.area = 2*PI*pow(radio,2)+2*PI*radio*length;
    }

    @Override
    public double getDimensionsV() {
        return this.volume;
    }

    @Override
    public double getDimensionsA() {
        return this.area;
    }

    public double getRadio() {
        return radio;
    }

    public double getLength() {
        return length;
    }
}
