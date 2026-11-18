public class ConfiguracionBiblioteca {
    private static ConfiguracionBiblioteca instancia;
    private String nombre;
    private int maxLibros;
    private int plazoDevolucion;

    private ConfiguracionBiblioteca() {
        this.nombre = "Biblioteca Central";
        this.maxLibros = 3;
        this.plazoDevolucion = 15;
    }

    public static ConfiguracionBiblioteca getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionBiblioteca();
        }
        return instancia;
    }

    public void setNombre(String n) {
        if (n != null && !n.isEmpty()) {
            this.nombre = n;
        }
    }

    public void setMaxLibros(int m) {
        if (m > 0) {
            this.maxLibros = m;
        } else {
            System.out.println("Error: El máximo de libros debe ser mayor a cero.");
        }
    }

    public void setPlazoDevolucion(int p) {
        if (p > 0) {
            this.plazoDevolucion = p;
        } else {
            System.out.println("Error: El plazo de devolución debe ser mayor a cero.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getMaxLibros() {
        return maxLibros;
    }

    public int getPlazoDevolucion() {
        return plazoDevolucion;
    }
}