public class Variables {
    public static void main(String[] args) {
        int N = 85;
        double A = 8.36;
        char C = 9812;

        System.out.println("N = " + N);
        System.out.println("A = " + A);
        System.out.println("C = " + C);

        double Resta = A-N; //Redundante porque a Java no le gusta directo

        System.out.println(N + " + " + A + " = " + N+A);
        System.out.println(A + " - " + N + " = " + Resta);
        System.out.println("Valor numerico del caracter C = " + Integer.toString(C));
    }
}
