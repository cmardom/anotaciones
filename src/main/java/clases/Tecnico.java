package clases;

public class Tecnico extends Operario {
    String perfil;


    public Tecnico(String nombre, String apellido, String direccion, String dni, int telefono, String clase, int codigoTaller, String perfil) {
        super(nombre, apellido, direccion, dni, telefono, clase, codigoTaller);
        perfil = this.perfil;
    }

    public Tecnico(int codigoTaller) {
        super(codigoTaller);
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "clases.Tecnico{" +
                "perfil='" + perfil + '\'' +
                ", codigoTaller='" + codigoTaller + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
