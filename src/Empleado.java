public abstract class Empleado {
    protected String nombre;
    protected int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract double calcularSalario();

    public String getInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Salario: $" + calcularSalario();
    }
}
