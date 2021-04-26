public class Rueda {
    private double pulgadas;
    private int numTornillos;

    public Rueda(double pulgadas, int numTornillos) {
        this.pulgadas = pulgadas;
        this.numTornillos = numTornillos;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        if (pulgadas < 0){
            this.pulgadas = 13;
        }
        this.pulgadas = pulgadas;
    }

    public int getNumTornillos() {
        return numTornillos;
    }

    public void setNumTornillos(int numTornillos) {
        if (numTornillos < 0){
            this.numTornillos = 4;
        }
        this.numTornillos = numTornillos;
    }
}
