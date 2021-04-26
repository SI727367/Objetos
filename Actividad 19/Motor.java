public class Motor {
    private int cilindros;
    private double cilindrada;
    private int caballos;

    public Motor(int cilindros, double cilindrada, int caballos) {
        this.cilindros = cilindros;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public Motor(){
        this.cilindros = 4;
        this.cilindrada = 2.5;
        this.caballos = 200;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        if (cilindros != 4 && cilindros != 6 && cilindros != 8){
            this.cilindros = 4;
        }
        this.cilindros = cilindros;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada < 0){
            this.cilindrada = 5;
        }
        this.cilindrada = cilindrada;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        if (caballos < 0){
            this.caballos = 50;
        }
        this.caballos = caballos;
    }
}
