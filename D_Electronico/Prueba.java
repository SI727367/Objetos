public class Prueba {
    public static void main(String[] args) {
        SmartPhone d1 = new SmartPhone(1,5,3,true,5,false,true,"INFINITUMEXAMEN","Telcel",5000,false,58);
        Tableta d2 = new Tableta(5,8,4,true,80,"INFINITUMEXAMEN",8000,true,100);
        Laptop d3 = new Laptop(3,15,1,false,100,false,"INFINITUMEXAMEN","ETH0/0",90000,false,80);
        SmartTV d4 = new SmartTV(1,80,5,true,8,false,5,false,"INFINITUMEXAMEN","eth0/1");

        d1.desconectar();
        d1.inllamada();
        d1.smart_conectar_lte();

        System.out.println(d2.getBateria_mHa());
        d2.install_app();
        System.out.println(d2.q_apps());

        d3.desconectar();
        System.out.println(d3.which_conexion());
        System.out.println(d3.getOS());

        System.out.println(d4.getT_Pantalla());
        System.out.println(d4.getMarca());
        d4.q_see();


    }
}
