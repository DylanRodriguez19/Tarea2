
package pootarea4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private int ruc;
    private String direccion;
    private String email;
    private List<Empleado> empleados;
    public List<Empleado> getEmpleados() {
    return new ArrayList<>(empleados); 
}


    public Empresa(String nombre, int ruc, String direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado añadido: " + empleado.getNombreCompleto());
    }

    public void eliminarEmpleadoPorCedula(int cedula) {
        boolean eliminado = empleados.removeIf(empleado -> empleado.getCedula()== cedula);
        if (eliminado) {
            System.out.println("Empleado con cedula " + cedula + " eliminado.");
        } else {
            System.out.println("Empleado con cedula " + cedula + " no encontrado.");
        }
    }

    public Empleado buscarEmpleadoPorCedula(int cedula) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula() == cedula) {
                return empleado;
            }
        }
        return null;
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
