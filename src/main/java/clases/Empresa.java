package clases;
import anotaciones.EmpleadoAnotacion;
import anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

//array de empleadoAnotacion dentro de empleados, que tiene valor inicial value()=por defecto
@Empleados(value = {
        @EmpleadoAnotacion(nombre = "Paco", apellido = "Fernandez", direccion = "S. Alfonso", dni = "12435", telefono = 252356, clase = "Directivo", codigoDespacho = 2),
        @EmpleadoAnotacion(nombre = "Sara", apellido = "Dominguez", direccion = "Avenida Mijas", dni = "456435", telefono = 952356, clase = "Oficial", categoria = "de primera"),
        @EmpleadoAnotacion(nombre = "Rafa", apellido = "Martin", direccion = "San Juan", dni = "46598", telefono = 243546, clase = "Técnico", perfil = "mantenimiento")})
//añadir directivo operario y oficial

public class Empresa{
    String nombre;
    Set<Empleado> empleadoSet = new HashSet<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleadoSet = this.empleadoSet;
    }

    //Cargador de anotaciones
    public static void cargadorDeContexto(Empresa empresa){
        //devuele 1 anotacion y necesitamos un array de anotaciones
        //empresa.getClass().getAnnotation(Empleados.class);

        //para devolver un array de anotaciones
       Empleados empleadosAnotPadre = empresa.getClass().getAnnotation(Empleados.class);
       EmpleadoAnotacion[] empleadoAnotHijos = empleadosAnotPadre.value();

       for (EmpleadoAnotacion empleadoAnotHijo: empleadoAnotHijos){
           String nombre = empleadoAnotHijo.nombre();
           String apellido = empleadoAnotHijo.apellido();
           String direccion = empleadoAnotHijo.direccion();
           String dni = empleadoAnotHijo.dni();
           int telefono = empleadoAnotHijo.telefono();
           String clase = empleadoAnotHijo.clase();
           int codigoDespacho = empleadoAnotHijo.codigoDespacho(); //directivo
           int codigoTaller = empleadoAnotHijo.codigoTaller(); //operario
           String perfil = empleadoAnotHijo.perfil(); // tecnico
           String categoria = empleadoAnotHijo.categoria(); // oficial

            //empresa.getEmpleadoSet().add(new Empleado(nombre, apellidos, direccion, dni, telefono));
           if (empleadoAnotHijo.clase().equals("Directivo")){
               empresa.getEmpleadoSet().add(new Directivo(nombre, apellido, direccion, dni, telefono, clase, codigoDespacho));
           } else if (empleadoAnotHijo.clase().equals("Técnico")){
               empresa.getEmpleadoSet().add(new Directivo(nombre, apellido, direccion, dni, telefono, clase, codigoTaller, perfil));
           }
       }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "clases.Empresa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Set<Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public void setEmpleadoSet(Set<Empleado> empleadoSet) {
        this.empleadoSet = empleadoSet;
    }
}