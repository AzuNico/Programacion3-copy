package ProgramacionIII.tp1;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T> {

    private Node<T> first;
    private int size;

    public MySimpleLinkedList() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info, null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }

    public T extractFront() {
        if (this.first == null) {
            return null;
        }
        T tempData = this.first.getInfo();
        this.first = this.first.getNext();
        if (this.size > 0) {
            this.size--;
        }
        return tempData;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public T get(int index) {
        Node<T> current = this.first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getInfo();
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node<T> current = this.first;
        for (int i = 0; i < this.size; i++) {
            str.append(current.getInfo());
            if (i != this.size - 1) {
                str.append(", ");
            }
            current = current.getNext();
        }
        str.append("]");
        return str.toString();
    }

    public boolean contains(T info) {
        return indexOf(info) != -1;
    }

    public Node<T> getFirst() {
        return this.first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public int indexOf(T info) {
        Node<T> current = this.first;
        int index = 0;

        while (current != null) {
            if (current.getInfo().equals(info)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this.first);
    }
}