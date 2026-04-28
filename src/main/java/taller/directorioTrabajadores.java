package taller;
import java.util.HashMap;
import java.util.Map;

public class directorioTrabajadores {
    // Definimos el HashMap: Clave como String: nombre y Valor  como Double: salario
    private HashMap<String, Double> nomina = new HashMap<>();

    // Agregar trabajadores
    public void agregarTrabajador(String nombre, Double salario) {
        nomina.put(nombre, salario);
        System.out.println("Trabajador registrado: " + nombre + " con salario: $" + salario);
    }

    // Mostrar todos los trabajadores y sus salarios
    public void mostrarNomina() {
        if (nomina.isEmpty()) {
            System.out.println("El directorio está vacío.");
        } else {
            System.out.println("\n--- Directorio de Trabajadores ---");
            // Usamos un entrySet para recorrer clave y valor al mismo tiempo
            for (Map.Entry<String, Double> empleado : nomina.entrySet()) {
                System.out.println("Empleado: " + empleado.getKey() + " | Salario: $" + empleado.getValue());
            }
        }
    }

    // Actualizar el salario de un trabajador específico
    public void actualizarSalario(String nombre, Double nuevoSalario) {
        if (nomina.containsKey(nombre)) {
            nomina.put(nombre, nuevoSalario); // .put sobre una clave existente, reemplaza el valor
            System.out.println("Salario actualizado para " + nombre + ": $" + nuevoSalario);
        } else {
            System.out.println("Error: El trabajador '" + nombre + "' no existe.");
        }
    }

    //  Calcular el salario promedio
    public void mostrarSalarioPromedio() {
        if (nomina.isEmpty()) {
            System.out.println("No hay trabajadores para calcular el promedio.");
            return;
        }

        double sumaTotal = 0;
        for (Double salario : nomina.values()) {
            sumaTotal += salario;
        }
        double promedio = sumaTotal / nomina.size();
        System.out.println("El salario promedio de la empresa es: $" + promedio);
    }
}
