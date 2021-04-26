public class LavadoraDePlatos extends Electrodomestico{
    public static final int
            LAVADO_LIGERO = 0,
            LAVADO_PESADO = 1,
            LAVADO_NORMAL = 2,
            EXTRA_JABON = 3,
            SAMSUNG = 4;

    protected boolean estatus_tapa;
    protected int tipo_lavado;
    protected boolean candado;

    public boolean isEstatus_tapa() {
        return estatus_tapa;
    }

    public void setEstatus_tapa(boolean estatus_tapa) {
        this.estatus_tapa = estatus_tapa;
    }

    public int getTipo_lavado() {
        return tipo_lavado;
    }

    public void setTipo_lavado(int tipo_lavado) {
        this.tipo_lavado = tipo_lavado;
    }

    public boolean isCandado() {
        return candado;
    }

    public void setCandado(boolean candado) {
        this.candado = candado;
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
