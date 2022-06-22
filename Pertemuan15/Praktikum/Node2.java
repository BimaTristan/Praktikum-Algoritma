package Praktikum;

public class Node2 {
    int data;
    Node prev, next;

    Node2(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}