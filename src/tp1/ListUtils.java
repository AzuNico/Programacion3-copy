package ProgramacionIII.tp1;

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
    mergeUnordered(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
        return ordenar(merge(lista1, lista2));
    }

    public static <T extends Comparable<T>> MySimpleLinkedList<T>
    mergeOrdered(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
        return mergeUnordered(lista1, lista2);
    }

    public static <T extends Comparable<T>> MySimpleLinkedList<T>
    merge(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
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

    public static <T extends Comparable<T>> MySimpleLinkedList<T>  copy(MySimpleLinkedList<T> original){
        MySimpleLinkedList<T> copy = new MySimpleLinkedList<>();

        Node<T> current = original.getFirst();

        while (current != null) {
            copy.insertFront(current.getInfo());
            current = current.getNext();
        }

        return copy;
    }

    /**
     * Crea una nueva lista con los elementos que están en la
     * primera pero no en la segunda
     */
    public static <T extends Comparable<T>> MySimpleLinkedList<T> diff(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2) {
        MySimpleLinkedList<T> result = new MySimpleLinkedList<>();
        if (lista1 == null || lista2 == null || lista1.isEmpty() || lista2.isEmpty()) {
            return result;
        }

        for (T elem1 : lista1) {
            if (!result.contains(elem1) && !lista2.contains(elem1)) {
                result.insertFront(elem1);
            }
        }
        return result;
    }
}
