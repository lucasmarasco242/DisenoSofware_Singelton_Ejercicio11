public class Main {
    public static void main(String[] args) {
        ConfiguracionBiblioteca moduloPrestamos = ConfiguracionBiblioteca.getInstancia();
        ConfiguracionBiblioteca moduloConsultas = ConfiguracionBiblioteca.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (moduloPrestamos == moduloConsultas));

        System.out.println("\nConfiguración inicial (desde Consultas):");
        System.out.println("Nombre: " + moduloConsultas.getNombre());
        System.out.println("Máx. libros: " + moduloConsultas.getMaxLibros());
        System.out.println("Plazo: " + moduloConsultas.getPlazoDevolucion() + " días");

        System.out.println("\nModificando configuración desde Préstamos...");
        moduloPrestamos.setNombre("Biblioteca Municipal");
        moduloPrestamos.setMaxLibros(5);
        moduloPrestamos.setPlazoDevolucion(30);

        // Prueba de validación de valores inválidos
        moduloPrestamos.setMaxLibros(0);

        System.out.println("\nVerificando cambios (desde Consultas):");
        System.out.println("Nombre: " + moduloConsultas.getNombre());
        System.out.println("Máx. libros: " + moduloConsultas.getMaxLibros());
        System.out.println("Plazo: " + moduloConsultas.getPlazoDevolucion() + " días");
    }
}