package org.example;

import  java.util.ArrayList;     // Import la class ArrayList;

public class GestionTareas {
    // define la lista de tareas
    private ArrayList<String>listaTareas= new ArrayList<>();

    //Agregar tareas

    public void agregarTareas(String tarea) {
        listaTareas.add(tarea);
        System.out.println("Tarea agregada: "+ tarea);
    }

    //Mostrar todas las tareas
    public void mostrarTareas(){
        if (listaTareas.isEmpty()){
            System.out.println("La lista esta vacía");

        }else {
            System.out.println("\n=== Lista de Tareas Pendientes ===");
            for (int i=0; i< listaTareas.size(); i++){
                //suma 1 al indice para que se entienda mas facil
                System.out.println((i+1) + "."+listaTareas.get(i));
            }
        }
    }

    public void completarTarea(int indice){
        //validar que el indice exista
        if (indice>=0 && indice<listaTareas.size()){
            String eliminada = listaTareas.remove(indice);
            System.out.println("Completado.. se eleminó: "+ eliminada);
        }else{
            System.out.println("Error!... el numero de tarea no es valido");
        }
    }

    public  void mostrarTotalPendientes(){
        System.out.println("Total tareas pendientes: " +listaTareas.size());
    }
}

