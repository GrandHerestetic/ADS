package com.company.LinkedList;

public class LinkedListDemo<T> {
    private Node<T> head;

    public void addFirst(T t){
        Node<T> firstNote = new Node<>(t);
        firstNote.next = head;
        head = firstNote;
    }

    public void addLast(T t) {
        if(head == null) {
            head = new Node<>(t);
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(t);
    }

    public int get(T t){
        if (head == null){
            return -1;
        }

        if (head.value == t){
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null){
            ++result;
            if (currentNode.next.value == t){
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void remove(T t){
        if(head == null){
            return;
        }
        if(head == t) {
            head = head.next;
            return;
        }
        Node<T> currentNote = head;
        while(currentNote.next != null){
            if(currentNote.next.value == t){
                currentNote.next = currentNote.next.next;
                return;
            }
            currentNote = currentNote.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedListDemo{" +
                "head=" + head +
                '}';
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
