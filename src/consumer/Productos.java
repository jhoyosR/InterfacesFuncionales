package consumer;

public class Productos {
    public String name;
    public int precio;

    public Productos(String name, int precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "name='" + name + '\'' +
                ", precio=" + precio +
                '}';
    }
}
