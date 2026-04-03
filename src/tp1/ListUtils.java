package ProgramacionIII.tp1;

import java.util.Iterator;

public class ListUtils {

    public static <T extends Comparable<T>> MySimpleLinkedList<T> ordenar(MySimpleLinkedList<T> lista) {
        if (lista == null || lista.getSize() <= 1) {
            return lista;
        }
        
        MySimpleLinkedList<T> result = copy(lista);
        
        Node<T> i = result.getFirst();
        while (i != null) {
            Node<T> j = i;
            T min = j.getInfo();
            Node<T> minNode = j;
            while (j != null) {
                if (j.getInfo().compareTo(min) < 0) {
                    min = j.getInfo();
                    minNode = j;
                }
                j = j.getNext();
            }
            minNode.setInfo(i.getInfo());
            i.setInfo(min);
            i = i.getNext();
        }
        
        return result;
    }

    public static <T extends Comparable<T>> MySimpleLinkedList<T> 
            intersectUnordered(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
        return ordenar(intersect(lista1, lista2));
    }

    public static <T extends Comparable<T>> MySimpleLinkedList<T> 
            intersectOrdered(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
        return intersectUnordered(lista1, lista2);
    }

    private static <T extends Comparable<T>> MySimpleLinkedList<T> 
            intersect(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
        MySimpleLinkedList<T> result = new MySimpleLinkedList<>();
        
        if (lista1 == null || lista2 == null || lista1.isEmpty() || lista2.isEmpty()) {
            return result;
        }
        
        for (T elem1 : lista1) {
            if (!result.contains(elem1) && lista2.contains(elem1)) {
                result.insertFront(elem1);
            }
        }
        
        return result;
    }

    private static <T extends Comparable<T>> MySimpleLinkedList<T>  copy(MySimpleLinkedList<T> original){
        MySimpleLinkedList<T> copy = new MySimpleLinkedList<>();

        Node<T> current = original.getFirst();

        while (current != null) {
            copy.insertFront(current.getInfo());
            current = current.getNext();
        }

        return copy;
    }
}
