public class TestVec3 {
    public static void main(String[] args) {
        Vec3 vecA = new Vec3(15,26,48.5);
        Vec3 vecB = new Vec3(24,96.8,78);
        Vec3 V2 = new Vec3(15,-60,90.45);
        Vec3 V3 = new Vec3(50.2,-5.4,-96);

        System.out.println(V3.dotProduct(V2));

        System.out.println("VecA = "+vecA.toString());
        System.out.println("VecB = "+vecB.toString());

        System.out.println("VecA == VecB: "+vecA.equals(vecB));
        vecB = vecA.clone();
        System.out.println("VecA == VecB: "+vecA.equals(vecB));

        Vec3 vecC = vecA.normalized();
        System.out.println("VecC = "+vecC.toString());

        vecC.setX(19.7);
        vecC.setY(45);
        vecC.setZ(53);
        System.out.println("VecC = "+vecC.toString());

        System.out.println("VecA * VecB = "+vecA.dotProduct(vecB));
        System.out.println("VecB * VecC = "+vecB.dotProduct(vecC));
        System.out.println("VecC * VecA = "+vecC.dotProduct(vecA));
    }
}
