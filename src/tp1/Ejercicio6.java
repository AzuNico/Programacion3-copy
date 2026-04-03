package ProgramacionIII.tp1;

import ProgramacionIII.Ejercicio;

public class Ejercicio6 extends Ejercicio {

    public Ejercicio6() {
        super(6);
    }

    public void ejecutar() {
        MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<>();
        lista1.insertFront(1);
        lista1.insertFront(2);
        lista1.insertFront(3);
        lista1.insertFront(4);

        MySimpleLinkedList<Integer> lista2 = new MySimpleLinkedList<>();

        lista2.insertFront(3);
        lista2.insertFront(4);


        MySimpleLinkedList<Integer> diff = ListUtils.diff(lista1, lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Diferencia: " + diff);


    }
}
