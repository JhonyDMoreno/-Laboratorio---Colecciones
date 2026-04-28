package taller;
import java. util.HashSet;

public class bibliotecaLibros {
    // Definimos el HashSet
    private HashSet<String> coleccionLibros = new HashSet<>();

    // 1. Agregar libros (HashSet ignora duplicados automáticamente)
    public void agregarLibro(String titulo) {
        if (coleccionLibros.add(titulo)) {
            System.out.println("Libro agregado: " + titulo);
        } else {
            System.out.println("El libro '" + titulo + "' ya está en la biblioteca (duplicado).");
        }
    }

    // 2. Mostrar todos los libros
    public void mostrarBiblioteca() {
        if (coleccionLibros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("\n--- Catálogo de la Biblioteca ---");
            for (String libro : coleccionLibros) {
                System.out.println("- " + libro);
            }
        }
    }

    // 3. Verificar si un libro está disponible
    public void buscarLibro(String titulo) {
        if (coleccionLibros.contains(titulo)) {
            System.out.println("Resultado: El libro '" + titulo + "' está disponible.");
        } else {
            System.out.println("Resultado: El libro '" + titulo + "' no se encuentra.");
        }
    }

    // 4. Contar el número total de libros únicos
    public void mostrarTotalLibros() {
        System.out.println("Total de libros únicos: " + coleccionLibros.size());
    }
}
