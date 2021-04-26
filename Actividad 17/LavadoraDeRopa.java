public class LavadoraDeRopa extends Electrodomestico{
    public static final int
            DELICADO = 0,
            NORMAL = 1,
            CARGA_PESADA = 2,
            BLANCOS = 3;

    protected int tipo_lavado;
    protected int temperatura_agua;
    protected boolean Modo_ecologico;
    protected int Carga_maxima;

    public int getTipo_lavado() {
        return tipo_lavado;
    }

    public void setTipo_lavado(int tipo_lavado) {
        this.tipo_lavado = tipo_lavado;
    }

    public int getTemperatura_agua() {
        return temperatura_agua;
    }

    public void setTemperatura_agua(int temperatura_agua) {
        this.temperatura_agua = temperatura_agua;
    }

    public boolean isModo_ecologico() {
        return Modo_ecologico;
    }

    public void setModo_ecologico(boolean modo_ecologico) {
        Modo_ecologico = modo_ecologico;
    }

    public int getCarga_maxima() {
        return Carga_maxima;
    }

    public void setCarga_maxima(int carga_maxima) {
        Carga_maxima = carga_maxima;
    }

    @Override
    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public int getVoltaje() {
        return this.voltaje;
    }

    @Override
    public void setPotenciaRequerida(int watts) {
        this.watts = watts;
    }

    @Override
    public int getPotenciaRequerida() {
        return this.watts;
    }

    @Override
    public void conectar() {
        this.conectado = true;
    }

    @Override
    public void desconectar() {
        this.conectado = false;
    }

    @Override
    public boolean estatusConexion() {
        return this.conectado;
    }

    @Override
    public void setGas(boolean tipo_gas) {
        this.tipo_gas = tipo_gas;
    }

    @Override
    public boolean getGas() {
        return this.tipo_gas;
    }

    @Override
    public void setPresionMaxima(int presion) {
        this.presion = presion;
    }

    @Override
    public int setPresionMinima(int presion) {
        return this.presion;
    }


}
