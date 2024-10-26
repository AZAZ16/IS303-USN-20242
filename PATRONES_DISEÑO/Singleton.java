
public class Singleton {
    // Atributo estático para almacenar la única instancia de la clase
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias externas
    private Singleton() {
        // Inicialización
    }

    // Método estático para obtener la instancia única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Crea la instancia si no existe
        }
        return instance;
    }

    // Método de ejemplo
    public void mostrarMensaje() {
        System.out.println("Hola desde el Singleton!");
    }
}

// Uso del patrón Singleton
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Comprobando si ambas referencias apuntan a la misma instancia
        System.out.println(singleton1 == singleton2);  // true

        singleton1.mostrarMensaje();  // Salida: Hola desde el Singleton!
    }
}




//Este archivo se llama Main.java
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Comprobando si ambas referencias apuntan a la misma instancia
        System.out.println(singleton1 == singleton2);  // true

        singleton1.mostrarMensaje();  // Salida: Hola desde el Singleton!
    }
}
