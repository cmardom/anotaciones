package clases;

public class Directivo extends Empleado{
    int codigoDespacho;

    public Directivo(String nombre, String apellido, String direccion, String dni, int telefono, String clase, int codigoDespacho) {
        super(nombre, apellido, direccion, dni, telefono, clase);
        this.codigoDespacho = codigoDespacho;
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codigoDespacho=" + codigoDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", clase='" + clase + '\'' +
                '}';
    }
}
