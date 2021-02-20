public class Examen_1 {
    public static void main(String[] args) {
        Vec3 V1 = new Vec3();
        Vec3 V2 = new Vec3(65,20,74.65);
        Vec3 V3 = new Vec3(-30.2,-9.4,66);

        //System.out.println(V3);

        System.out.println(V3.Magnitud());
        System.out.println(V3.Normalizar());
        System.out.println(V3.ProductoP(V2));

        Vec3 V4 = V3.clone();
        System.out.println(V4);
        System.out.println(V4.equals(V3));
        V4 = V2.clone();
        System.out.println(V4.equals(V3));
        Vec3 V5 = new Vec3(-950,520,52);
        System.out.println(V5);
    }
}
