
public class Vehicula {
    private String marca;
    private String modelo;
    private int año;
    Motor motor = new Motor(6,4.5,200);
    Rueda rueda1 = new Rueda(16,6);
    Rueda rueda2 = new Rueda(16,6);
    Rueda rueda3 = new Rueda(16,6);
    Rueda rueda4 = new Rueda(16,6);
    Persona persona = new Persona("Malex","Villawolf",21);

    public Vehicula(String marca, String modelo, int año, Motor motor, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4, Persona p1) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
        this.persona = p1;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año < 0){
            this.año = 2000;
        }
        this.año = año;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda getRueda1() {
        return rueda1;
    }

    public void setRueda1(Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public void setRueda2(Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public void setRueda3(Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }

    public void setRueda4(Rueda rueda4) {
        this.rueda4 = rueda4;
    }

    public Persona getP1() {
        return persona;
    }

    public void setP1(Persona p1) {
        this.persona = p1;
    }

    @Override
    public String toString() {
        return "Vehicula{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", motor=" + motor +
                ", rueda1=" + rueda1 +
                ", rueda2=" + rueda2 +
                ", rueda3=" + rueda3 +
                ", rueda4=" + rueda4 +
                ", persona=" + persona +
                '}';
    }
}
