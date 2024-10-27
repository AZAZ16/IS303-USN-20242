public interface Vehiculo {
    void mostrarTipo();
}
//Motor.java
public interface Motor {
    void mostrarTipo();
}
//CocheElectrico.java
public class CocheElectrico implements Vehiculo {
    public void mostrarTipo() {
        System.out.println("Coche Eléctrico");
    }
}
//MotoElectrica.java
public class MotoElectrica implements Vehiculo {
    public void mostrarTipo() {
        System.out.println("Moto Eléctrica");
    }
}
//CocheCombustion.java
public class CocheCombustion implements Vehiculo {
    public void mostrarTipo() {
        System.out.println("Coche de Combustión");
    }
}
//MotoCombustion.java
public class MotoCombustion implements Vehiculo {
    public void mostrarTipo() {
        System.out.println("Moto de Combustión");
    }
}
//MotorElectrico.java
public class MotorElectrico implements Motor {
    public void mostrarTipo() {
        System.out.println("Motor Eléctrico");
    }
}
//MotorCombustion.java
public class MotorCombustion implements Motor {
    public void mostrarTipo() {
        System.out.println("Motor de Combustión");
    }
}
//VehiculoFactory.java
public interface VehiculoFactory {
    Vehiculo crearVehiculo();
    Motor crearMotor();
}
//FabricaVehiculoElectrico.java
public class FabricaVehiculoElectrico implements VehiculoFactory {
    public Vehiculo crearVehiculo() {
        return new CocheElectrico();
    }

    public Motor crearMotor() {
        return new MotorElectrico();
    }
}
//FabricaVehiculoCombustion.java
public class FabricaVehiculoCombustion implements VehiculoFactory {
    public Vehiculo crearVehiculo() {
        return new CocheCombustion();
    }

    public Motor crearMotor() {
        return new MotorCombustion();
    }
}
//AplicacionVehiculos.java
public class AplicacionVehiculos {
    private Vehiculo vehiculo;
    private Motor motor;

    public AplicacionVehiculos(VehiculoFactory factory) {
        this.vehiculo = factory.crearVehiculo();
        this.motor = factory.crearMotor();
    }

    public void mostrarDetalles() {
        vehiculo.mostrarTipo();
        motor.mostrarTipo();
    }
}
//Main.java
public class Main {
    public static void main(String[] args) {
        VehiculoFactory factory;

        String tipoVehiculo = "electrico"; // Cambiar a "combustion" para vehículos de combustión

        if (tipoVehiculo.equalsIgnoreCase("electrico")) {
            factory = new FabricaVehiculoElectrico();
        } else {
            factory = new FabricaVehiculoCombustion();
        }

        AplicacionVehiculos app = new AplicacionVehiculos(factory);
        app.mostrarDetalles();
    }
}
