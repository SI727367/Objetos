public abstract class Electrodoméstico {
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

    public abstract int setVoltaje(int voltaje);
    public abstract int getVoltaje();
    public abstract int setPotenciaRequerida(int watts);
    public abstract int getPotenciaRequerida();
    public abstract int conectar();
    public abstract int desconectar();
    public abstract int estatusConexion();

    public abstract int setGas(int tipo_gas);
    public abstract int getGas();

    public abstract int setPresionMaxima(int presion);
    public abstract int 





}
