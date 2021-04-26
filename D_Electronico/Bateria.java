public interface Bateria {

    /*int bateria_mHa = 0;
    boolean conectado_bateria = false;
    int porcentaje_bateria = 0;
    boolean conectado = false;*/

    int getBateria_mHa();
    void setBateria_mHa(int bateria_mHa);
    int getPorcentaje_bateria();
    void setPorcentaje_bateria(int porcentaje_bateria);

    boolean isConectado();
    void conectado();
    void desconectar();
}
