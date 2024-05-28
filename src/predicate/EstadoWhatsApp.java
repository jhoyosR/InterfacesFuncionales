package predicate;

public class EstadoWhatsApp {
    private String numeroRegistrado;
    private boolean estaOnline;

    public EstadoWhatsApp(String numeroRegistrado, boolean estaOnline) {
        this.numeroRegistrado = numeroRegistrado;
        this.estaOnline = estaOnline;
    }

    public String getNumeroRegistrado() {
        return numeroRegistrado;
    }

    public void setNumeroRegistrado(String numeroRegistrado) {
        this.numeroRegistrado = numeroRegistrado;
    }

    public boolean isEstaOnline() {
        return estaOnline;
    }

    public void setEstaOnline(boolean estaOnline) {
        this.estaOnline = estaOnline;
    }
}
