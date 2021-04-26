public class Licuadora extends Electrodomestico{

    protected int velocidad;
    protected boolean tipo_velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isTipo_velocidad() {
        return tipo_velocidad;
    }

    public void setTipo_velocidad(boolean tipo_velocidad) {
        this.tipo_velocidad = tipo_velocidad;
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
