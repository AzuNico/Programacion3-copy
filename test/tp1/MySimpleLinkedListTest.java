package tp1;

import ProgramacionIII.tp1.MySimpleLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MySimpleLinkedListTest {

    @org.junit.jupiter.api.Test
    void insertFront() {
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        list.insertFront(10);
        assertEquals(10, list.get(0));  // el primero debe ser 10

        list.insertFront(20);
        assertEquals(20, list.get(0));  // al insertar al frente, 20 pasa a ser el primero
        assertEquals(10, list.get(1));  // 10 queda segundo
    }

    @org.junit.jupiter.api.Test
    void extractFront() {
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);

        // obtengo 30 al sacar el ultimo insertado
        int info = list.extractFront();
        int size = list.getSize();
        assertEquals(30, info);
        assertEquals(2, size);
    }

    @org.junit.jupiter.api.Test
    void extractFront_EmptyList() {
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        Integer info = list.extractFront();
        assertNull(info);
    }


    @org.junit.jupiter.api.Test
    void isEmpty() {
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        boolean info = list.isEmpty();
        boolean expected = true;

        assertEquals(expected, info);
    }

    @org.junit.jupiter.api.Test
    void get() {

        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        list.insertFront(10); // 1
        list.insertFront(20); // 0

        Integer info = list.get(1);
        Integer expected = 10;
        assertEquals(expected, info);

    }

    @org.junit.jupiter.api.Test
    void getSize() {
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);

        int size = list.getSize();
        int expected = 3;
        assertEquals(expected, size);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);

        String str = list.toString();
        String expected = "[30, 20, 10]";
        assertEquals(expected, str);

    }

    @org.junit.jupiter.api.Test
    void indexOf_Exists(){
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        list.insertFront(10);
        list.insertFront(20);
        int index = list.indexOf(10);
        int expected = 1;

        assertEquals(expected, index);

    }

    @org.junit.jupiter.api.Test
    void indexOf_NoExists(){
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        list.insertFront(10);

        int index = list.indexOf(100);
        int expected = -1;

        assertEquals(expected, index);

    }

    @org.junit.jupiter.api.Test
    void indexOf_EmptyList(){
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        int index = list.indexOf(100);
        int expected = -1;

        assertEquals(expected, index);

    }

    @org.junit.jupiter.api.Test
    void iterable(){
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);



    }
}