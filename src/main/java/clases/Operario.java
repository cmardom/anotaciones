package clases;

public class Operario extends Empleado{
    String codigoTaller;

    public Operario(String nombre, String apellido, String direccion, String dni, int telefono, String clase, String codigoTaller) {
        super(nombre, apellido, direccion, dni, telefono, clase);
        this.codigoTaller = codigoTaller;
    }

    public Operario(String codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    public String getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(String codigoTaller) {
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
