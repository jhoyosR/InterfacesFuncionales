package function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Pulp Fiction","Quentin Tarantino","John Travolta");
        Pelicula pelicula2 = new Pelicula("Interstellar","Chris Nolan","Matthew McConaughey");
        Pelicula pelicula3 = new Pelicula("Inglorious Basterds","Quentin Tarantino","Brad Pitt");

        Function<Pelicula, String> mostrarInfo = a -> "Pelicula: " + a.getNombre() + " del director " + a.getDirector() + ", protagonizada por " + a.getProtagonista() + ".";

        System.out.println(mostrarInfo.apply(pelicula1));
        System.out.println(mostrarInfo.apply(pelicula2));
        System.out.println(mostrarInfo.apply(pelicula3));
    }
}
