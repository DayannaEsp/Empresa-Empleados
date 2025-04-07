public class EmpleadoPorHoras extends Empleado {
    private final double pagoPorHora = 98000;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int edad, int horasTrabajadas) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public String getInformacion() {
        return "[Empleado por Horas] " + super.getInformacion() +
                ", Horas trabajadas: " + horasTrabajadas;
    }
}