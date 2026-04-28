import taller.bibliotecaLibros;
import taller.directorioTrabajadores;

public static void main(String[] args) {
    /* GestionTareas app = new GestionTareas();

    // agregar Tareas
    app.agregarTareas("Estudiar JAVA");
    app.agregarTareas("Ir a entrenar");
    app.agregarTareas("Comprar comida Max");

    // mostrar tareas
    app.mostrarTareas();

    // completar la segunda tarea indice 1 "Ir a entrenar"
    app.completarTarea(1);

    // verificar el estado final
    app.mostrarTareas();
    app.mostrarTotalPendientes();
    */
    System.out.println("\n" + "=".repeat(30));

    // --- Prueba del Punto 2 (HashSet) ---
   /* bibliotecaLibros miBiblioteca = new bibliotecaLibros();

    miBiblioteca.agregarLibro("El resplandor");
    miBiblioteca.agregarLibro("Drácula");
    miBiblioteca.agregarLibro("El resplandor"); // Intento de duplicado

    miBiblioteca.mostrarBiblioteca();
    miBiblioteca.buscarLibro("Drácula");
    miBiblioteca.mostrarTotalLibros();

}*/
    System.out.println("\n" + "=".repeat(30));
    // --- Prueba del Punto 3 (HashMap) ---
    directorioTrabajadores miEmpresa = new directorioTrabajadores();

    // 1. Agregar
    miEmpresa.agregarTrabajador("Jhony", 2500.0);
    miEmpresa.agregarTrabajador("Yessica", 3000.0);
    miEmpresa.agregarTrabajador("Brayan", 2200.0);

    // 2. Mostrar
    miEmpresa.mostrarNomina();

    // 3. Actualizar
    miEmpresa.actualizarSalario("Jhony", 2800.0);

    // 4. Promedio
    miEmpresa.mostrarSalarioPromedio();
}