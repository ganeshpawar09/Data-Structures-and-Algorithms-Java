
public class Implementation {
    public static void main(String[] args) {
        DLL<Integer> a = new DLL<>();
        a.insertAtHead(10);
        a.insertAtHead(20);
        a.insertAtHead(30);
        a.insertAtHead(40);
        a.insertAtTail(1);
        a.insertAtTail(2);
        a.insertAtTail(3);
        a.insertAtTail(5);
        a.printDLL();
        a.printReverseDLL();
    }

}

class DLL<T> {
    private Node<T> head;
    private Node<T> tail;

    DLL() {
        this.head = null;
        this.tail = null;
    }

    void insertAtHead(T value) {
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }

    void insertAtTail(T value) {
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    void printDLL() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "  ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    void printReverseDLL() {
        Node<T> temp = tail;
        while (temp != null) {
            System.out.print(temp.getData() + "  ");
            temp = temp.getPrev();
        }
        System.out.println();
    }
}

class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    Node() {
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    void setData(T data) {
        this.data = data;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    T getData() {
        return data;
    }

    Node<T> getNext() {
        return next;
    }

    Node<T> getPrev() {
        return prev;
    }
}
