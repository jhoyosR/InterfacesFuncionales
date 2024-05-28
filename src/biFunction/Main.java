package biFunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Carlos", 8,null);
        Restaurante restaurante = new Restaurante("Chingados","Mexicana");

        BiFunction<Chef, Restaurante, String> cocinarPlato = (p,m) -> {
            p.setPlatoCocinado("Tacos de Birria");
            return "En el restaurante " + m.getNombre() + ", el chef " + p.getNombre() + " ha cocinado " + p.getPlatoCocinado();
        };

        System.out.println(cocinarPlato.apply(chef, restaurante));
    }
}
