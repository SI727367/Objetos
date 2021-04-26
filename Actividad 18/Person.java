public abstract class Person {
    private int edad;
    private int sexo;
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    public abstract void work();

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
