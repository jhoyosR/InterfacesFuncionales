package predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        EstadoWhatsApp cuentaWhatsApp1 = new EstadoWhatsApp("314513341",true);
        EstadoWhatsApp cuentaWhatsApp2 = new EstadoWhatsApp("323809334",false);

        Predicate<EstadoWhatsApp> estaEnLinea = EstadoWhatsApp::isEstaOnline;

        System.out.println("La cuenta de WhatsApp 1 esta en linea: " + estaEnLinea.test(cuentaWhatsApp1));
        System.out.println("La cuenta de WhatsApp 2 esta en linea: " + estaEnLinea.test(cuentaWhatsApp2));

    }
}
