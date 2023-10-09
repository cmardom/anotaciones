package clases;
import anotaciones.EmpleadoAnotacion;
import anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;

//array de empleadoAnotacion dentro de empleados, que tiene valor inicial value()=por defecto
@Empleados(value = {@EmpleadoAnotacion(nombre = "Paco", apellido = "Fernandez", direccion = "S. Alfonso", dni = "12435", telefono = 252356),
    @EmpleadoAnotacion(nombre = "Sara", apellido = "Dominguez", direccion = "Avenida Mijas", dni = "456435", telefono = 952356)})

public class Empresa{
    String nombre;
    HashSet<Empleado> empleadoSet;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleadoSet = new HashSet<>();
    }

    //Cargador de anotaciones
    public static void cargadorDeContexto(Empresa empresa){
        //devuele 1 anotacion y necesitamos un array de anotaciones
        //empresa.getClass().getAnnotation(Empleados.class);

        //para devolver un array de anotaciones
        Annotation[] anotaciones = empresa.getClass().getAnnotations();
        for (Annotation annotation: anotaciones) {
            if (annotation instanceof Empleados){
                System.out.println(annotation);
                String nombre = ((EmpleadoAnotacion) annotation).nombre();
                String apellido = ((EmpleadoAnotacion) annotation).apellido();
                String direccion = ((EmpleadoAnotacion) annotation).direccion();
                String dni = ((EmpleadoAnotacion) annotation).dni();
                int telefono = ((EmpleadoAnotacion) annotation).telefono();




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
}