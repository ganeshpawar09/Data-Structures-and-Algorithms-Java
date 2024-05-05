import java.util.Scanner;

public class Implementaton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LL<Integer> rollNo = new LL<>();
        rollNo.insertAtHead(10);
        rollNo.insertAtHead(120);
        rollNo.insertAtHead(104);
        rollNo.insertAtHead(105);
        rollNo.insertAtTail(1);
        rollNo.insertAtTail(2);
        rollNo.insertAtTail(3);
        rollNo.printLL();

        sc.close();
    }

}



class LL<T> {
    private Node<T> head;
    private Node<T> tail;

    LL() {
        this.head = null;
        this.tail = null;
    }

    void insertAtHead(T value) {
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    void insertAtTail(T value) {
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    void printLL() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    Node<t>
}



class Node<T> {

    private T data;
    private Node<T> next;

    Node() {
        this.data = null;
        this.next = null;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    T getData() {
        return data;
    }

    void setData(T data) {
        this.data = data;
    }

}