public interface Producto {
    void usar();
}
// ProductoA.java
public class ProductoA implements Producto {
    public void usar() {
        System.out.println("Usando Producto A");
    }
}

// ProductoB.java
public class ProductoB implements Producto {
    public void usar() {
        System.out.println("Usando Producto B");
    }
}
// Creador.java
public abstract class Creador {
    public abstract Producto crearProducto();
}
// CreadorA.java
public class CreadorA extends Creador {
    public Producto crearProducto() {
        return new ProductoA();
    }
}

// CreadorB.java
public class CreadorB extends Creador {
    public Producto crearProducto() {
        return new ProductoB();
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        Creador creador = new CreadorA(); // Cambiar a CreadorB para otro producto
        Producto producto = creador.crearProducto();
        producto.usar(); // Salida: Usando Producto A
    }
}

