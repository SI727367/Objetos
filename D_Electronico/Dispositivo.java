public abstract class Dispositivo {
    public static final int
            Apple = 0,
            Samsung = 1,
            HP = 2,
            DELL = 3,
            HISENSE = 4,
            SONY = 5,
            Other = 6;
    public static final int
            Unix = 0,
            indows = 1,
            Linux = 2,
            IOS = 3,
            Android = 4,
            Roku = 5;

    protected int marca;
    protected double t_Pantalla;
    protected int OS;

    public Dispositivo(int marca, double t_Pantalla, int OS) {
        this.marca = marca;
        this.t_Pantalla = t_Pantalla;
        this.OS = OS;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        if (marca >= 6 || marca <= 0) {
            this.marca = 6;
            return;
        }
        this.marca = marca;
    }

    public double getT_Pantalla() {
        return t_Pantalla;
    }

    public void setT_Pantalla(int t_Pantalla) {
        if (t_Pantalla < 0) {
            this.t_Pantalla = 4.3;
            return;
        }
        this.t_Pantalla = t_Pantalla;
    }

    public int getOS() {
        return OS;
    }

    public void setOS(int OS) {
        if (OS >= 5 || OS <= 0) {
            this.OS = 0;  //Tecnicamente todos los OS estan basados en el sistema UNIX
            return;
        }
        this.OS = OS;
    }
}
