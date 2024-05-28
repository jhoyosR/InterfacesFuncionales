package biConsumer;

import java.util.function.BiConsumer;

public class EjercicioBiConsumer {
    public static void main(String[] args) {
        BiConsumer<String,String> ejercicioFavorito = (nombre,ejercicio) -> System.out.println(nombre + " tiene como ejercicio favorito " + ejercicio);
        ejercicioFavorito.accept("Arle","curl de biceps");
        ejercicioFavorito.accept("Juliana","sentadilla");
        ejercicioFavorito.accept("Juan","extension de cuadriceps");
    }
}
