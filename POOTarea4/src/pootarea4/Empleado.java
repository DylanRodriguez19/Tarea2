
package pootarea4;
public class Empleado {
    private String NombreCompleto;
    private int cedula;
    private double salario;
    private String departamento;

    public Empleado(String NombreCompleto, int cedula, double salario, String departamento) {
        this.NombreCompleto = NombreCompleto;
        this.cedula = cedula;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombre) {
        this.NombreCompleto = NombreCompleto;
    }
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
@Override
public String toString() {
    return "Empleado {" +
           "  Nombre: " + NombreCompleto +
           "  Cédula: " + cedula +
           "  Salario: " + salario +
           "  Departamento: " + departamento + 
           " ";
    

}
}
