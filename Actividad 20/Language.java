public class Mein {
    public static void main(String[] args) {
        Dia d1 = Dia.MIERCOLES;
        d1.cambiarIdioma(Idioma.INGLES);
        System.out.println(d1);  
		
		Dia d2 = Dia.SABADO;
        System.out.println(d2);  


        System.out.println("Dias de las semanas en 4 idiomas");
        Dia[] dias = Dia.values();
        Idioma[] idiomas = Idioma.values();

        for(Idioma idioma: idiomas){
            System.out.println(" " + idioma + " ");
            for(Dia dia: dias){
                dia.cambiarIdioma(idioma);
                System.out.println(dia);
            }
        }

    }
}