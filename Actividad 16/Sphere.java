import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class Sphere extends Shape3D{
    protected double radio;
    protected double volume;
    protected double area;

    public Sphere(int x, int y, int z, double radio) {
        super(x, y, z);
        setRadio(radio);
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            this.radio = 1;
        }
        this.radio = radio;
    }


    @Override
    public void setDimensionsV() {
        this.volume = (float)4/3*PI*pow(radio,3);
    }

    @Override
    public void setDimensionsA() {
        this.area = 4*PI*pow(radio,2);
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
}
