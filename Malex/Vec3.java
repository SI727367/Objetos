public class Vec3 {
    double x=0, y=0, z=0;

    public Vec3() {
        setX(0);
        setY(0);
        setZ(0);
    }

    public Vec3(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x>100 || x<-100)
            return;
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(y>100 || y<-100)
            return;
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        if(z>100 || z<-100)
            return;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vec3 vec3 = (Vec3) o;

        if (Double.compare(vec3.getX(), getX()) != 0) return false;
        if (Double.compare(vec3.getY(), getY()) != 0) return false;
        return Double.compare(vec3.getZ(), getZ()) == 0;
    }

    @Override
    public String toString() {
        return "Vec3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public Vec3 clone() {
        return new Vec3(this.x,this.y,this.z);
    }

    public double magnitude(){
        //Math.pow(base,exponente)
        //magnitud = sqrt(x^2+y^2+z^2)
        return Math.pow((Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2)),(double)1/2);
    }

    public Vec3 normalized(){
        double mag = this.magnitude();
        return new Vec3(this.x/mag,this.y/mag,this.z/mag);
    }

    public double dotProduct(Object o){
        if (o == null || getClass() != o.getClass()) return 0;
        Vec3 vec3 = (Vec3) o;

        return this.getX() * vec3.getX() + this.getY() * vec3.getY() + this.getZ() * vec3.getZ();
    }
}
