public class RGBColor {
    private String name;
    private int red;
    private int green;
    private int blue;

    public RGBColor() throws IllegalArgumentException {
        setName("");
        setRed(0);
        setGreen(0);
        setBlue(0);
    }

    public RGBColor(int red, int green, int blue) throws IllegalArgumentException {
        setName("");
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public RGBColor(String name, int red, int green, int blue) throws IllegalArgumentException {
        setName(name);
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) throws IllegalArgumentException{
        if(red < 0 || red > 255)
            throw new IllegalArgumentException();
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) throws IllegalArgumentException{
        if(green < 0 || green > 255)
            throw new IllegalArgumentException();
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) throws IllegalArgumentException{
        if(blue < 0 || blue > 255)
            throw new IllegalArgumentException();
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "RGBColor{" +
                "name='" + name + '\'' +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}