package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Galleta> galletaList = Arrays.asList(
            new Galleta("Pie de Limon", 7),
            new Galleta("Oreo",7),
            new Galleta("Macadamia",8),
            new Galleta("Nutella",9)
        );

        List<Double> nuevoPrecio = galletaList.stream()
                .map(galleta -> galleta.getPrecio() * 1.2)
                .collect(Collectors.toList());

        System.out.println("Precios de las galletas luego del impuesto del 20%");
        nuevoPrecio.forEach(precio -> System.out.println("$" + precio));
    }
}
