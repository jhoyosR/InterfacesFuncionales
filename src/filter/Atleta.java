package filter;

public class Atleta {
    public String nombre;
    public String deporte;

    public Atleta(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }
}
