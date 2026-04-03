package ProgramacionIII.tp1;

import java.util.Arrays;

public class Ejercicio5 {

    public enum Inciso {
        A,
        B
    }

    public Ejercicio5() {
        System.out.println("*********************");
        System.out.println("EJERCICIO 5");
        System.out.println("*********************");
    }

    public void ejecutar(Inciso inciso) {
        switch (inciso) {
            case A:
                ejecutarIncisoA();
                break;
            case B:
                ejecutarIncisoB();
                break;
        }
    }

    private void ejecutarIncisoA() {
        System.out.println("*********************");
        System.out.println("Inciso A");
        System.out.println("*********************");
        MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<>();
        lista1.insertFront(3);
        lista1.insertFront(1);
        lista1.insertFront(5);
        lista1.insertFront(2);

        MySimpleLinkedList<Integer> lista2 = new MySimpleLinkedList<>();
        lista2.insertFront(6);
        lista2.insertFront(2);
        lista2.insertFront(1);
        lista2.insertFront(8);

        System.out.println("Lista 1 (desordenada): " + lista1);
        System.out.println("Lista 2 (desordenada): " + lista2);

        MySimpleLinkedList<Integer> resultado = ListUtils.intersectUnordered(lista1, lista2);
        System.out.println("Interseccion (ordenada): " + resultado);
    }

    private void ejecutarIncisoB() {
        System.out.println("*********************");
        System.out.println("Inciso B");
        System.out.println("*********************");
        MySimpleLinkedList<Integer> lista1Ord = new MySimpleLinkedList<>();

        lista1Ord.insertFront(5);
        lista1Ord.insertFront(3);
        lista1Ord.insertFront(2);
        lista1Ord.insertFront(1);

        MySimpleLinkedList<Integer> lista2Ord = new MySimpleLinkedList<>();
        lista2Ord.insertFront(6);
        lista2Ord.insertFront(3);
        lista2Ord.insertFront(2);

        System.out.println("Lista 1 (ordenada): " + lista1Ord);
        System.out.println("Lista 2 (ordenada): " + lista2Ord);

        MySimpleLinkedList<Integer> resultado = ListUtils.intersectOrdered(lista1Ord, lista2Ord);
        System.out.println("Interseccion (ordenada): " + resultado);
    }
}
