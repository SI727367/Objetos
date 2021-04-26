public class Refrigerador extends Electrodomestico{

    protected boolean estatus_puerta1;
    protected boolean estatus_puerta2;
    protected boolean estatus_alarma;
    protected int temperatura_refri;
    protected int temperatura_congelador;

    public boolean isEstatus_puerta1() {
        return estatus_puerta1;
    }

    public void setEstatus_puerta1(boolean estatus_puerta1) {
        this.estatus_puerta1 = estatus_puerta1;
    }

    public boolean isEstatus_puerta2() {
        return estatus_puerta2;
    }

    public void setEstatus_puerta2(boolean estatus_puerta2) {
        this.estatus_puerta2 = estatus_puerta2;
    }

    public boolean isEstatus_alarma() {
        return estatus_alarma;
    }

    public void setEstatus_alarma(boolean estatus_alarma) {
        this.estatus_alarma = estatus_alarma;
    }

    public int getTemperatura_refri() {
        return temperatura_refri;
    }

    public void setTemperatura_refri(int temperatura_refri) {
        this.temperatura_refri = temperatura_refri;
    }

    public int getTemperatura_congelador() {
        return temperatura_congelador;
    }

    public void setTemperatura_congelador(int temperatura_congelador) {
        this.temperatura_congelador = temperatura_congelador;
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
