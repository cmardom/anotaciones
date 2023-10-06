public class Tecnico extends Operario {
    String perfil;


    public Tecnico(String nombre, String apellido, String direccion, String dni, int telefono, String codigoTaller) {
        super(nombre, apellido, direccion, dni, telefono, codigoTaller);
    }

    public Tecnico(String codigoTaller) {
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
        return "Tecnico{" +
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
