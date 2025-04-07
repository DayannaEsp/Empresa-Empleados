public class EmpleadoPlanta extends Empleado {
    private final double salarioFijo = 2100000;

    public EmpleadoPlanta(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    @Override
    public String getInformacion() {
        return "[Empleado de Planta] " + super.getInformacion();
    }
}
