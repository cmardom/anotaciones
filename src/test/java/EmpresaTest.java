import anotaciones.EmpleadoAnotacion;
import clases.Empleado;
import clases.Empresa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTest {
    private Empresa empresa;
    private List<Empleado> empleadoList;

    private static Empleado primerEmpleado;
    private static Empleado segundoEmpleado;
    @BeforeEach
    public void setup() {
        Empresa empresa = new Empresa("Sanitubo");
        Empresa.cargadorDeContexto(empresa);
        empleadoList = new ArrayList<>(empresa.getEmpleadoSet());

    }

    @Test
    public void testEmpresaNotEmpty(){
        Assertions.assertNotNull(empresa);
    }

    @Test
    public void testCargadorDeContextoDirectivo(){
        // segun el orden de las anotaciones, el primer empleado es Paco Fernandez, directivo
        primerEmpleado = empleadoList.get(0);
        //Comprobamos el nombre del empleado
        Assertions.assertEquals("Paco", primerEmpleado.getNombre());
        //Comprobamos la clase
        Assertions.assertEquals("Directivo", primerEmpleado.getClase());
    }

    @Test
    public void testCargadorDeContextoOficial(){
        // segun el orden de las anotaciones, el segundo empleado es Sara dominguez, oficial
        segundoEmpleado = empleadoList.get(1);
        //Comprobamos el nombre del empleado
        Assertions.assertEquals("Sara", this.segundoEmpleado.getNombre());
        //Comprobamos la clase
        Assertions.assertEquals("Oficial", this.segundoEmpleado.getClase());
    }


}
