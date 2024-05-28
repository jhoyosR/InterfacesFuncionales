package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Atleta> atletaList = Arrays.asList(
            new Atleta("Felipe","Gimnasio"),
            new Atleta("Juan","Futbol 11"),
            new Atleta("Andres","Baloncesto"),
            new Atleta("Sofia","Gimnasio"),
                new Atleta("Pablo","Gimnasio")
        );

        List<Atleta> atletasGimnastas = atletaList.stream()
                .filter(x -> x.getDeporte().equals("Gimnasio"))
                .collect(Collectors.toList());

        System.out.println("Atletas que van al gimnasio: ");
        atletasGimnastas.forEach(atleta -> System.out.println(atleta.getNombre()));
    }
}
