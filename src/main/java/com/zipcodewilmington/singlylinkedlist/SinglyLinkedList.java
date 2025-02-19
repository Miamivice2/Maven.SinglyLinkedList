package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    public int size;
    Node<T> head;
    public void add(T value) {
        if( head == null){
            head = new Node<T>(value);
        }else {
            Node<T> current = head;
            while (current.getNext()!= null){
                current = current.getNext();
            }
            current.setNext(new Node<T>(value));
        }
    }

    public boolean contains(T expected) {
        Node<T> current = head;
        while(current != null){
            if(current.getData().equals(expected)){
                return true;
            }
            current = current.getNext();
        }
        return false;

    }

    public void remove(T expected) {
        T test = null;
        if(head.getData().equals(test)){
            head = head.next;
            return;
        }


    }

    public int find(T val) {
        int counter = 0;
        Node<T> current = head;
        while(current != null){
            if(current.getData().equals(val)){
                return counter;
            }
            counter++;
            current = current.next;
        }
        return -1;
    }

    public int size() {
        int count = 1;
        Node<T> current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
            return count;
    }

    public T get(int idx) {
        Node<T> current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        return current.getData();
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> list = new SinglyLinkedList<>();
        Node<T> current = head;

        while(current != null){
            list.add(current.getData());
            current = current.next;
        }

        return list;
    }

    public void sort() {
    }
}
