package biFunction;

public class Chef {
    public String nombre;
    public int anosExperiencia;
    public String platoCocinado;

    public Chef(String nombre, int anosExperiencia, String platoCocinado) {
        this.nombre = nombre;
        this.anosExperiencia = anosExperiencia;
        this.platoCocinado = platoCocinado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getPlatoCocinado() {
        return platoCocinado;
    }

    public void setPlatoCocinado(String platoCocinado) {
        this.platoCocinado = platoCocinado;
    }
}
