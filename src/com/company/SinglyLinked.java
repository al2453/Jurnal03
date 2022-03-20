package com.company;

import java.util.NoSuchElementException;

public class SinglyLinked<E>{
    private Node<E> firstNode;
    private Node<E> lastNode;
    private String name;

    public SinglyLinked() {
        this("linked list");
    }

    public SinglyLinked(String listName) {
        this.name = listName;
        this.firstNode = this.lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        Node newNode = new Node(insertItem);
        if (this.isEmpty()) {
            this.firstNode = this.lastNode = new Node(insertItem);
        } else {
            newNode.next = this.firstNode;
            this.firstNode = newNode;
        }

    }

    public void insertAtBack(E insertItem) {
        Node newNode = new Node(insertItem);
        if (this.isEmpty()) {
            this.firstNode = this.lastNode = new Node(insertItem);
        } else {
            this.lastNode.next = newNode;
            this.lastNode = newNode;
        }

    }

    public E removeFromBack() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException(this.name + " is empty");
        } else {
            E removedItem = this.lastNode.data;
            if (this.firstNode == null) {
                this.firstNode = this.lastNode = null;
            } else {
                Node current;
                for(current = this.firstNode; current.next != this.lastNode; current = current.next) {
                }

                this.lastNode = current;
                current.next = null;
            }

            return removedItem;
        }
    }

    public E removeFromFront() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException(this.name + " is empty");
        } else {
            E removedItem = this.firstNode.data;
            if (this.firstNode != null) {
                new Node(this.firstNode);
                this.firstNode = this.firstNode.next;
                Object var2 = null;
            }

            return removedItem;
        }
    }

    private boolean isEmpty() {
        return this.firstNode == null;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.printf("Empty %s%n", this.name);
        } else {
            System.out.printf("The %s is: %n", this.name);

            for(Node current = this.firstNode; current != null; current = current.next) {
                System.out.printf("%s ", current.data);
            }

        }
    }
}
