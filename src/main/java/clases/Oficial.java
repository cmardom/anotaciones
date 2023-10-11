package clases;

public class Oficial extends Operario{
    String categoria;

    public Oficial(String nombre, String apellido, String direccion, String dni, int telefono, String clase, int codigoTaller, String categoria) {
        super(nombre, apellido, direccion, dni, telefono, clase, codigoTaller);
        this.categoria = categoria;
    }

    public Oficial(int codigoTaller, String categoria) {
        super(codigoTaller);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "clases.Oficial{" +
                "categoria='" + categoria + '\'' +
                ", codigoTaller='" + codigoTaller + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
