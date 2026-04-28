
public  static void  main(String[] args){
    GestionTareas app= new GestionTareas();

    //agregar Tareas
    app.agregarTareas("Estudiar JAVA");
    app.agregarTareas("Ir a entrenar");
    app.agregarTareas("Comprar comida Max");

    //mostrar tareas
    app.mostrarTareas();

    //completar la segunda tarea indice 1 "Ir a entrenar"
    app.completarTarea(1);
    
    //verificar el restado final
    app.mostrarTareas();
    app.mostrarTotalPendientes();

}