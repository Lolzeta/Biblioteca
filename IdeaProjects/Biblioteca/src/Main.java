public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Pepe");
        Fecha f1 = new Fecha();
        Libro l1 = new Libro("Como suspender Aplicaciones Web","Historias de la vida", f1,a1);
        Libro l2 = new Libro("Desde Paris con Amor","Historia", f1,a1);
        Libro l3 = new Libro("Gato Gordo y la tajada mortal","Accion",f1,a1);
        Libro l4 = new Libro("Viejo Oeste","Vaqueros",f1,a1);
        Libro l5 = new Libro("¿Quien anda ahi?","Terror",f1,a1);
        Libro l6 = new Libro("100 dias en Africa","Drama",f1,a1);
        Libro l7 = new Libro("Suspenso improvisado de Programacion","Realidad", f1,a1);
        Libro l8 = new Libro("El violin","Musical",f1,a1);
        Libro l9 = new Libro("El cabesita dalea","Comedia",f1,a1);
        Libro l10 = new Libro("Como contratar un autobus", "Escolares",f1,a1);
        Libro l11 = l1;
        Biblioteca b1 = new Biblioteca("Pepe Reads");
        Biblioteca b2 = new Biblioteca("El templo de Sevoio");
        Biblioteca b3 = new Biblioteca("El intestino del Gato Gordo");
        b1.añadir(l1);
        b1.añadir(l2);
        b1.añadir(l3);
        b1.añadir(l4);
        b1.añadir(l5);
        b1.añadir(l6);
        b1.añadir(l7);
        b1.añadir(l8);
        b1.añadir(l9);
        b1.añadir(l10);
        System.out.println(b1.comprobarDiversidad());
    }
}