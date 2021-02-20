import static java.lang.Math.pow;

public class Vec3 {
    private double X;
    private double Y;
    private double Z;

    public Vec3() {
        this.X = (double)0;
        this.Y = (double)0;
        this.Z = (double)0;
    }
    public Vec3(double X,double Y, double Z){
        setX(X);
        setY(Y);
        setZ(Z);
    }

    public void setX(double X) {
        if (X > 100 || X < -100){
            this.X = (double)0;
            return;
        }
        this.X = X;
    }
    public void setY(double Y) {
        if (Y > 100 || Y < -100){
            this.Y = (double)0;
            return;
        }
        this.Y = Y;
    }
    public void setZ(double Z) {
        if (Z > 100 || Z < -100){
            this.Z = (double)0;
            return;
        }
        this.Z = Z;
    }

    public double getX() { return this.X; }
    public double getY() { return this.Y; }
    public double getZ() { return this.Z; }

    public double Magnitud(){
        return (pow(pow(this.X,2)+pow(this.Y,2)+pow(this.Z,2),(double)1/2));
    }
    public Vec3 Normalizar(){
        return new Vec3(this.X/Magnitud(),this.Y/Magnitud(),this.Z/Magnitud());
    }
    public double ProductoP(Object o){
        if (o instanceof Vec3) {
            Vec3 V2 = (Vec3) o;
            return (this.X*V2.getX() + this.Y*V2.getY() + this.Z*V2.getZ());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "{X:" + this.X + ", Y:" + this.Y + ", Z:" + this.Z + "}";
    }


    public boolean equals(Object o) {
        if (o instanceof Vec3) {
            Vec3 r = (Vec3) o;
            return r.getX() == this.getX() &&
                    r.getY() == this.getY() &&
                    r.getZ() == this.getZ();
        } else
            return false;
    }

    @Override
    public Vec3 clone(){
        return new Vec3(this.X, this.Y, this.Z);
    }

}
