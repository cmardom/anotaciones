package clases;
import anotaciones.EmpleadoAnotacion;
import anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

//array de empleadoAnotacion dentro de empleados, que tiene valor inicial value()=por defecto
@Empleados(value = {@EmpleadoAnotacion(nombre = "Paco", apellido = "Fernandez", direccion = "S. Alfonso", dni = "12435", telefono = 252356),
    @EmpleadoAnotacion(nombre = "Sara", apellido = "Dominguez", direccion = "Avenida Mijas", dni = "456435", telefono = 952356)})

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
            String apellidos = empleadoAnotHijo.apellido();
            String dni = empleadoAnotHijo.dni();
            String direccion = empleadoAnotHijo.direccion();
            int telefono = empleadoAnotHijo.telefono();

            empresa.getEmpleadoSet().add(new Empleado(nombre, apellidos, direccion, dni, telefono));
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