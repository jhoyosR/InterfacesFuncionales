package function;

public class Pelicula {
    private String nombre;
    private String director;
    private String protagonista;

    public Pelicula(String nombre, String director, String protagonista) {
        this.nombre = nombre;
        this.director = director;
        this.protagonista = protagonista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
}
