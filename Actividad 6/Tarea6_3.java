public class Tarea6_3 {
    public static int getRandomNumber() {
        return (int) ((Math.random() * (20 - 2)) + 2);
    }

    public static void main(String[] args) {
        int random = getRandomNumber();
        System.out.printf("Random =  %d\n",random);
        for (int i = 1; i <= random; i++) {
            for (int j = 0; j < i; j++) System.out.printf("%2d ", i);
            System.out.print("\n");
        }
    }
}
