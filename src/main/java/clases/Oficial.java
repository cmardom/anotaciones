package clases;

public class Oficial extends Operario{
    String categoria;


    public Oficial(String nombre, String apellido, String direccion, String dni, int telefono, String codigoTaller) {
        super(nombre, apellido, direccion, dni, telefono, codigoTaller);
    }

    public Oficial(String codigoTaller) {
        super(codigoTaller);
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
