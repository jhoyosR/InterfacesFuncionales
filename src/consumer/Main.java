package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Productos> productosList = new ArrayList<>();
        productosList.add(new Productos("Leche",15));
        productosList.add(new Productos("Atun",25));
        productosList.add(new Productos("Azucar",5));

        Consumer<Productos> aumentarPrecio = productos -> productos.setPrecio(productos.getPrecio() + 5);
        productosList.forEach(aumentarPrecio);

        productosList.forEach(System.out::println);


    }
}
