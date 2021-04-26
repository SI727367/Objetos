public enum Dia {
    DOMINGO("Domingo", "Sunday", "Dimanche", "日曜日"),
    LUNES("Lunes", "Monday", "Lundi", "月曜日"),
    MARTES("Martes", "Tuesday", "Mardi", "火曜日"),
    MIERCOLES("Miercoles", "Wednesday", "Mercredi", "水曜日"),
    JUEVES("Jueves", "Thursday", "Jeudi", "木曜日"),
    VIERNES("Viernes", "Friday", "Vendredi", "金曜日"),
    SABADO("Sabado", "Saturday", "Samedi", "土曜日");

    private Idioma idioma;
    private String español, ingles, frances, japones;

    Dia(String español, String ingles, String frances, String japones){
        this.español = español;
        this.ingles = ingles;
        this.frances = frances;
        this.japones = japones;
        this.idioma = Idioma.ESPAÑOL;
    }

    public void cambiarIdioma(Idioma idioma){
        this.idioma = idioma;
    }

    public String toString(){
        switch(this.idioma){
            case ESPAÑOL:
                return español;
            case INGLES:
                return ingles;
            case FRANCES:
                return frances;
            case JAPONES:
                return japones;
        }
        return español;
    }
}