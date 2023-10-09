package anotaciones;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Empleados.class)
public @interface EmpleadoAnotacion {
    String nombre();
    String apellido();
    String direccion();
    String dni();
    int telefono();
}

