public class Laptop extends Dispositivo implements Bateria{
    private boolean smart_estado;
    private int aplicaciones = 0;
    private boolean t_conexion; //true Wifi False Ethernet
    private String WiFi;
    private String Ethernet;


    //Variables de Bateria
    private int bateria_mHa;
    private boolean conectado_bateria;
    private int porcentaje_bateria;

    public Laptop(int marca, double t_Pantalla, int OS, boolean smart_estado, int aplicaciones, boolean t_conexion,
                  String wiFi, String ethernet, int bateria_mHa, boolean conectado_bateria, int porcentaje_bateria) {
        super(marca, t_Pantalla, OS);
        this.smart_estado = smart_estado;
        this.aplicaciones = aplicaciones;
        this.t_conexion = t_conexion;
        WiFi = wiFi;
        Ethernet = ethernet;
        this.bateria_mHa = bateria_mHa;
        this.conectado_bateria = conectado_bateria;
        this.porcentaje_bateria = porcentaje_bateria;
    }

    public void smart_encender() {
        this.smart_estado = true; //encendido
    }
    public void smart_apagar(){
        this.smart_estado = false; //apagado
    }

    public void smart_conectar_wifi(){
        this.t_conexion = true;
    }

    public void smart_conectar_Ethernet(){
        this.t_conexion = false;
    }

    public String which_conexion(){
        if (this.t_conexion = true){
            System.out.println("Conexion Wifi");
            return this.WiFi;
        }
        else{
            System.out.println("Conexion Ethernet");
            return this.Ethernet;
        }
    }

    public void install_app(){
        aplicaciones++;
    }
    public void uninstall_app(){
        aplicaciones--;
    }
    public int q_apps(int aplicaciones){
        return aplicaciones;
    }

    @Override
    public int getBateria_mHa() {
        return this.bateria_mHa;
    }

    @Override
    public void setBateria_mHa(int bateria_mHa) {
        if (bateria_mHa < 0) {
            this.bateria_mHa = 500; //Bateria mas pequenia en smartphone
        }
        this.bateria_mHa = bateria_mHa;
    }

    @Override
    public int getPorcentaje_bateria() { return this.porcentaje_bateria; }

    @Override
    public void setPorcentaje_bateria(int porcentaje_bateria) {
        if (porcentaje_bateria >= 100 ||porcentaje_bateria <= 0) {
            this.porcentaje_bateria = 0;
        }
        this.porcentaje_bateria = porcentaje_bateria;
    }

    @Override
    public boolean isConectado() { return this.conectado_bateria; }

    @Override
    public void conectado() { this.conectado_bateria = true; }

    @Override
    public void desconectar() { this.conectado_bateria = false; }
}
