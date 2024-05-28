package biFunction;

public class Restaurante {
    public String nombre;
    public String tipoComida;

    public Restaurante(String nombre, String tipoComida) {
        this.nombre = nombre;
        this.tipoComida = tipoComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
}
