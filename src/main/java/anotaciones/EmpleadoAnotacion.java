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
    String clase(); //para marcar la clase
    int codigoDespacho() default 0; //directivo
    int codigoTaller() default 0; //operario
    String perfil() default "VOID"; //técnico
    String categoria() default "VOID"; //oficial

}

