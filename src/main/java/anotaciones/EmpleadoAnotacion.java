package anotaciones;

import java.lang.annotation.*;

/**
 * Interfaz para la anotacion de Empleado, que recoge tambien los atributos propios de Directivo, Operario, Tecnico y Oficial
 */
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

