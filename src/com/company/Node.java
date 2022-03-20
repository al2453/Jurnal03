package com.company;

public class Node <E>{
    E data;
    Node<E> next;

    public Node(E object) {
        this.data = object;
        this.next = null;
    }

    public E getData() {
        return this.data;
    }
}
