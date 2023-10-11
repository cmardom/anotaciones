package clases;

public class Operario extends Empleado{
    int codigoTaller;

    public Operario(String nombre, String apellido, String direccion, String dni, int telefono, String clase, int codigoTaller) {
        super(nombre, apellido, direccion, dni, telefono, clase);
        this.codigoTaller = codigoTaller;
    }

    public Operario(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return "clases.Operario{" +
                "codigoTaller='" + codigoTaller + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
