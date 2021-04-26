public class Boiler extends Electrodomestico{

    protected int temperatura;
    protected int flujo_de_agua;
    protected int carga_baterias;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getFlujo_de_agua() {
        return flujo_de_agua;
    }

    public void setFlujo_de_agua(int flujo_de_agua) {
        this.flujo_de_agua = flujo_de_agua;
    }

    public int getCarga_baterias() {
        return carga_baterias;
    }

    public void setCarga_baterias(int carga_baterias) {
        this.carga_baterias = carga_baterias;
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
