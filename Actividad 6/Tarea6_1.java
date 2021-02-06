import java.util.Arrays;

public class Tarea6_1 {
    private static int Length;
    private static int Width;

    public static void LengthsWidth(double [][] MatrixF){           //Función para obtener cantidad de filas y columnas maximas
        int Length_Locale = MatrixF.length;
        int Width_Locale = MatrixF.length;
        for (double[] doubles : MatrixF) {
            int Width_Loop = doubles.length;
            if (Width_Loop > Width_Locale) Width_Locale = Width_Loop;
        }
        if (Length_Locale>Length) Length = Length_Locale;
        if (Width_Locale>Width) Width = Width_Locale;
    }
    public static void main(String[] args) {
        double [][] MatrixA = new double [][] {{44,85,45,23},{89,45,25},{63,45,28,45},{85,23,10,0,85}};
        double [][] MatrixB = new double [][] {{42,2,63,95,32},{41,15,64,73},{52,73,0,84,154}};

        LengthsWidth(MatrixA);
        LengthsWidth(MatrixB);

        double [][] MatrixC = new double [Length][Width];
        for (int i = 0; i < Length; i++) Arrays.fill(MatrixC[i], 0);  //Llenar la MatrixC con 0

        for (int i = 0; i < Length; i++) {
            for (int j = 0; j < Width; j++) {
                try{MatrixC[i][j] += MatrixA[i][j];}catch (IndexOutOfBoundsException ignored) { }   //Evitar el error OutofBound
                try{MatrixC[i][j] += MatrixB[i][j];}catch (IndexOutOfBoundsException ignored) { }   //Por no ser cuadrados perfectos
            }
        }
        for (int i = 0; i < Length; i++) {
            for (int j = 0; j < Width; j++) System.out.printf("%3.3f ", MatrixC[i][j]);
            System.out.print("\n");
        }







    }
}
