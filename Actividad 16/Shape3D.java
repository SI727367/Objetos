public abstract class Shape3D {
    protected int x;
    protected int y;
    protected int z;

    public Shape3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Shape3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public abstract void setDimensionsV();
    public abstract void setDimensionsA();
    public abstract double getDimensionsV();
    public abstract double getDimensionsA();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
