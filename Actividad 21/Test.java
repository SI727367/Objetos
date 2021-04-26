public class Test {
    public static void main(String[] args) {
        RGBColor rgb1 = new RGBColor(125,50,10);
        System.out.println(rgb1);

        RGBColor rgb2 = new RGBColor(255,255,0);
        System.out.println(rgb2);

        RGBColor rgb3 = new RGBColor(256,0,0); //error
        System.out.println(rgb3);

        RGBColor rgb4 = new RGBColor(-1,0,0);
        System.out.println(rgb4);
    }
}