public class Tostador extends Electrodomestico{

    protected int intensidad_tostado;
    protected boolean tostar;
    protected int tiempo;
    protected boolean cancelar;
    protected boolean bagel;

    public int getIntensidad_tostado() {
        return intensidad_tostado;
    }

    public void setIntensidad_tostado(int intensidad_tostado) {
        this.intensidad_tostado = intensidad_tostado;
    }

    public boolean isTostar() {
        return tostar;
    }

    public void setTostar(boolean tostar) {
        this.tostar = tostar;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isBagel() {
        return bagel;
    }

    public void setBagel(boolean bagel) {
        this.bagel = bagel;
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
