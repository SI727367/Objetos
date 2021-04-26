public class SmartTV extends Dispositivo{
        private boolean smart_estado;
        private int aplicaciones = 0;
        private boolean t_conexion; //true Wifi False LTE
        private int HDMI;
        private boolean TVA;
        private String WiFi;
        private String Ethernet;

    public SmartTV(int marca, double t_Pantalla, int OS, boolean smart_estado, int aplicaciones, boolean t_conexion, int HDMI, boolean TVA, String wiFi, String ethernet) {
        super(marca, t_Pantalla, OS);
        this.smart_estado = smart_estado;
        this.aplicaciones = aplicaciones;
        this.t_conexion = t_conexion;
        this.HDMI = HDMI;
        this.TVA = TVA;
        WiFi = wiFi;
        Ethernet = ethernet;
    }

    public void smart_encender(boolean smart_estado) {
            this.smart_estado = true; //encendido
        }
        public void smart_apagar(){
            this.smart_estado = false; //apagado
        }
        public boolean estado(){
            return smart_estado;
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

        public int q_apps(){
            return aplicaciones;
        }

        public void install_hdmi(){
            HDMI++;
        }

        public void uninstall_hdmi(){
            HDMI--;
        }

        public int q_HDMI(){
            return HDMI;
        }

        public void see_TVA(){
            this.TVA = true;
        }

        public void see_HDMI(){
            this.TVA = false;
        }

        public void q_see(){
            if (this.TVA){
                System.out.println("Tele");
            }
            else{
                System.out.println("HDMI");
            }
        }

        public int q_apps(int aplicaciones){
            return aplicaciones;
        }
    }
