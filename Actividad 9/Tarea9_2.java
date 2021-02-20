import java.util.concurrent.ThreadLocalRandom;

public class Tarea9_2 {
    public static void main(String[] args) {
        int N = 1_000;
        int M = 1_000_000_000;
        for (int i = 0; i < N; i++) {
            int[] array = new int [M];
            array [0] = ThreadLocalRandom.current().nextInt(0,100);
            System.out.println(i+"\t"+array[0]);
        }
    }
}
