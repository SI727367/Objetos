import javax.swing.*;
import static java.util.stream.IntStream.*;



public class Tarea6_2 {
    public static short getRandomNumber() {return (short) (Math.random() * (100));}
    public static void main(String[] args) {
        int G = getRandomNumber();
        short [] Vector = new short [G];
        range(0, G).forEach(i1 -> Vector[i1] = getRandomNumber());

        short Mitad = Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor de X"));

        int k1=0,k2=0;
        for(short num: Vector) if (num > Mitad) k1++;
        for(short num: Vector) if (num % 2!=0) k2++;

        short []Vector1 = new short[k1];
        short []Vector2 = new short[k2];

        int i=0;
        System.out.println("Vector1:");
        for (short Array : Vector)
            if (Array > Mitad) {
                Vector1[i] = Array;
                System.out.println(Vector1[i]);
                i++;
            }

        i=0;
        System.out.println("Vector2:");
        for (short Array : Vector)
            if (Array % 2 != 0) {
                Vector2[i] = Array;
                System.out.println(Vector2[i]);
                i++;
            }
    }
}
