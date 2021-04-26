public class Estufa extends Electrodomestico{

    protected int fuerza_llama;
    protected boolean tipo_quemador;
    protected boolean estatus_cristal;
    protected boolean estatus_tapa;
    protected int fuerza_horno;

    public int getFuerza_llama() {
        return fuerza_llama;
    }

    public void setFuerza_llama(int fuerza_llama) {
        this.fuerza_llama = fuerza_llama;
    }

    public boolean isTipo_quemador() {
        return tipo_quemador;
    }

    public void setTipo_quemador(boolean tipo_quemador) {
        this.tipo_quemador = tipo_quemador;
    }

    public boolean isEstatus_cristal() {
        return estatus_cristal;
    }

    public void setEstatus_cristal(boolean estatus_cristal) {
        this.estatus_cristal = estatus_cristal;
    }

    public boolean isEstatus_tapa() {
        return estatus_tapa;
    }

    public void setEstatus_tapa(boolean estatus_tapa) {
        this.estatus_tapa = estatus_tapa;
    }

    public int getFuerza_horno() {
        return fuerza_horno;
    }

    public void setFuerza_horno(int fuerza_horno) {
        this.fuerza_horno = fuerza_horno;
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
