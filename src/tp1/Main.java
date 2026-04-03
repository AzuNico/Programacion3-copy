package ProgramacionIII.tp1;

public class Main {
    public static void main(String[] args) {

        ejecutarEjercicio6();

    }

    public static void ejecutarEjercicio5() {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        ejercicio5.ejecutar(Ejercicio5.Inciso.A);
        ejercicio5.ejecutar(Ejercicio5.Inciso.B);
    }

    public static void ejecutarEjercicio6() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.ejecutar();
    }
}