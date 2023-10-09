package main;

import anotaciones.EmpleadoAnotacion;
import clases.*;

import java.lang.annotation.Annotation;


public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Sanitubo");
        Empresa.cargadorDeContexto(empresa);
        System.out.println(empresa);
    }
}
