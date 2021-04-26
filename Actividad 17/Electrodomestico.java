public abstract class Electrodomestico {
    public static final int
            MABE = 0,
            GENERAL_ELECTRIC = 1,
            CALORREX = 2,
            LG = 3,
            SAMSUNG = 4,
            DAEWO = 5,
            WHIRPOOL = 6;

    protected int precio;
    protected int oferta;
    protected int marca;
    protected int voltaje;
    protected int watts;
    protected boolean tipo_gas;
    protected int presion;
    protected boolean conectado;


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public boolean isTipo_gas() {
        return tipo_gas;
    }

    public void setTipo_gas(boolean tipo_gas) {
        this.tipo_gas = tipo_gas;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public abstract void setVoltaje(int voltaje);
    public abstract int getVoltaje();
    public abstract void setPotenciaRequerida(int watts);
    public abstract int getPotenciaRequerida();
    public abstract void conectar();
    public abstract void desconectar();
    public abstract boolean estatusConexion();

    public abstract void setGas(boolean tipo_gas);
    public abstract boolean getGas();

    public abstract void setPresionMaxima(int presion);
    public abstract int setPresionMinima(int presion);
}