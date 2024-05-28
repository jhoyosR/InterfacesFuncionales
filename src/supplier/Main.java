package supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Accesorios gafas = new Accesorios("Gafas",14);
        Accesorios aretes = new Accesorios("Aretes",1);
        Accesorios collar = new Accesorios("Collar",5);


        Supplier<Integer> precioGafasSupplier = gafas::getPrecio;
        Integer precioGafas = precioGafasSupplier.get();
        System.out.println("El precio de las gafas es $" + precioGafas);

        Supplier<Integer> precioAretesSupplier = aretes::getPrecio;
        Integer precioAretes = precioAretesSupplier.get();
        System.out.println("El precio de los aretes es $" + precioAretes);

        Supplier<Integer> precioCollarSupplier = collar::getPrecio;
        Integer precioCollar = precioCollarSupplier.get();
        System.out.println("El precio del collar es $" + precioCollar);


    }
}
