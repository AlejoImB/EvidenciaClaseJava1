package clase4;

// Definición de la interfaz Vehiculo
interface Vehiculo {
    void acelerar(int velocidad);
    void frenar();
}

// Implementación de la interfaz Vehiculo en la clase Coche
class Coche implements Vehiculo {
    private int velocidad;

    public Coche() {
        this.velocidad = 0;
    }

    @Override
    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("El coche está acelerando. Velocidad actual: " + this.velocidad + " km/h");
    }

    @Override
    public void frenar() {
        this.velocidad = 0;
        System.out.println("El coche ha frenado. Velocidad actual: " + this.velocidad + " km/h");
    }
}

// Clase Main para probar la implementación
 class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.acelerar(60);
        coche.frenar();
    }
}
