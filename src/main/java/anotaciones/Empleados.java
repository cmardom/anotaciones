package anotaciones;

import clases.Empleado;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Empleados {
    EmpleadoAnotacion[] value();
}
