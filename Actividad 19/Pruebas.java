public class Pruebas {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alejandro Mauricio","Carrillo Villalobos", 12); //Asosiacion
        Rueda r1 = new Rueda(21,6); //Agregcion
        Rueda r2 = new Rueda(21,6); //Agregcion
        Rueda r3 = new Rueda(21,6); //Agregcion
        Rueda r4 = new Rueda(21,6); //Agregcion
        Motor m1 = new Motor(8,4.5,300); //Agregcion

        Vehicula Cybertrocka = new Vehicula("Tesla","Cybertruck",2022,m1,r1,r2,r3,r4,p1); // Clase alta

        System.out.println(Cybertrocka.toString());
    }
}
